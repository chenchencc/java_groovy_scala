package com.jason.scala

class Map {

}
import scala.collection.mutable.Map
object map{
  def main(args: Array[String]): Unit = {
    var map = Map("jason"->"Meituan","Chenchen"->"Alibaba")
//    map++("cc","Tencent")
//    map.toMap.
    println(map)
    println(map("jason"))
//    map+=("JJ","a")
    println(map.getOrElse("C",-1))
    val tuple = ("Jason","Meituan",1,4,("CC",0))
//    println(tuple.getClass.getName)
    println(tuple._2)
    println(tuple._5._1)
  }
}
