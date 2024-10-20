package com.example.androidsample

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_details)

        val itemName = intent.getStringExtra("ITEM_NAME") ?: "Unknown"
        val imageResId = intent.getIntExtra("IMAGE_RES_ID", R.drawable.placeholder_image)
        val itemDesc = intent.getStringExtra("ITEM_DESC") ?: "No desc"

        findViewById<TextView>(R.id.detailName).text = itemName
        findViewById<ImageView>(R.id.detailImage).setImageResource(imageResId)
        findViewById<TextView>(R.id.detailDesc).text = itemDesc
    }
}
