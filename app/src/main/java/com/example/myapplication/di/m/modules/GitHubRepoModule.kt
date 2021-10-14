package com.example.myapplication.di.m.modules

import com.example.myapplication.repository.GitHubRepoRepository
import com.example.myapplication.repository.GitHubRepoRepositoryImpl
import com.example.myapplication.usecase.GitHubRepoUseCase
import com.example.myapplication.usecase.GitHubRepoUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class GitHubRepoModule {

    @Binds
    abstract fun gitHubRepoUseCase(useCase: GitHubRepoUseCaseImpl): GitHubRepoUseCase

    @Binds
    abstract fun GitHubRepoRepository(repository: GitHubRepoRepositoryImpl): GitHubRepoRepository

}