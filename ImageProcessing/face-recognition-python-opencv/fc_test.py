#! /usr/bin/python3
import cv2
import numpy as np
import facerecognition as fr


test_img = cv2.imread("test_img/test1.jpg")
#test_img = cv2.imread("test_img/test2.jpg")


fr.FaceRecognitionInit()
result = fr.FaceRecognition(test_img,"photo")
cv2.imshow("face recognition test by photo",result)
cv2.waitKey(0)
cv2.destroyAllWindows()
