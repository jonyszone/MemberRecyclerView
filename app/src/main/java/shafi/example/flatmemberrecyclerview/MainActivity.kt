package shafi.example.flatmemberrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import shafi.example.flatmemberrecyclerview.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val memberRV = findViewById<RecyclerView>(R.id.memberRV)
        val memberAdapter = MemberAdapter(this, Member.memberArrayList())
        val linearLayoutManager = LinearLayoutManager(this)
        memberRV.layoutManager = linearLayoutManager
        memberRV.adapter = memberAdapter
    }
}