package com.hong.lib_coremodel.model.http.util

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException

/**
 * Created by dxx on 2017/11/20.
 */

object JsonUtil {

    private var gson: Gson? = null

    init {
        if (gson == null) {
            gson = Gson()
        }
    }

    fun <T> strToBean(json: String, clazz: Class<T>): T? {
        var bean: T? = null
        if (null != gson) {
            try {
                bean = gson!!.fromJson(json, clazz)
            } catch (e: JsonSyntaxException) {
                e.printStackTrace()
            }

        }
        return bean
    }


    fun beanToStr(`object`: Any): String? {
        var str: String? = null
        if (null != gson) {
            try {
                str = gson!!.toJson(`object`)
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        return str
    }

    fun listToStr(list: List<*>): String? {
        var str: String? = null
        if (null != gson && list.size > 0) {
            str = "["
            for (i in list.indices) {
                if (i != list.size - 1) {
                    str += gson!!.toJson(list[i]) + ","
                } else if (i == list.size - 1) {
                    str += gson!!.toJson(list[i]) + "]"
                }
            }
        }
        return str
    }

}
