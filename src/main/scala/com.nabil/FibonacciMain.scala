package com.nabil

object FibonacciMain {


  def main(args: Array[String]): Unit = {
    println("MASUKAN JUMLAH ANGKA FIBONACCI : ")
    val n = readInt()
    var fib : List[Int] = List(0,1)

    for(i <- 2 to n){
      fib = fib :+ (fib(i-1) + fib(i-2))
    }

    for(i <- 0 to n){
      print(s"${fib(i)} ")
    }
  }
}

