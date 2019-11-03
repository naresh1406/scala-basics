package dsalgo.basic

/**
 * Created by ngupta on 3/11/2019 AD.
 */
object ControlStatements extends App {

  // if
  val a = 50
  if (a > 30) {
    println("a > 30")
  }

  //if else

  val b = 100
  if (a > b) {
    println("if statement a > b")
  } else {
    println("else statement a < b")
  }

  // for loop
  for (i <- 1 to 10) {
    println(i)
  }

  // multiple values in for loop
  for (i <- 1 to 3; j <- 1 to 4) {
    println(s"$i * $j = ${i * j}") // s' string use
  }

  // for loop with filter
  for (i <- 1 to 10 if (i % 2 == 0)) {
    println(i) // print only even numbers in 1 to 10
  }

  // for loop with yield -- very important
  for {i <- 1 to 10 if (i % 2 == 1)}
    yield println(i)

}
