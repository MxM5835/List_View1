package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.list_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var nameList = ArrayList<String>()
        nameList.add("Серега")
        nameList.add("Леха")
        nameList.add("Егор")
        nameList.add("Семен")
        nameList.add("Динис")
        nameList.add("Степан")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nameList)
        binding.listView.adapter = adapter
        binding.listView.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "Pressed item position : ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}