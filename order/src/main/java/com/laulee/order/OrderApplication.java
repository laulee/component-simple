package com.laulee.order;

import com.laulee.base.app.BaseApplication;
import com.laulee.order.app.OrderLogicInit;

/**
 * Created by laulee on 2020-01-19.
 */
public class OrderApplication extends BaseApplication {
    @Override
    protected void initLogic() {
        registerAppLogic(OrderLogicInit.class);
    }
}
