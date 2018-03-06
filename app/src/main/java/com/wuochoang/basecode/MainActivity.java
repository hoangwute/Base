package com.wuochoang.basecode;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.wuochoang.basecode.base.BaseActivity;
import com.wuochoang.basecode.base.BaseFragment;
import com.wuochoang.basecode.ui.home.MainFragment;

public class MainActivity extends BaseActivity {

    public MainFragment mainFragment;


    @Override
    public BaseFragment initFragment() {

        if (mainFragment == null)
            mainFragment = new MainFragment();
        return mainFragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }
}
