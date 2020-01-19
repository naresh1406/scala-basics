package dsalgo.basic

/**
 * Created by ngupta on 31/10/2019 AD.
 */
object MapBasic extends App {
  val map = Map(1 -> 'a', 2 -> 'b', 3 -> 'c') //by default scala Map is immutable
  println(map)

  val mutableMap = scala.collection.mutable.Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
  println(mutableMap)
  mutableMap(1) = "update"
  println(mutableMap)

}
