package com.vcc.kingidsdkkotlin

interface OnKingIdResponse<T> {
    fun onSuccess(data: T)

    fun onFailed(e: KingIdException)
}
