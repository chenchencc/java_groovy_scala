
object Number {
  def main(args: Array[String]): Unit = {
    val i = 257
    println(i)

    val list1 = List(10,9,11,2,3,5,6,8)

//    val listt = list1.map(_.*(2))

    val list2 = list1.filter(i=>i%2==0)
    println(list2)

    val list3 = list2.reverse
    println(list3)

//    val list4 = list3.sorted

    val list5=list3.map(i=>i*i)
    println(list5)
  }

}
