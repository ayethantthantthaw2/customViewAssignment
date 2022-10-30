package com.attt.customviewsassignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.attt.customviewsassignment.R
import com.attt.customviewsassignment.adapters.ProfileAdapter
import com.attt.customviewsassignment.adapters.TaskAdapter
import kotlinx.android.synthetic.main.activity_main.*
import mvp.presenters.MainPresenter
import mvp.presenters.MainPresenterImpl
import mvp.views.MainView

class MainActivity : AppCompatActivity(),MainView {

    private lateinit var mPresenter: MainPresenter
    private lateinit var mProfileAdapter:ProfileAdapter
    private lateinit var mTaskAdapter:TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupPresenter()
        setupRecyclerView()
    }

    private fun setupPresenter() {
        mPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mPresenter.initView(this)
    }

    private fun setupRecyclerView() {
        mProfileAdapter= ProfileAdapter(mPresenter)
        rvProfiles.adapter=mProfileAdapter
        rvProfiles.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        mTaskAdapter= TaskAdapter(mPresenter)
        rvTasks.adapter=mTaskAdapter
        rvTasks.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)






    }

    override fun navigateToCreateNewTask() {

    }

    override fun navigateToProfile() {

    }
}