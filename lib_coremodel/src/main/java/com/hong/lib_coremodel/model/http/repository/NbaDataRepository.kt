package com.hong.lib_coremodel.model.http.repository

import android.util.Log
import com.apkfuns.logutils.LogUtils
import com.hong.lib_coremodel.model.http.ApiClient
import com.hong.lib_coremodel.model.http.ApiConstants
import com.hong.lib_coremodel.model.http.entities.nba.NbaData
import com.hong.lib_coremodel.model.http.util.JsonUtil
import com.hong.lib_coremodel.model.http.util.SwitchSchedulers
import io.reactivex.Observable


class NbaDataRepository: IDataRepository{

    override fun <T> getNetData(clazz: Class<T>): Observable<T>? {
        return getNbaData(clazz)
    }

    fun <T> getNbaData(clazz: Class<T>): Observable<T>? {
        return ApiClient.getNbaService()
                .getNbaData(ApiConstants.NBA_KEY,"火箭")
                .compose(SwitchSchedulers.applyShedulers())
                //it是ResponseBody，这里调用string()方法才能正确的拿到返回值
                .map {
                    val data = it.string()
                    LogUtils.d(javaClass.name,data)
                    JsonUtil.strToBean(data,clazz)
                }
    }


}


