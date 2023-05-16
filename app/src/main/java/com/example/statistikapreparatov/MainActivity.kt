package com.example.statistikapreparatov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.statistikapreparatov.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter = PreparatAdapter{
        onItemClick(it)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerview.adapter = adapter
        val intent = Intent(this, EditActivity::class.java)
        binding.pluscontent.setOnClickListener {
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        adapter.preparatList.clear()
        adapter.preparatList.addAll((application as MayApp).listPreparats)
        adapter.notifyDataSetChanged()
    }
    fun onItemClick(Id: Int) {
        Log.d("MayLog", "$Id")
    }
}