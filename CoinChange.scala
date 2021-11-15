 object CoinChange {

  def main(args: Array[String]): Unit = {

    val typeOfCoins : List[Int] = List(1,2,5)
    val listLength : Int = typeOfCoins.length
    println(countCoins(typeOfCoins, listLength,amountPassed=8))

    def countCoins(typeOfCoins :List[Int], listLength : Int, amountPassed : Int ) : Int = {

      if (amountPassed == 0) 1
      else 0

      return countCoins(typeOfCoins, listLength - 1, amountPassed) + countCoins(typeOfCoins, listLength, amountPassed - typeOfCoins(listLength - 1))

    }



  }

}
