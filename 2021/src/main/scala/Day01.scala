// Day 01: Sonar Sweep

import scala.io.Source

@main def day01(): Unit =
  val depths: Seq[Int] = Source.fromResource("input/day_01")
    .getLines
    .map(_.toInt)
    .toSeq

  println(s"Part one: ${partOne(depths)}")
  println(s"Part two: ${partTwo(depths)}")

def partOne(input: Seq[Int]): Int =
  val pairs: Seq[(Int, Int)] =
    for (i <- 0 until input.length - 1)
      yield (input(i), input(i + 1))
  pairs.count((x, y) => x < y)

def partTwo(input: Seq[Int]): Int =
  val pairs: Seq[(Int, Int)] =
    for (i <- 0 until input.length - 3)
      yield (input(i), input(i + 3))
  pairs.count((x, y) => x < y)
