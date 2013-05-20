package com.tomkey.progresscomponent;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends ProgressActivity {
    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(new Runnable() {
            
            @Override
            public void run() {
                setContentEmpty(true);
                setEmptyText("空");
                setContentShown(true);
            }
        }, 3000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
