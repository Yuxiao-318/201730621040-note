package cn.jsbintask.memo;

import android.app.Application;
import android.content.Context;



//定义一个自己的上下文，便于获取context（DB操作需要）
public class MemoApplication extends Application{
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
