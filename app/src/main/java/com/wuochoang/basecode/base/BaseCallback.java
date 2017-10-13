package com.wuochoang.basecode.base;

import com.wuochoang.basecode.network.entities.BaseResult;

/**
 * Created by TuanJio on 8/14/2017.
 */

public interface BaseCallback {

    void onSuccess(BaseResult result);

    void onFail();
}
