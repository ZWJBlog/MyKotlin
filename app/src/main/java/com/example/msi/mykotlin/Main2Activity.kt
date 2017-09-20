package com.example.msi.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn = findViewById(R.id.btn)
        btn.setOnClickListener {   Toast.makeText(this, "sum is 12344", 1).show();  }
        val sum = sum(1, 2);
        println("sum is ${sum(1, 2)}");

        val array = 1..100
        for (value in array) {
            println("value = $value")
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}
