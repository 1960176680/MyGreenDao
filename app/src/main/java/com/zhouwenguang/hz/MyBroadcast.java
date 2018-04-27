package com.zhouwenguang.hz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        for (int i=0;i<10;i++){
            Toast.makeText(context,"广播已接收"+Math.random()*100,Toast.LENGTH_SHORT).show();
        }
    }
}
