package dsalgo.interviewbit

/**
 * Created by ngupta on 4/11/2019 AD.
 */
object ArrayBug extends App {
  val A = Array(1, 2, 3, 4, 5, 6)
  val B = 3

  println(s"Array ASeq ${A.toSeq} after rotating $B position is ${rotateArray(A, B).toSeq}")

  def rotateArray(A: Array[Int], B: Int): Array[Int] = {
    val rotate = A.clone()
    for (i <- 0 until A.size) {
      rotate.update((i + B) % A.size, A(i))
    }
    rotate
  }

}
