package com.wuochoang.basecode.ui.home.tabs;

import com.wuochoang.basecode.base.BaseFragment;
import com.wuochoang.basecode.ui.devices.DevicesFragment;

/**
 * Created by quyenlx on 8/9/2017.
 */

public class Tab3Fragment extends BaseTabFragment {
    @Override
    public BaseFragment initFragment() {
        return new DevicesFragment();
    }

//    @Override
//    public void onBackStackChanged() {
//        Timber.i("Size Tab3 : " + frm.getBackStackEntryCount());
//        Fragment fragment = frm.findFragmentById(R.id.tab_container);
//        if (fragment != null)
//            Timber.i("Fragment Tab3 : " + fragment.getClass().getSimpleName());
//    }

}
