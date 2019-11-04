package dsalgo.basic

/**
 * Created by ngupta on 4/11/2019 AD.
 */
class FunctionBasic {

  def min(a: Int, b: Int): Int = {
    if (a < b) a
    else b
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a
    else b
  }

  def average(a: Int, b: Int): Double = {
    (a + b) / 2.0
  }


}

object Test extends App {
  val function = new FunctionBasic
  println(function.min(2, 3))
  println(function.max(2, 3))
  println(function.average(2, 3))
}