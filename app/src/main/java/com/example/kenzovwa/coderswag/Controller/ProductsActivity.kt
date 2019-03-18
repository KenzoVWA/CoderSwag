package com.example.kenzovwa.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.kenzovwa.coderswag.Adapters.ProductRecycleAdapter
import com.example.kenzovwa.coderswag.R
import com.example.kenzovwa.coderswag.Services.DataService
import com.example.kenzovwa.coderswag.Utilities.EXTRA_CATEGORY
import com.example.kenzovwa.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductRecycleAdapter(this,DataService.getProducts(categoryType)){
            product -> val descriptionIntent = Intent(this,ProductDetailActivity::class.java)
            descriptionIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(descriptionIntent)
        }

        var layoutManager = GridLayoutManager(this,2   )
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
