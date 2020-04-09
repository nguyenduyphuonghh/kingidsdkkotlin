package com.vcc.kingidsdkkotlin

class KingIdException(code: Int, message: String) : Exception(message) {

    private var errorCode: Int = 0
        get() {
            return errorCode
        }
        set(value) {
            field = value
        }

    init {
        errorCode = code
    }
}