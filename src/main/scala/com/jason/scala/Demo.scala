package com.jason.scala

import scala.collection.mutable.ArrayBuffer

class Demo{

  var name:String = "Jason"
}

object Test{
  def main(args: Array[String]): Unit = {
    println("Scala...")

    var demo = new Demo
    println(demo.name)
    val x = 5
    val i = if (x>1) x else -1
    println(i)

    for (c <-1 to 10 )
      println(c)

    for (a <- 1 until 10)
      println(a)


    val array = Array("Jason","CC")
    array.foreach(
      a=> if (a.startsWith("J"))println(a) else println(a+"--")
    )


    val arrayBuffer = ArrayBuffer[Int]()
    arrayBuffer+=1
    arrayBuffer+=(2,3,4)
    println(arrayBuffer)

    arrayBuffer.insert(1,7,8,9)
    println(arrayBuffer)

    arrayBuffer.remove(2)
    println(arrayBuffer)

    val list = for (i <- array) yield i
    println(list)




  }
}