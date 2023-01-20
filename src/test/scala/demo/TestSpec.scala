package demo

import demo.TestSpec.SampleException
import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestSpec extends AnyFunSuite {
  test("App has a greeting") {
    throw SampleException
  }
}
object TestSpec {
  object SampleException extends Exception("Sample exception which causes gradle test executor crash")
}