#! /usr/bin/python3

import cv2,os
import numpy as np
import facedetection as fd
import sqliteconnect as sc

def FaceRecognitionInit():
    global face_recognizer
    face_recognizer = cv2.face.LBPHFaceRecognizer_create()
    face_recognizer.read("trainedModels.yml")


def FaceRecognition(img,type):
    # Debug 0 or 1
    plssetmetoone=0


	# webcamler pek kaliteli görüntü vermiyor diye webcam üzerinde kullanılacaksa video seçeneği seçilecek ve tutarlılık daha düşük bir eşiğe sahip olacak
    min_conf = 45 if type=="video" else 30

    faces_found,grey_img=fd.FaceDetection(img)

    if plssetmetoone == 1:
        print("Faces found:",faces_found)

    faces=[]

    for face in faces_found:
        (x,y,w,h)=face
        roi_grey=grey_img[y:y+h,x:x+h]
        id,conf = face_recognizer.predict(roi_grey)

        if plssetmetoone == 1:
            print("id:",id,"confidence:",conf)

        #yüzleri kare içerisine alma kısmı
        cv2.rectangle(img,(x,y),(x+w,y+h),(255,0,0),4)

        data=id,conf,np.array(face)
        faces.append(data)


    id_list=sc.get_id_list()

    if plssetmetoone == 1:
        print("id list:",id_list)

    tmp_faces=faces

    max_conf=[]

    for i in id_list:
        conf_list=[]
        for facedata in tmp_faces:
            if int(i) == facedata[0]:
                conf_list.append(facedata[1])

        if plssetmetoone == 1:
            print("ID:",i,"conf_list:",conf_list)

        max_conf.append(min(conf_list))

    if plssetmetoone == 1:
        print("max_conf:",max_conf)

    faces=[]

    for face in faces_found:
        (x,y,w,h)=face
        roi_grey=grey_img[y:y+h,x:x+h]
        id,conf = face_recognizer.predict(roi_grey)

        if(conf< min_conf) & (conf in max_conf):
            user_data = sc.get_id(id)
            print(sc.show_id_data(user_data))
            name = user_data[1]
            cv2.putText(img,name,(x,y),cv2.FONT_HERSHEY_DUPLEX,2,(255,0,0),4)
        else:
            cv2.putText(img,"unkonown",(x,y),cv2.FONT_HERSHEY_DUPLEX,2,(255,0,0),4)


    img=cv2.resize(img,(1000,1000))
    return img
