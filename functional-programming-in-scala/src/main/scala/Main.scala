//* Hello! *//

object Chapter02 {

  // Exercise 2.1
  def fib(n: Int): Int = {
      @annotation.tailrec
      def go(n: Int, a: Int, b: Int): Int =
          // base case
          if (n == 0) a
          else go(n-1, b, a + b)
      go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
      println(fib(4))
  }
}