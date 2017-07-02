package cn.huida.burt.zsxs;

import android.app.Application;

/**
 * Created by Burt on 2017/7/2 0002.
 */

public class BaseApplication extends Application {
    static BaseApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static BaseApplication getInstance() {
        return mInstance;
    }

}
