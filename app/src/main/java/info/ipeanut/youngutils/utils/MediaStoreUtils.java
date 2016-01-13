package info.ipeanut.youngutils.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;

/**
 * Created by chenshaosina on 16/1/13.
 */
public class MediaStoreUtils {

    public static String getImagePathByUri(@Nullable Context context,@Nullable Uri uri){

        Cursor c = context.getContentResolver().query(uri, new String[]{MediaStore.Images.ImageColumns.DATA}, null, null, null);
        if (null == c){
            return "";
        }
        c.moveToFirst();
        int clumIndex = c.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
        return c.getString(clumIndex);

    }
}
