package info.ipeanut.youngutils.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by chenshaosina on 16/1/13.
 */
public class IntentUtils {

    public static Intent getSystemAlbumIntent() {

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        return intent;
    }

    public static void toSystemAlbumFromFragment(Fragment fragment, int reqCode) {

        fragment.startActivityForResult(getSystemAlbumIntent(), reqCode);

    }

    public static void toSystemAlbumFromActivity(Activity context, int reqCode) {

        context.startActivityForResult(getSystemAlbumIntent(), reqCode);

    }


}
