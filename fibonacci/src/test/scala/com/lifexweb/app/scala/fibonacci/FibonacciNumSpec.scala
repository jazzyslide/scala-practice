package com.lifexweb.app.scala.fibonacci
import org.specs2.mutable._

class FibonacciNumSpec extends Specification{
  "FibonacciNum#calcFibonacciNum" should {

    "return 0 when input is 0" in {
      FibonacciNum.calcFibonacciNum(0) must be_==(0)
    }

    "return 1 when input is 1" in {
      FibonacciNum.calcFibonacciNum(1) must be_==(1)
    }

    "return 2 when input is 3" in {
      FibonacciNum.calcFibonacciNum(3) must be_==(2)
    }

    "return 267,914,296 when input is 42" in {
      FibonacciNum.calcFibonacciNum(42) must be_==(267914296L)
    }
  }
}
