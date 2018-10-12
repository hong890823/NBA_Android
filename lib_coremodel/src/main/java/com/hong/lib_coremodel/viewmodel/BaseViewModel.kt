package com.hong.lib_coremodel.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.hong.lib_coremodel.model.http.repository.IDataRepository
import java.lang.reflect.ParameterizedType

//ViewModel中不要持有Activity的引用，防止内存泄漏
open class BaseViewModel <T> (application: Application) : AndroidViewModel(application){

    val liveData = MutableLiveData<T>()

    fun loadData(iDataRepository: IDataRepository){
        //LiveData的setValue只能在主线程中调用，postValue可以在子线程中调用
        iDataRepository.getNetData(getTClass())?.subscribe { liveData.value = it }
    }

    private fun getTClass(): Class<T> {
        return (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<T>
    }

}