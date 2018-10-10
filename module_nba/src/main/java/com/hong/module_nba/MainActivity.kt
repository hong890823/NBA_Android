package com.hong.module_nba

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hong.lib_coremodel.model.http.repository.NbaDataRepository
import com.hong.lib_coremodel.viewmodel.NbaViewModel
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NbaDataRepository.getNbaData()

//        val nbaViewModel = ViewModelProviders.of(this).get(NbaViewModel::class.java)
    }



}




