package com.hong.lib_coremodel.model.http

import com.hong.lib_coremodel.model.http.service.NbaApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {

        fun getNbaService():NbaApiService{
            return initService(ApiConstants.NBA_BASE_URL,NbaApiService::class.java)
        }

        private fun <T> initService(baseUrl: String,service:Class<T>):T{
            return getRetrofitInstance(baseUrl).create(service)
        }

        private fun getRetrofitInstance(baseUrl:String):Retrofit{
            return Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(OkHttpClient())
                    .build()
        }

    }


}