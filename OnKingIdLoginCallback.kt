package com.vcc.kingidsdkkotlin

import com.vcc.kingidsdkkotlin.entities.AccessToken

interface OnKingIdLoginCallback {
    abstract fun onSuccess(accessToken: AccessToken)

    abstract fun onFailed(kingIdException: KingIdException)

    abstract fun onCancel()
}
