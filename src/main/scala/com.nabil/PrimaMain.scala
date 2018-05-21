package com.nabil

object PrimaMain {

  private def checkPrima(value: Int) = {
    var counter = 0
    for(i<-2 to value){
      if(value % i == 0){
        counter += 1
      }
    }
    if(value > 0 && counter == 1){
      true
    } else {
      false
    }
  }

  private def getPrima(limit : Int) = {
    for (i <- 1 to limit) {
      if(checkPrima(i)){
        print(s"${i} -")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println("Masukan Berapa jumlah Bilangan Prima : ")
    val n = readInt()
    getPrima(n)
  }
}
