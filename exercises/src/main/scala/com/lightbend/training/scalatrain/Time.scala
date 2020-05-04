package com.lightbend.training.scalatrain

case class Time(hours: Int = 0, minutes: Int = 0) {
//  require(0 <= hours && hours <= 23)
//  require(0 <= minutes && minutes <= 59)
//  private def between(elem: Int, a: Int, b: Int): Boolean = (a <= elem && elem <= b)

  require(fIsBetween(hours, 0, 23), "hours should be in 0 .. 23")
  require(fIsBetween(minutes, 0, 59), "minutes should be in 0 .. 59")
  private def fIsBetween: (Int, Int, Int) => Boolean = (elem, a, b) => a <= elem && elem <= b

  val asMinutes: Int = hours * 60 + minutes

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)
}
object Time {
  def fromMinutes(minutes: Int): Time = {
    val hours = minutes / 60
    val mins = minutes % 60
    Time(hours, mins)
  }
}
