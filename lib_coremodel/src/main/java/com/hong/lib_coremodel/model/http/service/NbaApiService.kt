package com.hong.lib_coremodel.model.http.service

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface NbaApiService {

    @GET("nba")
    fun getNbaData(@Query("key") key:String): Observable<ResponseBody>
}