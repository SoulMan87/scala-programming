package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }
  println(someValue)
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
