package com.example.kenzovwa.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kenzovwa.coderswag.Model.Product
import com.example.kenzovwa.coderswag.R
import com.example.kenzovwa.coderswag.Utilities.EXTRA_CATEGORY
import com.example.kenzovwa.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product=intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(product.image,"drawable",this.packageName)
        detailedImage.setImageResource(resourceId)
        productDesc.text=product.desc
        productName.text=product.title
        productPrice.text=product.price

    }
}
