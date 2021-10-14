package com.example.myapplication.di.m.modules

import com.example.myapplication.usecase.GitHubRepoUseCase
import com.example.myapplication.viewmodel.GitHubRepoViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class GitHubRepoViewModelModule {

    @Provides
    fun provideFeedViewModelFactory(gitHubRepoUseCase: GitHubRepoUseCase): GitHubRepoViewModelFactory {
        return GitHubRepoViewModelFactory(gitHubRepoUseCase)
    }

}