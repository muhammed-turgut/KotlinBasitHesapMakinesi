package com.muhammedturgut.kotlinbasithesapmakinesi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muhammedturgut.kotlinbasithesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var sayiBir: String
    lateinit var sayiIki: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Düğmelere tıklama olaylarını ayarlayın
        binding.toplama.setOnClickListener {
            onClickToplama()
        }

        binding.cikarma.setOnClickListener {
            onClickCikarma()
        }

        binding.bolme.setOnClickListener {
            onClickBolme()
        }

        binding.carpma.setOnClickListener {
            onClickCarpma()
        }
    }

    private fun onClickToplama() {
        sayiBir = binding.girisbir.text.toString()
        sayiIki = binding.girisiki.text.toString()

        val sayiBirFloat = sayiBir.toFloatOrNull()//Bu kullanımak sorundan
        val sayiIkiFloat = sayiIki.toFloatOrNull()

        if (sayiBirFloat != null && sayiIkiFloat != null) {
            val sonuc = sayiBirFloat + sayiIkiFloat
            binding.result.setText("Sonuç: $sonuc")
        } else {
            binding.result.setText("Lütfen geçerli bir sayı girin")
        }
    }

    private fun onClickCikarma() {
        sayiBir = binding.girisbir.text.toString()
        sayiIki = binding.girisiki.text.toString()

        val sayiBirFloat = sayiBir.toFloatOrNull()
        val sayiIkiFloat = sayiIki.toFloatOrNull()

        if (sayiBirFloat != null && sayiIkiFloat != null) {
            val sonuc = sayiBirFloat - sayiIkiFloat
            binding.result.setText("Sonuç: $sonuc")
        } else {
            binding.result.setText("Lütfen geçerli bir sayı girin")
        }
    }

    private fun onClickBolme() {
        sayiBir = binding.girisbir.text.toString()
        sayiIki = binding.girisiki.text.toString()

        val sayiBirFloat = sayiBir.toFloatOrNull()
        val sayiIkiFloat = sayiIki.toFloatOrNull()

        if (sayiBirFloat != null && sayiIkiFloat != null) {
            if (sayiIkiFloat != 0f) {
                val sonuc = sayiBirFloat / sayiIkiFloat
                binding.result.setText("Sonuç: $sonuc")
            } else {
                binding.result.setText("Bölen 0 olamaz!")
            }
        } else {
            binding.result.setText("Lütfen geçerli bir sayı girin")
        }
    }

    private fun onClickCarpma() {
        sayiBir = binding.girisbir.text.toString()
        sayiIki = binding.girisiki.text.toString()

        val sayiBirFloat = sayiBir.toFloatOrNull()
        val sayiIkiFloat = sayiIki.toFloatOrNull()

        if (sayiBirFloat != null && sayiIkiFloat != null) {
            val sonuc = sayiBirFloat * sayiIkiFloat
            binding.result.setText("Sonuç: $sonuc")
        } else {
            binding.result.setText("Lütfen geçerli bir sayı girin")
        }
    }
}
