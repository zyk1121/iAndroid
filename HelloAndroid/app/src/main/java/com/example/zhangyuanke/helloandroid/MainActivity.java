package com.example.zhangyuanke.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.zhangyuanke.helloandroid.Module.HA1UI.HA1UIActivity;

public class MainActivity extends Activity {

    /*
    * 1.书籍：第一行代码
2.UI布局（XML+代码）——重点
3.四大组件（活动+服务+广播接收器+内容提供器）
4.常用控件使用
5.ListView+RecyleView——重点
6.Fragment
7.广播
8.通知
9.数据存储+SQLite
10.多媒体（通知，摄像头，相册，视频，音频）
11.服务（多线程）
12.网络（Http）
13.JSON
14.传感器（GPS，方向，加速度，光照）
15.Jar包
16.打包注意事项（混淆等）
17.NDK（JNI开发，命令）
18.框架（组件化，插件化）
19.自定义控件（第三方View自定义）
20.Android动画相关
21.OpenGL ES
22.C++混编（调试）
23.AIDL、Messenger、Binder、多进程、动画、滑动冲突、自定义View、消息队列等（http://blog.csdn.net/singwhatiwanna/article/details/49560409/） （中级开发）
24.系统核心机制（高级工程师）
25.Android设计模式

Bitmap
序列化
手势


*/
    private String[] data = {
            "1.Android UI",
            "2.四大组件",
            "3.常用控件（ListView等）",
            "4.通知",
            "5.手机多媒体",
            "6.网络Http",
            "7.数据储存",
            "8.网络Http",
            "9.网络数据解析",
            "10.服务（多线程）",
            "11.传感器",
            "12.JSON",
            "13.Bitmap",
            "14.序列化",
            "15.Jar包",
            "16.单元测试",
            "17.打包发布（混淆等）",
            "18.NDK（JNI开发，命令）",
            "19.手势",
            "20.动画",
            "21.框架（组件化，插件化）",
            "22.自定义控件（第三方View自定义）",
            "23.C++混编（调试)",
            "24.单元测试",
            "25.中级开发知识（消息队列）等",
            "26.高级开发知识（系统核心机制）",
            "27.设计模式"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDataAndView();
    }

    // 设置数据和view
    private void setupDataAndView()
    {
        // 适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.main_list_view);
        listView.setAdapter(adapter);
        // 事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                executeItemForRow(i);
            }
        });
    }

    private void executeItemForRow(int row)
    {
        Intent intent = null;
        switch (row)
        {
            case 0:
                // UI
                intent = new Intent(MainActivity.this, HA1UIActivity.class);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
