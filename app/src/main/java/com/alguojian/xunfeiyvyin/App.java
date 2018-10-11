package com.alguojian.xunfeiyvyin;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/10/11
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=5bbeba36");
    }
}
