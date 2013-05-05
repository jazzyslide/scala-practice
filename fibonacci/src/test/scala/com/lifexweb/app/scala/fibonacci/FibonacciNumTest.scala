package com.lifexweb.app.scala.fibonacci

import org.scalatest.FunSuite

class FibonacciNumTest extends FunSuite {

  // when input number is zero, output should be 0
  test("FibonacciNum#calcFibonacciNum returns 0 when input is 0") {
    assert(FibonacciNum.calcFibonacciNum(0) === 0)
  }
  test("FibonacciNum#calcFibonacciNum returns 1 when input is 1") {
    assert(FibonacciNum.calcFibonacciNum(1) === 1)
  }
  test("FibonacciNum#calcFibonacciNum returns 1 when input is 2") {
    assert(FibonacciNum.calcFibonacciNum(2) === 1)
  }
  test("FibonacciNum#calcFibonacciNum returns 2 when input is 3") {
    assert(FibonacciNum.calcFibonacciNum(3) === 2)
  }
  test("FibonacciNum#calcFibonacciNum returns 267,914,296 when input is 42") {
    assert(FibonacciNum.calcFibonacciNum(42) === 267914296L)
  }
}
