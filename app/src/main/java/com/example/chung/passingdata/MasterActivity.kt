package com.example.chung.passingdata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_master.*

class MasterActivity : AppCompatActivity() {

    companion object {
        val PASSING_DATA = "Passing Data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master)
    }

    fun sendMessage(view: View) {
        val message = editPlainText.text.toString()
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra(PASSING_DATA, message)
        }

        startActivity(intent)
    }
}
