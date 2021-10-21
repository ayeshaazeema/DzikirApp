package com.ayeshaazeema.dzikirapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayeshaazeema.dzikirapp.adapter.DzikirDoaAdapter
import com.ayeshaazeema.dzikirapp.databinding.ActivityPetangBinding
import com.ayeshaazeema.dzikirapp.model.DataDzikirDoa
import com.ayeshaazeema.dzikirapp.model.DzikirDoa

class PetangActivity : AppCompatActivity() {

    private lateinit var petangBinding: ActivityPetangBinding
    private var listDzikirDoa: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        petangBinding = ActivityPetangBinding.inflate(layoutInflater)
        setContentView(petangBinding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        showRecyclerList()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showRecyclerList() {
        listDzikirDoa.clear()
        listDzikirDoa.addAll(DataDzikirDoa.listDzikirPetang)

        petangBinding.rvDzikirPetang.setHasFixedSize(true)
        petangBinding.rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        petangBinding.rvDzikirPetang.adapter = DzikirDoaAdapter(listDzikirDoa)
    }

    companion object {
        fun getLaunchService(from: Context) = Intent(from, PetangActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
}