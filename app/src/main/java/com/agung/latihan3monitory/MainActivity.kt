package com.agung.latihan3monitory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.agung.latihan3monitory.databinding.ActivityMainBinding

/**
 *
 * =========================================================================================
 * This project was created to fulfill the assignment of Mobile Computing Application course.
 *
 *                              Universitas Komputer Indonesia
 * =========================================================================================
 *
 * Author's Information
 * ==========================
 * NIM      : 10118902
 * Name     : Agung Sepruloh
 * Class    : IF-11
 * Informatics Engineering
 * ==========================
 * Created on  29 Apr 2021
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}