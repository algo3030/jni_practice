#include <jni.h>
#include "space_algolab_field_JavaVariablesSetter.h"

JNIEXPORT void JNICALL Java_space_algolab_field_JavaVariablesSetter_setPrivateNum(JNIEnv *env, jobject thiz, jobject javaVariablesObj, jint value)
{
    jclass clazz = env->GetObjectClass(javaVariablesObj);
    jfieldID fid = env->GetFieldID(clazz, "privateNum", "I");
    env->SetIntField(javaVariablesObj, fid, value);
}

JNIEXPORT void JNICALL Java_space_algolab_field_JavaVariablesSetter_setStaticPrivateNum(JNIEnv *env, jobject thiz, jobject javaVariablesObj, jint value)
{
    jclass clazz = env->GetObjectClass(javaVariablesObj);
    jfieldID fid = env->GetStaticFieldID(clazz, "staticPrivateNum", "I");
    env->SetStaticIntField(clazz, fid, value);
}