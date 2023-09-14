package com.design.pattern.adapter

open class Banner(
    private val letter: String,
) {
    fun showWithParen() {
        println("($letter)")
    }

    fun showWithAster() {
        println("*$letter*")
    }
}

interface Print {
    fun printWeak()
    fun printStrong()
}

class PrintBanner(
    letter: String
) : Banner(letter), Print {
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}



