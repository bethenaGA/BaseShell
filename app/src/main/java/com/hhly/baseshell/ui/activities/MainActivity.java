package com.hhly.baseshell.ui.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hhly.baseshell.R;
import com.hhly.baseshell.ui.fragments.PlusOneFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "savedInstanceState = " + savedInstanceState);

        findViewById(R.id.button1).setOnClickListener(this);


    }

    @Override
    protected int getToolbarId() {
        return R.id.toolbar;
    }

    @Override
    protected int getContentId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.fragment_content_id;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                addFragment(PlusOneFragment.newInstance("aa", "dd"));
                break;
            default:
                break;
        }
    }
}
