package com.laulee.login.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.laulee.res.path.RouterPath;
import com.laulee.login.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startLogin(View view) {

        ARouter.getInstance().build(RouterPath.LOGIN_PATH).navigation();
    }
}
