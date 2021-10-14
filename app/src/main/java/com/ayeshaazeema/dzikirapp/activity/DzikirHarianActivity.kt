package com.ayeshaazeema.dzikirapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayeshaazeema.dzikirapp.adapter.DzikirDoaAdapter
import com.ayeshaazeema.dzikirapp.databinding.ActivityDzikirHarianBinding
import com.ayeshaazeema.dzikirapp.model.DzikirDoa

class DzikirHarianActivity : AppCompatActivity() {

    private lateinit var dzikirHarianBinding: ActivityDzikirHarianBinding
    private var listDzikirDoaHarian: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dzikirHarianBinding = ActivityDzikirHarianBinding.inflate(layoutInflater)
        setContentView(dzikirHarianBinding.root)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        listDzikirDoaHarian.clear()

        dzikirHarianBinding.rvDzikirHarian.layoutManager = LinearLayoutManager(this)
        dzikirHarianBinding.rvDzikirHarian.adapter = DzikirDoaAdapter(listDzikirDoaHarian)
    }
}