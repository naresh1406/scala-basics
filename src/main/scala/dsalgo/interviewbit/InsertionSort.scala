package dsalgo.interviewbit

/**
 * Created by ngupta on 3/11/2019 AD.
 */
object InsertionSort extends App {
  var arr = Array(5, 6, 2, 6, 9, 0, -1)
  println(s"before sort ${arr.toSeq}")
  sort(arr)
  println(s"after sort ${arr.toSeq}")

  def sort(arr: Array[Int]) {
    for (i <- 1 until arr.length) {
      val key = arr(i)
      var j = i - 1
      while (j >= 0 && arr(j) > key) {
        arr(j + 1) = arr(j)
        j = j - 1
      }
      arr(j + 1) = key
    }
  }
}