package com.example.zhangyuanke.helloandroid.Module.HA1UI;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhangyuanke.helloandroid.R;
import com.example.zhangyuanke.helloandroid.Tools.BaseActivity;

import java.lang.reflect.Field;

public class HA1SimpleUI extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha1_simple_ui);
//        getActionBar().setDisplayHomeAsUpEnabled(true);


//        LinearLayout layout = (LinearLayout)findViewById(R.id.ha1_scroll_linelayout);
//
//        for(int i = 0; i < 8; i++)
//        {
//            //  通过资源文件来获得指定一个Drawable对象
//            Drawable drawable = getResources().getDrawable(R.drawable.banana_pic);
//            ImageView imageView = new ImageView(this);
//            imageView.setImageDrawable(drawable);
//            layout.addView(imageView);
//        }
        testTextView();
    }

    private void testTextView()
    {
        /*
        * TextView

　　之前讲解Android布局的时候，就已经说明，所有Layout都是View的子类或者间接子类。而TextView也一样，是View的直接子类。它是一个文本显示控件，提供了基本的显示文本的功能，并且是大部分UI控件的父类，因为大部分UI控件都需要展示信息。

　　如果仅仅是展示文本，那么TextView的作用就太小了，所以它还预定义了一些类似于HTML的标签，通过这些标签可以使TextView控件显示不同的颜色、大小、字体、图片、链接。这些HTML标签都需要android.text.Html类的支持，但是并不包括所有的HTML标签。

　　常用的可以再TextView中设定的标签有：

<font>：设置颜色和字体。
<big>：设置字体大号
<small>：设置字体小号
<i>\<b>：斜体\粗体
<a>：连接网址
<img>：图片
　　使用这些标签可以用Html.fromHtml方法将这些标签的字符串转换成CharSequence接口，然后在TextView.setText()中进行设置。如果需要响应设置的HTML标签进行响应，需要设置TextView.setMovementMethod(LinkMovementMethod.getInstance())。

　　CharSequence为接口类型，大家可能对其有点陌生，但是它的子类肯定会让大家有熟悉的感觉，String、StringBuffer、StringBuilder、SpannableString、SpannableStringBuilder都是其子类，它包括了字符串的所有类，因为面向对象的多态性，在这里把他理解成字符串类的抽象即可。

　　除了使用HTML标签的方式设定显示文本中的URL地址、邮箱地址、电话等产生超链接出发相应的服务，可以使用android:autoLink属性来设置，以下是android:autoLink属性的介绍：

None：默认的，不匹配任何连接。
web：网址。
email：邮箱。
phone：电话号码。
map：匹配映射网址。
all：匹配所有连接。
*/

        TextView textView1,textView2;
        textView1=(TextView)findViewById(R.id.ha1_textview_1);
        textView2=(TextView)findViewById(R.id.ha1_textview_2);

        //设置需要显示的字符串
        String html="<font color ='red'>Hello android</font><br/>";
        html+="<font color='#0000ff'><big><i>Hello android</i></big></font><p>";
        html+="<big><a href='http://www.baidu.com'>百度</a></big>";
        //使用Html.fromHtml,把含HTML标签的字符串转换成可显示的文本样式
        CharSequence charSequence= Html.fromHtml(html);
        //通过setText给TextView赋值
        textView1.setText(charSequence);
        //设定一个点击的响应
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        String text="我的URL:http://www.cnblogs.com/plokmju/\n";
        text+="我的email:plokmju@sina.com\n";
        text+="我的电话：+86 010-12345678";
        //因为textView2中有autoLink=”all“的属性设定，所以会自动识别对应的连接，点击出发对应的Android程序
        textView2.setText(text);

        testTextView2();
        testTextView3();
        testTextView4();
        /* html 下划线

        http://blog.csdn.net/zhuzhiqiang_zhu/article/details/50755980


        * 如果是代码里：
1、使用Html.fromHtml()
TextView textView = (TextView)findViewById(R.id.tv_test);
textView.setText(Html.fromHtml("<u>"+"0123456"+"</u>"));

2、使用TextView的Paint的属性
tvTest.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线
tvTest.getPaint().setAntiAlias(true);//抗锯齿

3、使用SpannableString类
SpannableString content = new SpannableString(str);
content.setSpan(new UnderLineSpan, 0, str.length(), 0);
        * */
    }

    private void testTextView4()
    {
        TextView tvRunLamp = (TextView) findViewById(R.id.ha1_textview_test);
        String html = "<a href='www.baidu.com'>百度首页</a>";
        CharSequence cs = Html.fromHtml(html);
        tvRunLamp.setText(cs);
        tvRunLamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HA1SimpleUI.this,"1234",Toast.LENGTH_SHORT).show();
            }
        });
        tvRunLamp.setMovementMethod(LinkMovementMethod.getInstance());


        //
        TextView textView = (TextView)findViewById(R.id.ha1_textview_test2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HA1SimpleUI.this,"abcd",Toast.LENGTH_SHORT).show();
            }
        });
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        // Android TextView 中实现部分文字变色以及点击事件

        String str = "1234567890abcdefghijkmnp";
        SpannableStringBuilder spannable = new SpannableStringBuilder(str,0,str.length());
        spannable.setSpan(new TextClick(),3 ,8 , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannable);


    }
    private class TextClick extends ClickableSpan {
        @Override
        public void onClick(View widget) {
            //在此处理点击事件
            Toast.makeText(HA1SimpleUI.this,"45678",Toast.LENGTH_SHORT).show();
        }
        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setColor(Color.RED);
            ds.setUnderlineText(true);
        }
    }

    private void testTextView3()
    {
        TextView tvRunLamp = (TextView) findViewById(R.id.ha1_textview_paomadeng);
        String html = "之前讲解Android布局的时候，就已经说明，所有<a href='http://www.cnblogs.com/plokmju/p/androidUI_Layout.html'>Layout</a>都是View的子类或者间接子类。而TextView也一样，是View的直接子类。它是一个文本显示控件，提供了基本的显示文本的功能，并且是大部分UI控件的父类，因为大部分UI控件都需要展示信息。";
        CharSequence cs = Html.fromHtml(html);
        tvRunLamp.setText(cs);
        //因为文本中设定了一个<a>标签，这里设置响应。
        tvRunLamp.setMovementMethod(LinkMovementMethod.getInstance());

        tvRunLamp.setFocusable(true);
        tvRunLamp.requestFocus();

        /*
        *      <TextView
                android:id="@+id/tv_table_name"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:singleLine="true"
                android:focusable="true"
                android:focusableInTouchMode="true"
                android:text="就算对方角度来看积分卡撒娇福克斯的缴费基数大幅减少贷款房价跌幅扩大解放打算开发建设的方式登记方式的开发建设贷款的司法鉴定收费的"
                android:textColor="#FFFFFF"
                android:marqueeRepeatLimit="marquee_forever"
                android:ellipsize="marquee"
                android:textSize="20sp"
                android:textStyle="bold" />
                */

//        tvRunLamp.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线
//        tvRunLamp.getPaint().setAntiAlias(true);//抗锯齿
    }

    private void testTextView2()
    {
        TextView textViewImg=(TextView)findViewById(R.id.ha1_textview_img);
//        textViewImg.setTextColor(android.R.color.white);
//        textViewImg.setBackgroundColor(android.R.color.black);
        textViewImg.setTextSize(20);
        //设定HTML标签样式，图片3为一个超链接标签a
//        String html="图像1<img src='apple_pic'/>图像2<img src='apple_pic'/>\n";
//        html+="图像3<a href='http://www.baidu.com'><img src='apple_pic'/></a>";
        String html="图像1<img src='apple_pic'/>";
        //fromHtml中ImageGetter选择html中<img>的图片资源
        CharSequence cs=Html.fromHtml(html, new Html.ImageGetter() {

            public Drawable getDrawable(String source) {
                //source为html字符串中定义的<img>中的src的内容
                //返回值Drawable就是对应的<img>显示的图片资源
                Drawable draw=null;
                if(source.equals("image1"))
                {
                    draw=getResources().getDrawable(R.drawable.apple_pic);
                    draw.setBounds(0, 0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());
                }
                else if(source.equals("image2"))
                {
                    //设定image2尺寸等比缩小
                    draw=getResources().getDrawable(R.drawable.apple_pic);
                    draw.setBounds(0, 0, draw.getIntrinsicWidth()/2, draw.getIntrinsicHeight()/2);
                }
                else
                {
                    //使用反射会更简便，无需知道src与资源Id的对应关系
                    draw=getResources().getDrawable(getResourceId(source));
                    draw.setBounds(0, 0, draw.getIntrinsicWidth(), draw.getIntrinsicHeight());
                }
                return draw;
            }
        }, null);
        textViewImg.setText(cs);
        textViewImg.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public int getResourceId(String source)
    {
        try {
            //使用反射机制，通过属性名称，得到其内的值
            Field field=R.drawable.class.getField(source);
            return Integer.parseInt(field.get(null).toString());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;

    }

}
