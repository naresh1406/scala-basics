package dsalgo.basic

/**
 * Created by ngupta on 28/10/2019 AD.
 */
object ArrayBasic extends App {
  var days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  println("Array elements are -> ")
  for (day <- days) {
    println(day)
  }

  println("Accessing second element of the array -> " + days(1))

  //Updating an element in array
  days(0) = "Funday"

  println("After updation array elements are -> ")
  for (day <- days) {
    println(day)
  }

  var months = Array("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")

  var monthsDays = Array.concat(months, days)

  println("After concating months and days array are -> ")
  for (md <- monthsDays) {
    println(md)
  }

  var multiDimArray = Array.ofDim[String](2, 3)
  multiDimArray(0)(0) = "1"
  multiDimArray(0)(1) = "2"
  multiDimArray(0)(2) = "3"
  multiDimArray(1)(0) = "4"
  multiDimArray(1)(1) = "5"
  multiDimArray(1)(2) = "6"

  var row = multiDimArray.size
  var col = multiDimArray(0).size

  for {
    i <- 0 until row
    j <- 0 until col
  } println(s"($i)($j) = ${multiDimArray(i)(j)}")


  var alphabet = Array('c', 'd', 'e')
  println("alphabet array elements are -> ")
  for (al <- alphabet)
    println(al)

  //append 'f' in alphabet array
  alphabet = alphabet :+ 'f'

  println("alphabet array elements after append are -> ")
  for (al <- alphabet)
    println(al)

  //prepend 'f' in alphabet array
  alphabet = 'b' +: alphabet

  println("alphabet array elements after prepend are -> ")
  for (al <- alphabet)
    println(al)

}
