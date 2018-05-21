package com.nabil

object DeretMain {
  def main(args: Array[String]): Unit = {
    val input = "1.345.679"
    var counter = 0
    var temp : List[String] = List()
    while(counter < input.length){
      if(input.charAt(counter) != '.'){
        temp = temp :+ input.charAt(counter).toString
      }
      counter += 1
    }
    var j = 0
    for(i<-0 to temp.length-1){
      var counter = ""
      while(j < temp.length-1){
        counter = counter + '0'
        j += 1
      }
      println(s"${temp(i)}${counter}")
      j = i + 1
    }
  }
}
