package com.example.zhangyuanke.helloandroid.Module.HA1UI;

import android.os.Bundle;

import com.example.zhangyuanke.helloandroid.R;
import com.example.zhangyuanke.helloandroid.Tools.BaseActivity;

public class HA1Layout extends BaseActivity {

    // android:layout_gravity="" 用于指定控件在布局中的对齐方式：当线性布局是vertical时，水平方向的设置生效
    // android:gravity=""用于指定文字在控件中的对齐方式
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha1_layout);
    }
}
