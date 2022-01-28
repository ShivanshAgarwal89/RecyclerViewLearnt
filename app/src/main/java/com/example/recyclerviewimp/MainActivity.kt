package com.example.recyclerviewimp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = RecAdapter(fetch_data())


    }

    private fun fetch_data(): ArrayList<item_data> {

       val ans = arrayListOf<item_data>()
        for (i in 1..20)
        {
            ans.add(item_data(getString(R.string.learn_coding_from_pokhu_sir),getString(R.string.welcom_to_pokhu_academy_pyaar_hua_ikraar_hua_hai_pyaar_mei_kaise)))
        }
        return ans
    }


}