package com.codepath.simpletodo;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
/**
 * Created by install on 05/07/2015.
 */
public class ToDoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
