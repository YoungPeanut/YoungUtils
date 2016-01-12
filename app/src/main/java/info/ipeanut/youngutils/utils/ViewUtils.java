package info.ipeanut.youngutils.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;

/**
 * Created by chenshaosina on 16/1/12.
 */
public class ViewUtils {

    /**可见屏幕高度**/
    public static int getAppHeight(Activity paramActivity) {
        Rect localRect = new Rect();
        paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
        return localRect.height();
    }

    // below actionbar, above softkeyboard
    public static int getAppContentHeight(Activity paramActivity) {
        return  ScreenUtil.getScreenHeight(paramActivity) -  ScreenUtil.getStatusBarHeight(paramActivity)
                -  getActionBarHeight(paramActivity) -  KeyboardUtils.getKeyboardHeight(paramActivity);
    }

    /**获取actiobar高度**/
    public static int getActionBarHeight(Activity paramActivity) {
        if (true) {
            return  dip2px(paramActivity,56);
        }
        int[] attrs = new int[] { android.R.attr.actionBarSize };
        TypedArray ta = paramActivity.obtainStyledAttributes(attrs);
        return ta.getDimensionPixelSize(0,  dip2px(paramActivity,56));
    }


    /**dp转px**/
    public static int dip2px( Context context,int dipValue) {
        float reSize = context.getResources().getDisplayMetrics().density;
        return (int) ((dipValue * reSize) + 0.5);
    }


}
