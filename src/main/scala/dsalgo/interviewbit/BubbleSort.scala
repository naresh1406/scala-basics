package dsalgo.interviewbit

/**
 * Created by ngupta on 3/11/2019 AD.
 */
object BubbleSort extends App {
  var arr = Array(5, 6, 2, 6, 9, 0, -1)
  println(s"before sort ${arr.toSeq}")
  sort(arr)
  println(s"after sort ${arr.toSeq}")

  def sort(arr: Array[Int]) {
    for (i <- 0 until arr.length) {
      for (j <- 0 until arr.length - 1 - i) {
        if (arr(j) > arr(j + 1)) {
          var temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
  }
}