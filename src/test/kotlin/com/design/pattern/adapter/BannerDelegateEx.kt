package com.design.pattern.adapter


class PrintBannerV2(
    letter: String,
) : Print {
    private val banner: Banner = Banner(letter)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }


}