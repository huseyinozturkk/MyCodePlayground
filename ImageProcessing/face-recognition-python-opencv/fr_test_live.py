#! /usr/bin/python3

import cv2,os
import numpy as np
import facerecognition as fr

fr.FaceRecognitionInit()

cam = cv2.VideoCapture(0)

while True:

    ret,frame = cam.read()
    img = fr.FaceRecognition(frame,"video")

    cv2.imshow("face recognition",img)

    if cv2.waitKey(1) & 0xff == ord("q"):
        break

        
cam.release()
cv2.destroyAllWindows()