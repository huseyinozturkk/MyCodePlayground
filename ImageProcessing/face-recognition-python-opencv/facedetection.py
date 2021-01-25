#! /usr/bin/python3

import cv2,os
import numpy as np

# Yüzün algılanması
# Detecting the face

def FaceDetection(img):
    grey_img = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
    cascade = cv2.CascadeClassifier("haarcascade/haarcascade_frontalface_default.xml")
    faces=cascade.detectMultiScale(grey_img,scaleFactor = 1.3, minNeighbors = 5)
    return faces,grey_img



# Açıklanacak
##Scale Factor ?
##minNeighbors ?
