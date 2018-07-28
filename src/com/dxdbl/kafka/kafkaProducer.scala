package com.dxdbl.kafka

import java.text.SimpleDateFormat
import java.util.{Date, Properties}

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

import scala.io.Source

object kafkaProducer extends App {
  //配置参数
  val brokers = args(0).toString()
  val topic = args(1).toString()
  val props = new Properties()
  props.put("bootstrap.servers", brokers)
  props.put("client.id", "ScalaProducerExample")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")


  val producer = new KafkaProducer[String, String](props)
  //要读取的文件名
  val file_name = args(2).toString()
  //读取文件
  var file = Source.fromFile(file_name)
  for (line <- file.getLines())
  {
    println(line)
    //时间格式处理
    val runtime = new Date().getTime()
    val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val new_time = fm.format(new Date(runtime.toLong))
    val msg = runtime + "," + new_time + "," + line
    val data = new ProducerRecord[String,String](topic,msg)
    producer.send(data)
    //1秒钟读取一行数据
    Thread.sleep(1000)
  }
  file.close()

  System.out.println("sent data complete!")
  producer.close()
}