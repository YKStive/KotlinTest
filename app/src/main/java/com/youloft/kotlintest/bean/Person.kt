package com.youloft.kotlintest.bean

import com.youloft.kotlintest.MainActivity

/**
 * @author you
 * @create 2019-12-10
 * @desc
 */
open class Person {

    var age: Int? = null

    constructor(age: Int) {
        this.age = age
    }

    var name: String? = null
        get() {
            return field + "cc"
        }
        set(value) {
            field = value + "---"
        }

    fun eat() {

    }


}