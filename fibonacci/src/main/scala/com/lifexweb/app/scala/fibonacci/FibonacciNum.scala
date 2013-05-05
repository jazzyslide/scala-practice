package com.lifexweb.app.scala.fibonacci

/**
 * User: Hideya Kato
 * Return Fibonacci Number
 */
object FibonacciNum {
  def main(args: Array[String]) {
    calcFibonacciNum(args(0).toLong)
  }

  def calcFibonacciNum(num:Long): Long = {
    num match {
      case 0 => 0
      case 1 => 1
      case _ => calcFibonacciNum(num - 2) + calcFibonacciNum(num - 1)
    }
  }
}
