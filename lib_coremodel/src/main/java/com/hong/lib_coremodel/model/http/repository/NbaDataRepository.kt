package com.hong.lib_coremodel.model.http.repository

import com.hong.lib_coremodel.model.http.ApiClient
import com.hong.lib_coremodel.model.http.ApiConstants
import com.hong.lib_coremodel.model.http.util.JsonUtil
import com.hong.lib_coremodel.model.http.util.SwitchSchedulers
import io.reactivex.Observable

class NbaDataRepository {

    companion object {
        fun  getNbaData(): Observable<String>{
            return ApiClient.getNbaService()
                    .getNbaData(ApiConstants.NBA_KEY)
                    .compose(SwitchSchedulers.applyShedulers())
                    .map {
                        it.toString()
                    }
        }
    }

}