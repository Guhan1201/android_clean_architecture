package com.example.myapplication.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R
import com.example.myapplication.di.m.component.DaggerAppComponent
import com.example.myapplication.viewmodel.GitHubRepoViewModel
import com.example.myapplication.viewmodel.GitHubRepoViewModelFactory
import javax.inject.Inject

class GitHubRepoListActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: GitHubRepoViewModelFactory

    lateinit var viewModel: GitHubRepoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerAppComponent.builder().build().inject(this)
        viewModel =
            ViewModelProviders.of(this, viewModelFactory).get(GitHubRepoViewModel::class.java)
        viewModel.githubList.observe(this) {
            Log.e("guhan", it.toString())
        }
    }
}