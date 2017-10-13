package com.wuochoang.basecode.base;

/**
 * Created by quyenlx on 8/8/2017.
 */

public interface BasePresenter<T extends BaseView> {
    void onAttachView(T view);

    void onDetach();
}
