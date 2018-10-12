package com.hong.lib_coremodel.model.http.entities.nba

class NbaDetail {
    lateinit var title:String
    lateinit var live:ArrayList<NbaLive>
    lateinit var livelink:ArrayList<NbaLink>
    lateinit var tr:ArrayList<NbaPlay>
    lateinit var bottomlink:ArrayList<NbaLink>
    lateinit var teammatch:ArrayList<NbaTeam>
}