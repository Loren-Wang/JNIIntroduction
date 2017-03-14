package com.jniintroduction.android;

/**
 * Created by wangliang on 0014/2017/3/14.
 * 创建时间： 0014/2017/3/14 14:11
 * 创建人：王亮（Loren wang）
 * 功能作用：
 * 思路：
 * 修改人：
 * 修改时间：
 * 备注：
 */

public class HelloWorld {
    static{
        System.loadLibrary("hello");//defaultConfig.ndk.moduleName
    }

    //jni中相应的方法
    public native String getString();
}
