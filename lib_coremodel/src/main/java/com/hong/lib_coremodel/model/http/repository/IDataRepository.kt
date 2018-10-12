package com.hong.lib_coremodel.model.http.repository

import io.reactivex.Observable

interface IDataRepository{
    fun <T> getNetData(clazz: Class<T>):Observable<T>?
}