package com.yh.applockscreen;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by yh on 2017-08-24.
 */

public class MyApplaction extends Application implements Application.ActivityLifecycleCallbacks {
    private int activityCount;//activity的count数
    private boolean isForeground;//是否在前台

    @Override
    public void onCreate() {
        super.onCreate();
//        this.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
//            @Override
//            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
//                Log.d("yyyyyyyyyyyyy","onActivityCreated"+activity);
//            }
//
//            @Override
//            public void onActivityStarted(Activity activity) {
//                Log.d("yyyyyyyyyyyyy","onActivityStarted"+activity);
//                activityCount++;
//            }
//
//            @Override
//            public void onActivityResumed(Activity activity) {
//                Log.d("yyyyyyyyyyyyy","onActivityResumed"+activity);
//                Toast.makeText(activity, "进入前台了", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onActivityPaused(Activity activity) {
//                Log.d("yyyyyyyyyyyyy","onActivityPaused"+activity);
//            }
//
//            @Override
//            public void onActivityStopped(Activity activity) {
//                Log.d("yyyyyyyyyyyyy","onActivityStopped"+activity);
//                activityCount--;
//                if (0 == activityCount) {
//                    isForeground = false;
//                    Toast.makeText(activity, "运行在后台", Toast.LENGTH_SHORT).show();
//
//                }
//                Log.d("yyyyyyyyyyyyy",activityCount+"");
//            }
//
//            @Override
//            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
//                Log.d("yyyyyyyyyyyyy","onActivitySaveInstanceState"+activity);
//            }
//
//            @Override
//            public void onActivityDestroyed(Activity activity) {
//                Log.d("yyyyyyyyyyyyy","onActivityDestroyed"+activity);
//            }
//        });
       registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}

