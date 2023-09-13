package com.design.pattern.uml

class Client(
    private val server: Server,
) {

    fun work() {
        server.open()
        server.print("Hello")
        server.close()
    }
}

class Server(
    private val device: Device,
){

    fun open() {

    }

    fun print(letter: String) {
        device.write(letter)
    }

    fun close() {

    }
}

class Device {
    fun write(letter: String) {
        println("$letter 작성 완료")
    }
}