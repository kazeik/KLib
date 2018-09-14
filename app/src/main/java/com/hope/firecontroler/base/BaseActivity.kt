package com.hope.firecontroler.base

import android.app.Activity
import android.os.Bundle
import com.hope.firecontroler.MainApplication

/**
 * @author kazeik.chen, QQ:77132995, email:kazeik@163.com
 * 2018 09 14 14:13
 * 类说明:
 */
abstract class BaseActivity : Activity() {
    private var myApplicaton: MainApplication? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myApplicaton = application as MainApplication
        myApplicaton?.addActivity(this)

        setContentView(getLayoutView())
        initData()
    }

    abstract fun getLayoutView(): Int

    abstract fun initData()
}