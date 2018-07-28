package com.dxdbl.kafka

import java.text.SimpleDateFormat
import java.util.Date

object readFile extends App {
//  val file_name = args(0).toString()
//  //读取文件
//  var file = Source.fromFile(file_name)
//  for (line <- file.getLines())
//    {
//      println(line)
//    }
//  file.close()
  val time = new Date().getTime()
  val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  val new_time = fm.format(new Date(time.toLong))
  println(time)
  println(new_time)
}
