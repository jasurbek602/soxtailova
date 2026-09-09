package com.example.poyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.poyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Kirish ekranidagi bitta tugma.
        // Bu yerga keyinchalik login/navigatsiya logikasini qo'shishingiz mumkin.
        binding.btnEnter.setOnClickListener {
            Toast.makeText(this, "Xush kelibsiz!", Toast.LENGTH_SHORT).show()
        }
    }
}
