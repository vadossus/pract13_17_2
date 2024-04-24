package com.example.application13_7_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)
    }

    fun back_to_main_screen(view: View) {
        val intent = Intent(this, MainScreenActivity::class.java)
        startActivity(intent)
    }

    fun exit(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}