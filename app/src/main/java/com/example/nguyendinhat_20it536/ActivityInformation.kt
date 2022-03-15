package com.example.nguyendinhat_20it536

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nguyendinhat_20it536.databinding.ActivityInformationBinding


class ActivityInformation:AppCompatActivity() {
    companion object {
        var  data =  ArrayList<ItemsViewModel>()
    }
    private lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerview = binding.recyclerview
        recyclerview.layoutManager = LinearLayoutManager(this)



        val datainput : ArrayList<String>?= intent.getStringArrayListExtra("data")

        binding.username.text=datainput?.get(0)
        binding.userpass.text=datainput?.get(1)
        binding.usermail.text=datainput?.get(2)

        data.add(ItemsViewModel("ssss"))
        val adapter = RecyclerAdapter(data)
        recyclerview.adapter = adapter




    }
    override fun onResume() {
        super.onResume()
        binding.recyclerview.adapter?.notifyDataSetChanged()
    }
}