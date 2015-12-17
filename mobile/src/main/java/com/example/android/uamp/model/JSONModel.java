package com.example.android.uamp.model;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by phearom on 12/17/15.
 */
public class JSONModel {
    private static Context mContext;

    public JSONModel(Context context) {
        mContext = context;
    }

    public static String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = mContext.getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return "";
        }
        return json;
    }
}
