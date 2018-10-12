package com.hong.module_nba

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.hong.lib_coremodel.model.http.entities.nba.NbaData
import com.hong.lib_coremodel.model.http.repository.NbaDataRepository
import com.hong.lib_coremodel.viewmodel.NbaViewModel


//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nbaViewModel = ViewModelProviders.of(this).get(NbaViewModel::class.java)
        nbaViewModel.loadData(NbaDataRepository())
        nbaViewModel.liveData.observe(this,Observer<NbaData>{
            Toast.makeText(MainActivity@this,it?.result?.title,Toast.LENGTH_SHORT).show()
        })
    }



}








