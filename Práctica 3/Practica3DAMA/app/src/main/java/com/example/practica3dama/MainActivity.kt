package com.example.practica3dama

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lista de imágenes y descripciones
        val images = listOf(
            R.drawable.img0 to "La Tumba de las Luciernagas",
            R.drawable.img1 to "El Castillo Ambulante",
            R.drawable.img2 to "El Viaje de Chihiro"
        )
        // Configurar ViewPager2
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val adapter = ImagePagerAdapter(images)
        viewPager.adapter = adapter
    }
}