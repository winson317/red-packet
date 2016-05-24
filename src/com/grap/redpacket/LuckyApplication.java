package com.grap.redpacket;

import android.app.Application;
import com.flurry.android.FlurryAgent;

/**
 * Created by winson on 2016/4/21.
 */
public class LuckyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FlurryAgent.init(this, "37T6NSWDQZ28FNJSWYBB");
    }
}
