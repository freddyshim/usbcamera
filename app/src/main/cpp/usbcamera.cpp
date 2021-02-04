#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_anookday_usbcamera_MainActivity_connect(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello";
    return env->NewStringUTF(hello.c_str());
}