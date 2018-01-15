package demos.libraries

import org.objenesis.ObjenesisStd

object MessingWithScala extends App {
  val objenesis = new ObjenesisStd()
  val newObject = objenesis.newInstance(MyObject.getClass)

  MyObject.something = 42

  println(MyObject)
  println(newObject)
}

object MyObject {
  var something = 0

  override def toString: String = s"MyObject: $something"
}
