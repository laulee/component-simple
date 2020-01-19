package com.laulee.login.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.laulee.res.path.RouterPath;
import com.laulee.login.R;

/**
 * Created by laulee on 2020-01-19.
 */

@Route(path = RouterPath.LOGIN_PATH)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
