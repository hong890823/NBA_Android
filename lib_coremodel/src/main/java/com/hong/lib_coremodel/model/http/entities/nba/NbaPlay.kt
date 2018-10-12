package com.hong.lib_coremodel.model.http.entities.nba

class NbaPlay {
    lateinit var time:String
    lateinit var player1:String
    lateinit var player2:String
    lateinit var player1logo:String
    lateinit var player2logo:String
    lateinit var player1logobig:String
    lateinit var player2logobig:String
    lateinit var player1url:String
    lateinit var player2url:String
    var link1text = "视频集锦"
    lateinit var link1url:String
    lateinit var m_link1url:String
    var link2text = "技术统计"
    lateinit var link2url:String
    lateinit var m_link2url:String
    lateinit var score:String
    var status:Int = 0
}