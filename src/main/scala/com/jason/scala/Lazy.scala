package com.jason.scala

class LazyDemo {

}

object LazyDemo1{
  def init():Unit={
    println("init method...")
  }

  def load():Unit={
    println("load...")
  }

  def main(args: Array[String]): Unit = {
//    val init = init()
    lazy val lasy = init()
    println("after...")
    println(lasy)

    load()


  }
}
