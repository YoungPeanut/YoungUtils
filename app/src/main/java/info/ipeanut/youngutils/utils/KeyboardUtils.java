package info.ipeanut.youngutils.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by chenshaosina on 16/1/12.
 */
public class KeyboardUtils {


    public static int getKeyboardHeight(Activity paramActivity) {

        int height =  ScreenUtil.getScreenHeight(paramActivity) -  ScreenUtil.getStatusBarHeight(paramActivity)
                -  ScreenUtil.getAppHeight(paramActivity);
        return height;
    }
    /**键盘是否在显示**/
    public static boolean isKeyBoardShow(Activity paramActivity) {
        int height =  ScreenUtil.getScreenHeight(paramActivity) -  ScreenUtil.getStatusBarHeight(paramActivity)
                -  ScreenUtil.getAppHeight(paramActivity);
        return height != 0;
    }
    /**显示键盘**/
    public static void showKeyBoard(final Context context, final View paramEditText) {
        paramEditText.requestFocus();
        paramEditText.post(new Runnable() {
            @Override
            public void run() {
                ((InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE)).showSoftInput(paramEditText, 0);
            }
        });
    }

    /**关闭键盘**/
    public static void hideSoftInput(Context context, View paramEditText) {
        ((InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE))
                .hideSoftInputFromWindow(paramEditText.getWindowToken(), 0);
    }

}
