package com.wuochoang.basecode.ui.home.tabs;

import com.wuochoang.basecode.base.BaseFragment;
import com.wuochoang.basecode.ui.devices.DevicesFragment;

/**
 * Created by quyenlx on 8/9/2017.
 */

public class Tab2Fragment extends BaseTabFragment {
    @Override
    public BaseFragment initFragment() {
        return new DevicesFragment();
    }

//
//    @Override
//    public void onBackStackChanged() {
//        Timber.i("Size Tab2 : " + frm.getBackStackEntryCount());
//        Fragment fragment = frm.findFragmentById(R.id.tab_container);
//        if (fragment != null)
//            Timber.i("Fragment Tab2 : " + fragment.getClass().getSimpleName());
//    }
}
