package info.ipeanut.youngutils.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

/**
 * Created by chenshaosina on 15/12/29.
 */
public class BitmapUtils {

    /**
     * Drawable转Bitmap
     * 把Drawable画到Bitmap上
     */
    public static Bitmap getBitmapFromDrawable(Drawable d){
        int w = d.getIntrinsicWidth();
        int h = d.getIntrinsicHeight();
        d.setBounds(0,0,w,h);

        //如果不用记录透明度信息，就用RGB_565
        Bitmap bitmap = Bitmap.createBitmap(w, h, d.getOpacity() != PixelFormat.OPAQUE ?
                Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmap);
        d.draw(canvas);

        return bitmap;
    }
}
