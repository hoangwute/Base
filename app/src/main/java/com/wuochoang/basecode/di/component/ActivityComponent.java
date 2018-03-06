package com.wuochoang.basecode.di.component;

import com.wuochoang.basecode.MainActivity;
import com.wuochoang.basecode.di.module.ActivityModule;
import com.wuochoang.basecode.ui.home.MainFragment;

import dagger.Subcomponent;

/**
 * Created by quyenlx on 8/9/2017.
 */

@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainFragment fragment);

}
