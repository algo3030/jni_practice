#include <jni.h>
#include "space_algolab_field_JavaVariables.h"

JNIEXPORT void JNICALL Java_space_algolab_field_JavaVariables_setPrivateNum(JNIEnv *env, jobject thiz, jint value)
{
  // インスタンスからクラス情報(jclass)を取得
  jclass clazz = env->GetObjectClass(thiz);
  // クラス情報からフィールド情報(jfieldId)を取得
  jfieldID fid = env->GetFieldID(clazz, "privateNum", "I");
  // フィールド情報からオブジェクトのインスタンス変数への書き込み
  env->SetIntField(thiz, fid, value);
}

JNIEXPORT void JNICALL Java_space_algolab_field_JavaVariables_setStaticPrivateNum(JNIEnv *env, jobject thiz, jint value)
{
  // インスタンスからクラス情報(jclass)を取得
  jclass clazz = env->GetObjectClass(thiz);
  // クラス情報からフィールド情報(jfieldId)を取得
  jfieldID fid = env->GetStaticFieldID(clazz, "staticPrivateNum", "I");
  // フィールド情報からスタティック変数へ書き込み
  env->SetStaticIntField(clazz, fid, value);
}