#! /usr/bin/python3

import facedetection as fd
import os,colorama,cv2
from colorama import Fore
import numpy as np

if __name__ == "__main__":

    def Prepare_training_models(path):
        faces=[]
        faceID=[]

        colorama.init(autoreset=True)

        for path,subdirnames,filenames in os.walk(path):
            for filename in filenames:
                if filename.startswith("."):
                    print(Fore.YELLOW+"[.]File:",filename,"is a system file.Skipped")
                    continue
                id=os.path.basename(path)
                img_path=os.path.join(path,filename)
                print(">ID:",id,"IMG:",img_path)
                img=cv2.imread(img_path)
                if img is None:
                    print(Fore.RED+">>[?]Error at ",img_path)
                    continue
                face,grey_img=fd.FaceDetection(img)
                if len(face) != 1:
                    print(Fore.RED+">>[-]There is more than one face in img")
                    continue
                else:
                    print(Fore.GREEN+">>[+]Face trained in:",img_path)
                    pass
                    
                (x,y,w,h)=face[0]
                roi_grey=grey_img[y:y+w,x:x+h]
                faces.append(roi_grey)
                faceID.append(int(id))
        print(Fore.BLACK)       
        return faces,faceID

    #always make sure that there is more than one model to train if its not it gonna error like
    #       You'll need more than one sample to learn a model. in function 'train'
    def classifier(faces,faceID):
        face_recognizer = cv2.face.LBPHFaceRecognizer_create()
        face_recognizer.train(faces,np.array(faceID))
        return face_recognizer

    #Trainer
    face,faceID = Prepare_training_models("training_faces")
    face_recognizer = classifier(face,faceID)
    face_recognizer.write("trainedModels.yml")