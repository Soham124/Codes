#pip install opencv-contrib-python
#pip install cvzone
#pip install pyautogui

import cv2
import pyautogui
from cvzone.HandTrackingModule import HandDetector

detector = HandDetector(detectionCon=0.5,maxHands=2)

cam = cv2.VideoCapture(0)

cam.set(3, 600)

cam.set(4, 400)

while True:
    success, frame = cam.read()
    img= cv2.flip(frame,1)
    hand,img = detector.findHands(img)

    if hand and hand [0]['type'] == "Left":
        fingers = detector.fingersUp(hand[0])
        totalFingers = fingers.count(1)
        cv2.putText(img, f'Fingers: {totalFingers}', (50, 50), cv2.FONT_HERSHEY_TRIPLEX, 2, (0, 255, 0), 2)
        # if totalFingers == 5:
        #  pyautogui.keyDown('right')
        #  pyautogui.keyUp('left')
        # if totalFingers == 1:
        #  pyautogui.keyDown('left')
        #  pyautogui.keyUp('right')
        # if totalFingers == 0:
        #  pyautogui.keyUp('left')
        #  pyautogui.keyUp('right')

        # Only click if we transition from not-1 finger to 1 finger
        if totalFingers == 1 and previous_fingers != 1:
            pyautogui.click()
        
        previous_fingers = totalFingers  # Update previous state

    cv2.imshow('Livefeed', img)
    cv2.waitKey(1)