package com.example.zhangyuanke.helloandroid.Module.HA1UI;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhangyuanke.helloandroid.R;
import com.example.zhangyuanke.helloandroid.Tools.BaseActivity;
import com.example.zhangyuanke.helloandroid.Tools.HelloAndroidUtil;

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
//        LogUtil.d("tag"," " + btn3_id);
        btn3.setId(btn3_id);
        btn3.setText("btn3");
        relativeLayout.addView(btn3);

        // button1

        RelativeLayout.LayoutParams lp_btn_1 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lp_btn_1.addRule(RelativeLayout.ABOVE,btn3_id);
        lp_btn_1.addRule(RelativeLayout.RIGHT_OF,btn3_id);

        Button btn1 = new Button(this);
        btn1.setLayoutParams(lp_btn_1);
        int btn1_id = HelloAndroidUtil.generateViewId();
        btn1.setId(btn1_id);//
        btn1.setText("btn1");
        relativeLayout.addView(btn1);

        // button2

        RelativeLayout.LayoutParams lp_btn_2 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lp_btn_2.addRule(RelativeLayout.ABOVE,btn3_id);
        lp_btn_2.addRule(RelativeLayout.LEFT_OF,btn3_id);

        Button btn2 = new Button(this);
        btn2.setLayoutParams(lp_btn_2);
        int btn2_id = HelloAndroidUtil.generateViewId();
        btn2.setId(btn2_id);//
        btn2.setText("btn2");
        relativeLayout.addView(btn2);

        // button4

        RelativeLayout.LayoutParams lp_btn_4 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lp_btn_4.addRule(RelativeLayout.BELOW,btn3_id);
        lp_btn_4.addRule(RelativeLayout.LEFT_OF,btn3_id);

        Button btn4 = new Button(this);
        btn4.setLayoutParams(lp_btn_4);
        int btn4_id = HelloAndroidUtil.generateViewId();
        btn4.setId(btn4_id);//
        btn4.setText("btn4");
        relativeLayout.addView(btn4);

        // button5

        RelativeLayout.LayoutParams lp_btn_5 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lp_btn_5.addRule(RelativeLayout.BELOW,btn3_id);
        lp_btn_5.addRule(RelativeLayout.RIGHT_OF,btn3_id);

        Button btn5 = new Button(this);
        btn5.setLayoutParams(lp_btn_5);
        int btn5_id = HelloAndroidUtil.generateViewId();
        btn5.setId(btn5_id);//
        btn5.setText("btn5");
        relativeLayout.addView(btn5);

        // add
        linearLayout.addView(relativeLayout);

        /*
        相对布局
        * RelativeLayout rl = new RelativeLayout(this);

Button btn1 = new Button(this);
btn1.setText("----------------------");
btn1.setId(1);

RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
lp1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
lp1.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
// btn1 位于父 View 的顶部，在父 View 中水平居中
rl.addView(btn1, lp1 );

Button btn2 = new Button(this);
btn2.setText("|\n|\n|\n|\n|\n|");
btn2.setId(2);

RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
lp2.addRule(RelativeLayout.BELOW, 1);
lp2.addRule(RelativeLayout.ALIGN_LEFT, 1);
// btn2 位于 btn1 的下方、其左边和 btn1 的左边对齐
rl.addView(btn2, lp2);

Button btn3 = new Button(this);
btn3.setText("|\n|\n|\n|\n|\n|");
btn3.setId(3);

RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
lp3.addRule(RelativeLayout.BELOW, 1);
lp3.addRule(RelativeLayout.RIGHT_OF, 2);
lp3.addRule(RelativeLayout.ALIGN_RIGHT, 1);
// btn3 位于 btn1 的下方、btn2 的右方且其右边和 btn1 的右边对齐（要扩充）
rl.addView(btn3,lp3);

Button btn4 = new Button(this);
btn4.setText("--------------------------------------------");
btn4.setId(4);

RelativeLayout.LayoutParams lp4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
lp4.addRule(RelativeLayout.BELOW, 2);
lp4.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
// btn4 位于 btn2 的下方，在父 Veiw 中水平居中
rl.addView(btn4,lp4);


setContentView(rl);
*/
        // 帧布局
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams_f = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        frameLayout.setLayoutParams(layoutParams_f);

        FrameLayout.LayoutParams lf_btn1 = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        lf_btn1.gravity = Gravity.CENTER;
        Button button_lf = new Button(this);
        button_lf.setText("frame button1");
        button_lf.setLayoutParams(lf_btn1);
        frameLayout.addView(button_lf);

        FrameLayout.LayoutParams layoutParams_imageview = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(layoutParams_imageview);
        imageView.setImageResource(R.drawable.apple_pic);
        // Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.s_jump);
        frameLayout.addView(imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(HA1Layout.this, "hahhh", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        FrameLayout.LayoutParams lf_btn2 = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        lf_btn2.gravity = Gravity.RIGHT;
        lf_btn2.setMargins(0,0,50,0);
        Button button_lf2 = new Button(this);
        button_lf2.setText("frame button2");
        button_lf2.setLayoutParams(lf_btn2);
        frameLayout.addView(button_lf2);


        // add
        linearLayout.addView(frameLayout);
        /*

        1. FrameLayout下动态设置子控件居中，动态用JAVA代码要这样实现:（位置，要在其他的语句中进行设置）

FrameLayout.LayoutParams lytp = new FrameLayout.LayoutParams(80,LayoutParams.WRAP_CONTENT);
lytp.gravity = Gravity.CENTER;
btn.setLayoutParams(lytp);
2. RelativeLayout下动态设置子控件居中：

RelativeLayout.LayoutParams lp=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
lp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
btn1.setLayoutParams(lp);


        * <?xml version="1.0" encoding="utf-8"?>
<FrameLayout  xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:background="@drawable/psb">
    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:orientation="vertical"
        android:gravity="right">
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/ic_launcher" />
 </LinearLayout>
    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:orientation="vertical"
        android:gravity="bottom|right">
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/ic_launcher" />
 </LinearLayout>
    <ProgressBar
        android:id="@+id/progress"
        style="?android:attr/progressBarStyleLarge"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center" />
</FrameLayout>
        * */


        // 表格布局
        TableLayout tableLayout = new TableLayout(this);
        TableLayout.LayoutParams layout_t = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,TableLayout.LayoutParams.WRAP_CONTENT);
        tableLayout.setLayoutParams(layout_t);
        tableLayout.setColumnStretchable(1,true);


        // tabrow1
        TableRow tr1 = new TableRow(this);
//        TableRow.LayoutParams tl1 = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT);

        TextView tv1 = new TextView(this);
        tv1.setText("Account:");
        tr1.addView(tv1);

        EditText et1 = new EditText(this);
        et1.setHint("请输入账号");
        tr1.addView(et1);
        tableLayout.addView(tr1);

        // tabrow2
        TableRow tr2 = new TableRow(this);
        TextView tv2 = new TextView(this);
        tv2.setText("Password:");
        tr2.addView(tv2);

        EditText et2 = new EditText(this);
//        et2.setHint("请输入账号");
        tr2.addView(et2);
        tableLayout.addView(tr2);

        // tab row 3
        TableRow tr3 = new TableRow(this);

        Button btn_tr = new Button(this);
        TableRow.LayoutParams tl_btn = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT);
        tl_btn.span = 2;
        btn_tr.setLayoutParams(tl_btn);
        btn_tr.setText("登录");
        tr3.addView(btn_tr);
        tableLayout.addView(tr3);

        linearLayout.addView(tableLayout);


        setContentView(linearLayout);
    }
}
