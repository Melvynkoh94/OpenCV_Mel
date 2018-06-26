package com.example.user.opencv_mel;

/**
 * Created by User on 26/6/2018.
 */

public class OpencvClass {
    public native static void faceDetection (long addrRgba);
}

//STUCK AT COMPILING THIS SHIT
//Can't seem to have a JNI folder created after running below code
//javah -d jni -classpath ../../build/intermediates/classes/debug com.example.user.opencv_mel.OpencvClass

//apparently my classpath in envr var is C:\Users\User\Documents\GitHub\OpenCV_Mel\app\src\main\jniLibs

//REFERENCE FROM:
// https://www.youtube.com/watch?v=flBlhnEd530&t=11s
