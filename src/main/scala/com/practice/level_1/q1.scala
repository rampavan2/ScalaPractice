package com.practice.level_1

import scala.collection.convert.ImplicitConversions.`seq AsJavaList`

// Find the largest and smallest elements in an Array
object q1 extends App {
  var l1 = List(12, 45, 7, 89, 23, 56, 3, 99, 34)
  var l2 = l1.sorted
  l2.foreach(println)
}
