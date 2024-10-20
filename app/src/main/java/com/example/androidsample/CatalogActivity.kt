package com.example.androidsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidsample.databinding.ActivityCatalogBinding

class CatalogActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCatalogBinding

    // List of catalog items
    private val items = listOf(
        CatalogItem(R.string.imageCard1, R.drawable.taylor_swift, R.string.desc_si_taylor),
        CatalogItem(R.string.imageCard2, R.drawable.john_mayer, R.string.desc_si_john),
        CatalogItem(R.string.imageCard3, R.drawable.rhoma_irama, R.string.desc_si_rhoma)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners dynamically
        binding.image1.setOnClickListener {
            openDetailActivity(items[0])
        }

        binding.image2.setOnClickListener {
            openDetailActivity(items[1])
        }

        binding.image3.setOnClickListener {
            openDetailActivity(items[2])
        }
    }

    // Open detail activity with the selected item
    private fun openDetailActivity(item: CatalogItem) {
        val intent = Intent(this, ItemDetailActivity::class.java)
        intent.putExtra("ITEM_NAME", getString(item.name))
        intent.putExtra("IMAGE_RES_ID", item.imageResId)
        intent.putExtra("ITEM_DESC", getString(item.desc))
        startActivity(intent)
    }
}