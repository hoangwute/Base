package com.wuochoang.basecode.di.module;

import com.wuochoang.basecode.base.BaseActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by quyenlx on 8/9/2017.
 */

@Module
public class ActivityModule {
    private BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    public BaseActivity provideBaseActivity() {
        return activity;
    }

}
