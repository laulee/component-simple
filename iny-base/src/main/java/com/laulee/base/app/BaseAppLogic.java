package com.laulee.base.app;

import android.content.res.Configuration;

import androidx.annotation.NonNull;

/**
 * Created by laulee on 2020-01-19.
 * 基础application处理类
 */
public class BaseAppLogic {

    public BaseAppLogic() {
    }

    protected BaseApplication baseApplication;

    public void setApplication(@NonNull BaseApplication baseApplication) {
        this.baseApplication = baseApplication;
    }

    public void onCreate() {

    }

    public void onTerminate() {

    }

    public void onTrimMemory(int level) {

    }

    public void onLowMemory() {

    }

    public void onConfigurationChanged(@NonNull Configuration newConfig) {

    }
}
