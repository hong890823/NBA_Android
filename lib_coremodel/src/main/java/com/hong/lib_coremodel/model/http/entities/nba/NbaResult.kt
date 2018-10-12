package com.hong.lib_coremodel.model.http.entities.nba

class NbaResult {
    lateinit var title:String
    lateinit var statuslist:NbaStatus
    lateinit var list:ArrayList<NbaDetail>
}