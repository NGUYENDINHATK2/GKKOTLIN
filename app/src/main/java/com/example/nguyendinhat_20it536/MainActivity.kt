package com.example.nguyendinhat_20it536

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nguyendinhat_20it536.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {

            if(binding.username.text.isNotEmpty()&&binding.userpass.text.isNotEmpty()&&binding.usermail.text.isNotEmpty()){

                    val dataoutput=ArrayList<String>()
                    dataoutput.add(binding.username.text.toString())
                    dataoutput.add(binding.userpass.text.toString())
                    dataoutput.add(binding.usermail.text.toString())
                    val intent: Intent = Intent (this, ActivityInformation::class.java)



                    intent.putExtra("data", dataoutput) // data: tên của kiểu dữ liệu được gửi, "Hello screen2!": giá trị data được gửi đi
                    startActivity(intent)

            }
            else{
                binding.nametag.text ="Vui Lòng Nhập Dữ Liệu"
            }

        }
    }
}