package com.example.zhangyuanke.helloandroid.Module.HA1UI;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.zhangyuanke.helloandroid.Tools.BaseActivity;
import com.example.zhangyuanke.helloandroid.Tools.HelloAndroidUtil;
import com.example.zhangyuanke.helloandroid.Tools.LogUtil;

public class HA1Layout extends BaseActivity {

    // android:layout_gravity="" 用于指定控件在布局中的对齐方式：当线性布局是vertical时，水平方向的设置生效
    // android:gravity=""用于指定文字在控件中的对齐方式
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ha1_layout);
        setupUI();
    }

    private void setupUI()
    {
        // 线性布局
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        /*
        *   <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="button1" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="button2" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="button3" />
    </LinearLayout>
    */
        LinearLayout linearLayout1 = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayout1.setLayoutParams(layoutParams1);
        linearLayout1.setOrientation(LinearLayout.HORIZONTAL);

        // button 1
        LinearLayout.LayoutParams lp_btn1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        Button button1 = new Button(this);
        button1.setText("btn1");
        button1.setLayoutParams(lp_btn1);
        linearLayout1.addView(button1);

        // button 2
        LinearLayout.LayoutParams lp_btn2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        Button button2 = new Button(this);
        button2.setText("btn2");
        button2.setLayoutParams(lp_btn2);
        linearLayout1.addView(button2);

        // button 3
        LinearLayout.LayoutParams lp_btn3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        Button button3 = new Button(this);
        button3.setText("btn3");
        button3.setLayoutParams(lp_btn3);
        linearLayout1.addView(button3);
        // add lineLayout1
        linearLayout.addView(linearLayout1);

        /*
        *  <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="200dp">
        <Button
            android:id="@+id/ha1_layout_button3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="button3"
            android:layout_centerInParent="true"
            />
        <Button
            android:id="@+id/ha1_layout_button1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_above="@id/ha1_layout_button3"
            android:layout_toLeftOf="@id/ha1_layout_button3"
            android:text="button1"
            />
        <Button
            android:id="@+id/ha1_layout_button2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_above="@id/ha1_layout_button3"
            android:layout_toRightOf="@id/ha1_layout_button3"
            android:text="button2"
            />
        <Button
            android:id="@+id/ha1_layout_button4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/ha1_layout_button3"
            android:layout_toLeftOf="@id/ha1_layout_button3"
            android:text="button4"
            />
        <Button
            android:id="@+id/ha1_layout_button5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/ha1_layout_button3"
            android:layout_toRightOf="@id/ha1_layout_button3"
            android:text="button5"
            />


    </RelativeLayout>
        * */

//        HelloAndroidUtil.dip2px(this,200);

        // http://blog.csdn.net/u012246458/article/details/53464566
        /*
        *解决方案一：API17 android4.2.1
        * tv_leftBtn_title.setId(View.generateViewId());
        *
        *
        * */

//        LogUtil.d("tag"," " + R.id.ha1_layout_button1);//2131230722
//        LogUtil.d("tag"," " + R.id.ha1_layout_button2);
//        LogUtil.d("tag"," " + R.id.ha1_layout_button3);
//
//        for (int i = 0; i < 10; i++) {
//            int  h= HelloAndroidUtil.generateViewId();
//            LogUtil.d("tag"," " + h);
//        }


        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, HelloAndroidUtil.dip2px(this,200));
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setBackgroundColor(0x88ff0000);
        // button3
        RelativeLayout.LayoutParams lp_btn_3 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lp_btn_3.addRule(RelativeLayout.CENTER_IN_PARENT);

        Button btn3 = new Button(this);
        btn3.setLayoutParams(lp_btn_3);
        int btn3_id = HelloAndroidUtil.generateViewId();
        LogUtil.d("tag"," " + btn3_id);
        btn3.setId(btn3_id);
        btn3.setText("btn3");
        relativeLayout.addView(btn3);

        // button1

        RelativeLayout.LayoutParams lp_btn_1 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lp_btn_1.addRule(RelativeLayout.ABOVE,btn3_id);
        lp_btn_1.addRule(RelativeLayout.ALIGN_LEFT,btn3_id);

        Button btn1 = new Button(this);
        btn3.setLayoutParams(lp_btn_1);
//        int btn1_id = HelloAndroidUtil.generateViewId();
//        LogUtil.d("tag"," " + btn3_id);
        btn3.setId(btn3_id);// 设置相同的id
        btn3.setText("btn1");
        relativeLayout.addView(btn1);


        // add
        linearLayout.addView(relativeLayout);

        setContentView(linearLayout);
    }
}
