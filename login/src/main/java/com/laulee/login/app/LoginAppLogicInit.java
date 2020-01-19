package com.laulee.login.app;

import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;
import com.laulee.base.app.BaseAppLogic;

/**
 * Created by laulee on 2020-01-19.
 */
public class LoginAppLogicInit extends BaseAppLogic {

    @Override
    public void onCreate() {
        super.onCreate();
        // Print log
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(baseApplication);
    }
}