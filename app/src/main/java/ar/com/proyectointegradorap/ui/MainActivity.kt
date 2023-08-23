package ar.com.proyectointegradorap.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import ar.com.proyectointegradorap.MainViewModel
import ar.com.proyectointegradorap.R
import ar.com.proyectointegradorap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCompare.setOnClickListener {
            compareText()
        }
    }

    private fun compareText() {
        if (binding.etEditOne.text.isEmpty() || binding.etEditTwo.text.isEmpty()) {
            binding.tvResult.text = getString(R.string.enter_something)
        } else {
            if (viewModel.isTextSame(binding.etEditOne.text.trim().toString(), binding.etEditTwo.text.trim().toString())){
                binding.tvResult.text = getString(R.string.same)
            } else {
                binding.tvResult.text = getString(R.string.not_same)
            }
        }
    }
}