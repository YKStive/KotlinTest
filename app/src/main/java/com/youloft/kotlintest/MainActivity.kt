package com.youloft.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.youloft.kotlintest.bean.Person
import com.youloft.kotlintest.utils.dp2px
import kotlinx.android.synthetic.main.activity_main.*

open  class MainActivity : AppCompatActivity() {

    lateinit  var view:View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}
