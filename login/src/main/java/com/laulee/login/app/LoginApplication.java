package com.laulee.login.app;

import com.laulee.base.app.BaseApplication;

/**
 * Created by laulee on 2020-01-19.
 */
public class LoginApplication extends BaseApplication {

    @Override
    protected void initLogic() {
        registerAppLogic(LoginAppLogicInit.class);
    }
}
