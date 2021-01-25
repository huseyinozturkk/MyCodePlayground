#! /usr/bin/python3

import facedetection as fd
import numpy as np
import cv2

#Burdan test istenilen görüntü ayarlanabilir
test_img = cv2.imread("test_img/test1.jpg")
faces,grey_img = fd.FaceDetection(test_img)

for (x,y,w,h) in faces:
    cv2.rectangle(test_img,(x,y),(x+w,y+w),(255,0,0),thickness=3)

resized=cv2.resize(test_img,(1000,700))
cv2.imshow("faces detected",resized)
cv2.waitKey(0)
cv2.destroyAllWindows()