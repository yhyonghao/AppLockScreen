package com.yh.applockscreen;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

/**
 * Created by yh on 2017-08-24.
 */

public abstract class BaseClass extends AppCompatActivity {
    //判断当前的应用程序是不是在运行

    //需要申请GETTask权限
    private boolean isApplicationBroughtToBackground() {
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> tasks = am.getRunningTasks(1);
        if (!tasks.isEmpty()) {
            ComponentName topActivity = tasks.get(0).topActivity;
            if (!topActivity.getPackageName().equals(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public boolean wasBackground = false;    //声明一个布尔变量,记录当前的活动背景

    @Override
    public void onPause() {
        super.onPause();
        if (isApplicationBroughtToBackground())
            wasBackground = true;
    }

    public void onResume() {
        super.onResume();
        if (wasBackground) {//
            Log.e("aa", "从后台回到前台");
        }
        wasBackground = false;

    }
}