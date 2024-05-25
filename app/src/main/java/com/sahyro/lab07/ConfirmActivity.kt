package com.sahyro.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sahyro.lab07.databinding.ActivityConfirmBinding
import com.sahyro.lab07.databinding.ActivityMainBinding

class ConfirmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConfirmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtVName.text = intent.getStringExtra("name")
        binding.txtVAddress.text = intent.getStringExtra("address")
        binding.txtVCity.text = intent.getStringExtra("city")
        binding.txtVState.text = intent.getStringExtra("state")
        binding.txtVPostcode.text = intent.getStringExtra("postal")
        binding.txtVCountry.text = intent.getStringExtra("country")

        binding.btnConfirm.setOnClickListener {
            val intent = Intent(this, FinishActivity::class.java)
            startActivity(intent)
        }

        binding.btnCancel.setOnClickListener {
            finish()
        }


    }
}