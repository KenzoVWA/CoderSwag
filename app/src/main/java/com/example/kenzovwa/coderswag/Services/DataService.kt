package com.example.kenzovwa.coderswag.Services

import com.example.kenzovwa.coderswag.Model.Category
import com.example.kenzovwa.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18","hat1" , "Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hat Black", "$20","hat2","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hat White", "$18","hat3","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hat Snapback", "$22","hat4","Hey im a description for a product and im longggggggg")

    )

    val hoodies = listOf(
        Product("Devslopes Graphic Hoodie", "$22","hoodie1","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hoodie Black", "$38","hoodie2","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hoodie White", "$22","hoodie3","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hoodie Snapback", "$42","hoodie4","Hey im a description for a product and im longggggggg")
    )

    val shirts = listOf(
        Product("Devslopes Graphic Shirt", "$10","shirt1","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Shirt Black", "$12","shirt2","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Shirt White", "$12","shirt3","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Hustle", "$13","shirt4","Hey im a description for a product and im longggggggg"),
        Product("Devslopes Studios", "$15","shirt5","Hey im a description for a product and im longggggggg")
    )

    val digitalgoods = listOf<Product>(


    )

    fun getProducts(category: String): List<Product>{
       return when(category){
            "SHIRTS" ->  shirts
            "HOODIES" ->  hoodies
            "HATS" ->  hats
            else ->  digitalgoods
        }
    }

}