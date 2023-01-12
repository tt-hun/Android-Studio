package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_register.setOnClickListener {
            // var : 값이 언제든지 변경될 수 있는 변수
            // val : 자바에서 final, 값이 변경되지 못하는 변수

            val intent = Intent(this, SubActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            startActivity(intent)

        }
    }
}