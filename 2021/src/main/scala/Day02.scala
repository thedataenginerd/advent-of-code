// Day 02: Dive!

import io.Source

@main def day02(): Unit =
  val commands: Seq[(String, Int)] = Source.fromResource("input/day_02")
    .getLines
    .toSeq
    .map(_.split(" "))
    .map(x => (x(0), x(1).toInt))

  println(s"Part one: ${partOne(commands)}")
  println(s"Part two: ${partTwo(commands)}")

def partOne(input: Seq[(String, Int)]): Int =
  var horizontal = 0
  var depth = 0
  input.foreach(
    (cmd, value) => cmd match
      case "forward" => horizontal += value
      case "down" => depth += value
      case "up" => depth -= value
  )
  horizontal * depth

def partTwo(input: Seq[(String, Int)]): Int =
  var horizontal = 0
  var depth = 0
  var aim = 0
  input.foreach(
    (cmd, value) => cmd match
      case "forward" =>
        horizontal += value
        depth += aim * value
      case "down" => aim += value
      case "up" => aim -= value
  )
  horizontal * depth
