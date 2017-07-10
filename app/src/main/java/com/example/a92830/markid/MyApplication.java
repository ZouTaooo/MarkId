package com.example.a92830.markid;

import android.app.Application;
import android.content.Context;

/**
 * Created by 92830 on 2017/7/10.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
