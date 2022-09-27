package com.jojjenator.companionobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jojjenator.companionobject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.apply {
            btnNull.setOnClickListener{
                val account = BankAccount.createAccount("johan", 10)
                println(account?.name)
                println("This user is NOT over 17years old, no new instance of bankaccount is created")
            }

            btnValidated.setOnClickListener{
                val Account1 = BankAccount.createAccount("oskar", 20)
                println("This account is validated")
                println("${Account1?.name} is over 17years old")
            }
        }
    }
}