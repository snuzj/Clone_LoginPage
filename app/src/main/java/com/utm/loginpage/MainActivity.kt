package com.utm.loginpage


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUp = findViewById<TextView>(R.id.signUp)
        val signIn = findViewById<TextView>(R.id.signIn)
        val signUpLayout = findViewById<LinearLayoutCompat>(R.id.signUpLayout)
        val logInLayout = findViewById<LinearLayoutCompat>(R.id.logInLayout)
        val logInButton = findViewById<Button>(R.id.logInButton)
        val signUpButton = findViewById<Button>(R.id.signUpButton)
        val signByFB = findViewById<Button>(R.id.facebook)
        val signByGoogle = findViewById<Button>(R.id.google)
        val signByTwitter = findViewById<Button>(R.id.twitter)

        signUp.setOnClickListener{
            signUp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            signUp.setTextColor(resources.getColor(R.color.textColor, null))
            signIn.setTextColor(resources.getColor(R.color.pinkColor,null))
            signIn.setTextColor(resources.getColor(R.color.pinkColor,null))
            signIn.background = null
            signUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
        }
        signIn.setOnClickListener {
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.pinkColor, null))
            signIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            signIn.setTextColor(resources.getColor(R.color.textColor,null))
            signUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
        }
        logInButton.setOnClickListener{
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }
        signUpButton.setOnClickListener{
            Toast.makeText(this, "Sign up successfully!", Toast.LENGTH_SHORT).show()
        }
        signByFB.setOnClickListener {
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }
        signByTwitter.setOnClickListener {
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }
        signByGoogle.setOnClickListener {
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }

    }

}