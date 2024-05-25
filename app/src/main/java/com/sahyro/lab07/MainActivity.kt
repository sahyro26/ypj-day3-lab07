package com.sahyro.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sahyro.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnschedule.setOnClickListener {
            val intent = Intent(this, ConfirmActivity::class.java)
            intent.putExtra("name", binding.edtName.text.toString())
            intent.putExtra("address", binding.edtAddress.text.toString())
            intent.putExtra("city", binding.edtCity.text.toString())
            intent.putExtra("state", binding.edtState.text.toString())
            intent.putExtra("postal", binding.edtPostal.text.toString())
            intent.putExtra("country", binding.edtCountry.text.toString())
            startActivity(intent)
        }
    }
}