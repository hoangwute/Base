package com.wuochoang.basecode.di.component;

import com.wuochoang.basecode.di.module.ActivityModule;
import com.wuochoang.basecode.di.module.ApplicationModule;
import com.wuochoang.basecode.di.module.NetworkModule;
import com.wuochoang.basecode.di.module.StorageModule;
import com.wuochoang.basecode.network.MyServiceInterceptor;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by quyenlx on 8/9/2017.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class,
        StorageModule.class
})
public interface ApplicationComponent {
    ActivityComponent plus(ActivityModule module);

    void inject(MyServiceInterceptor myServiceInterceptor);

}
