package com.ayeshaazeema.dzikirapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayeshaazeema.dzikirapp.databinding.ActivityDetailArtikelBinding
import com.ayeshaazeema.dzikirapp.model.Artikel

class DetailArtikelActivity : AppCompatActivity() {

    private lateinit var detailArtikelBinding: ActivityDetailArtikelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailArtikelBinding = ActivityDetailArtikelBinding.inflate(layoutInflater)
        setContentView(detailArtikelBinding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Artikel Islami"

        val dataArtikel = intent.getParcelableExtra<Artikel>("data")

        detailArtikelBinding.ivDetailArtikel.setImageResource(dataArtikel!!.imageArtikel)
        detailArtikelBinding.tvTitleDetailArtikel.text = dataArtikel.titleArtikel
        detailArtikelBinding.tvDescDetailArtikel.text = dataArtikel.descArtikel
    }
}