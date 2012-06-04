package com.mayera.portfolio

class Portfolio(
val name: String,
val composition: List[Company],
val proportions: List[Int]
) {
override def toString = name

}