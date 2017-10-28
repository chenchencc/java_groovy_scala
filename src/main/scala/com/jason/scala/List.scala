package com.jason.scala

class List {

}
import scala.collection.mutable._
object List1{
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    //list+=4
    val list1 = 0::list // 0+:list相等
    println(list1)
   // list.+:(4)
    var list3 = list.+:(5)
    var ll = list:+6
    println(ll)
    val lll = list++ll
    println(lll)

    var buffer = ListBuffer(1,2)
    buffer+=4
    println(buffer)
  }
}
