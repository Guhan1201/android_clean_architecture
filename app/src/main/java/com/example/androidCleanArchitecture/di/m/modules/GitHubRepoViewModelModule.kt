package com.example.androidCleanArchitecture.di.m.modules

import com.example.androidCleanArchitecture.usecase.GitHubRepoUseCase
import com.example.androidCleanArchitecture.viewmodel.GitHubRepoViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class GitHubRepoViewModelModule {

    @Provides
    fun provideFeedViewModelFactory(gitHubRepoUseCase: GitHubRepoUseCase): GitHubRepoViewModelFactory {
        return GitHubRepoViewModelFactory(gitHubRepoUseCase)
    }

}