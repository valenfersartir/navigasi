package com.example.belajar_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.belajar_navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
//            binding.button.setOnClickListener{
//            var nilaiA = binding.inputA.text.toString().toInt()
//            var nilaiB = binding.inputB.text.toString().toInt()
//            var hasil = jumlah(nilaiA, nilaiB)
//            binding.textView3.setText(hasil)
//        }
//    }
//
//    private fun jumlah(a: Int, b: Int): Int{
//        return a + b
//    }
//}