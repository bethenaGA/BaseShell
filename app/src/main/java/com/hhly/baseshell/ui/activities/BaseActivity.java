package com.hhly.baseshell.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenml on 2016/6/7.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected List<Fragment> fragments = new ArrayList<>();

    protected abstract int getToolbarId();

    protected abstract int getContentId();

    protected abstract int getFragmentContentId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentId());
        setSupportActionBar((Toolbar) findViewById(getToolbarId()));

        Log.d("BaseActivity","getLocalClassName " +getLocalClassName());


    }







    protected void addFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction().
                add(getFragmentContentId(), fragment).commitAllowingStateLoss();
    }
}
