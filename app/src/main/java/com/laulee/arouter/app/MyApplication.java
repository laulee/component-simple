package com.laulee.arouter.app;

import com.laulee.base.app.BaseApplication;
import com.laulee.login.app.LoginAppLogicInit;
import com.laulee.order.app.OrderLogicInit;

/**
 * Created by laulee on 2020-01-19.
 */
public class MyApplication extends BaseApplication {

    @Override
    protected void initLogic() {
        registerAppLogic(AppLogicInit.class);
        registerAppLogic(LoginAppLogicInit.class);
        registerAppLogic(OrderLogicInit.class);
    }
}
