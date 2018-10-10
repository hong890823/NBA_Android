package com.hong.lib_coremodel.model.http.util

import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SwitchSchedulers {
    companion object {
        fun <T> applyShedulers():ObservableTransformer<T,T>{
            return ObservableTransformer { it.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()) }
        }
    }
}