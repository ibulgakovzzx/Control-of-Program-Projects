package com.ibulgakov.clientcontrolpc.utils

object LoginController {

    val LOGIN = "LOGIN"
    private val IS_LOGGED_IN = "IS_LOGGED_IN"

    val isLoggedIn: Boolean
        get() = Prefs.get().getBoolean(IS_LOGGED_IN, false)

    fun login(userName: String) {
        Prefs.edit()
                .putString(LOGIN, userName)
                .putBoolean(IS_LOGGED_IN, true)
                .apply()

    }


    fun logout()  {
        Prefs.edit()
                .putBoolean(IS_LOGGED_IN, false)
                .apply()
    }
}
