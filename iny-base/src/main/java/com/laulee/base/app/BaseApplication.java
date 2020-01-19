package com.laulee.base.app;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laulee on 2020-01-19.
 */
public abstract class BaseApplication extends Application {

    private List<Class<? extends BaseAppLogic>> logicList = new ArrayList<>();

    private List<BaseAppLogic> logicClassList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        initLogic();
        logicCreate();
    }

    /**
     * 添加需要注册的module
     *
     * @param baseAppLogic
     */
    protected void registerAppLogic(Class<? extends BaseAppLogic> baseAppLogic) {
        logicList.add(baseAppLogic);
    }

    /**
     * 通过反射创建module的application
     */
    private void logicCreate() {
        for (Class<? extends BaseAppLogic> logic : logicList) {
            try {
                BaseAppLogic appLogic = logic.newInstance();
                logicClassList.add(appLogic);
                appLogic.setApplication(this);
                appLogic.onCreate();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 初始化
     */
    protected abstract void initLogic();

    @Override
    public void onTerminate() {
        super.onTerminate();
        for (BaseAppLogic baseAppLogic : logicClassList) {
            baseAppLogic.onTerminate();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (BaseAppLogic baseAppLogic : logicClassList) {
            baseAppLogic.onTrimMemory(level);
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (BaseAppLogic baseAppLogic : logicClassList) {
            baseAppLogic.onLowMemory();
        }
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        for (BaseAppLogic baseAppLogic : logicClassList) {
            baseAppLogic.onConfigurationChanged(newConfig);
        }
    }
}
