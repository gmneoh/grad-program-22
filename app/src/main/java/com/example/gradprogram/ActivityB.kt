package com.example.gradprogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        this.supportActionBar?.title = "Activity B"
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.setDisplayShowHomeEnabled(true)

        val fragment: ActivityBFragment = ActivityBFragment.newInstance(
            intent.getStringExtra("string").toString()
        )

        val webViewFragment: WebViewFragment = WebViewFragment.newInstance()

        supportFragmentManager
            .beginTransaction()
//            .add(R.id.fragment_container_view_tag, fragment)
            .add(R.id.fragment_container_view_tag, webViewFragment)
            .commit()

    }

    override fun onSupportNavigateUp(): Boolean {
        super.onBackPressed()
        return true
    }
}
