# kafka in scala

------

**scala语言编写的相关kafka程序**
-
网上用java语言写的kafka程序很多，但是scala语言写的不多，
说的也不是很详细，在此将自己写的分享下，才疏学浅，大神勿喷！


![cmd-markdown-logo](https://wx1.sinaimg.cn/mw690/ad8d62d1gy1ftpy8314dlj20ji0a9t8w.jpg)

> 实现功能：
一个简单的kafka producer，读取相应的文件内容然后吐到相应的topic。

------

## 使用方法

Markdown build之后生成jar包，上传到服务器，然后通过java命令执行

    java -cp com.dxdbl.kafka.kafkaProducer idc24:9092 test test.txt
    
## 使用说明

 - com.dxdbl.kafka.kafkaProducer  类名
 - idc24:9092  kafka broker list
 - test  kafka topic名
 - test.txt  读取的文件名(可以是绝对路径比如:/root/test.txt)

## 使用截图

 - 执行jar包
![cmd-markdown-logo](https://wx1.sinaimg.cn/mw690/ad8d62d1gy1ftpygm32juj20y106stao.jpg)
 - 创建kafka消费者查看消费情况
![cmd-markdown-logo](https://wx4.sinaimg.cn/mw690/ad8d62d1gy1ftpygofkk7j217b0argqg.jpg)

## 需要添加的相关jar包

 1. log4j-1.2.17.jar
 2. slf4j-api-1.7.21.jar
 3. slf4j-log4j12-1.7.21.jar
 4. kafka-clients-0.10.2.0.jar
