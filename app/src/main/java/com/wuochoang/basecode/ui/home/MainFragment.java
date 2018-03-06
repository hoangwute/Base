package com.wuochoang.basecode.ui.home;


import android.os.Bundle;
import android.widget.RelativeLayout;

import com.wuochoang.basecode.R;
import com.wuochoang.basecode.base.BaseFragment;
import com.wuochoang.basecode.base.BasePresenter;
import com.wuochoang.basecode.common.Router;
import com.wuochoang.basecode.manager.StorageManager;
import com.wuochoang.basecode.ui.devices.DevicesFragment;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by admin on 05-Mar-18.
 */

public class MainFragment extends BaseFragment {

    @Inject
    Router router;
    @Inject
    StorageManager storageManager;
    @BindView(R.id.container)
    RelativeLayout mainView;

    public static MainFragment getInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void injectDependence() {
        component.inject(this);
    }

    @Override
    public void initBundle(Bundle bundle) {
    }


    @Override
    public int getLayoutRes() {
        return R.layout.fragment_main;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void initView() {
    }


    @Override
    public void initData() {
        addFragment(new DevicesFragment());
    }

}
