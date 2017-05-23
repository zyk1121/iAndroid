package com.example.zhangyuanke.helloandroid.Tools;

import android.content.Context;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhangyuanke on 2017/5/23.
 */

public class HelloAndroidUtil {

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }



    // 设置view的ID API17 Android 4.2.2以上
//    tv_leftBtn_title.setId(View.generateViewId());

    //    http://blog.csdn.net/u012246458/article/details/53464566 IdUtils.java（常用在sdk里面）
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);

    // 不同的根布局中id可以相同，同一个setContentView布局中的id不能一样，会被覆盖
    public static int generateViewId() {
        for (;;) {
            final int result = sNextGeneratedId.get();
            // aapt-generated IDs have the high byte nonzero; clamp to the range under that.
            int newValue = result + 1;
            if (newValue > 0x00FFFFFF) newValue = 1; // Roll over to 1, not 0.
            if (sNextGeneratedId.compareAndSet(result, newValue)) {
                return result;
            }
        }
    }
    // 第三种方式：常用在有布局的App中
    /*
            <resources>
  <item type="id" name="snack" />
</resources>
R.id.snack
            */

}
