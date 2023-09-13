package com.design.pattern.uml

abstract class Person(
    val age: Int,
) {

    abstract fun go()

    fun eat() {
        println("eat")
    }

}

class Student(
    age: Int,
) : Person(age) {

    override fun go() {
        println("go school")
    }
}