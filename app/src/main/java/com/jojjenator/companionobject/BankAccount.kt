package com.jojjenator.companionobject

class BankAccount(val name: String, val age: Int) {

    companion object{
        fun createAccount(name: String, age: Int): BankAccount?{
            val accountInstance = BankAccount(name, age)

            return if (accountInstance.validateAccount()) {
                accountInstance
            } else {
                null
            }
        }
    }

    fun validateAccount() : Boolean{
        return age > 17
    }
}