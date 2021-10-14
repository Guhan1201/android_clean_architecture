package com.example.androidCleanArchitecture.di.m.modules

import com.example.androidCleanArchitecture.repository.GitHubRepoRepository
import com.example.androidCleanArchitecture.repository.GitHubRepoRepositoryImpl
import com.example.androidCleanArchitecture.usecase.GitHubRepoUseCase
import com.example.androidCleanArchitecture.usecase.GitHubRepoUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class GitHubRepoModule {

    @Binds
    abstract fun gitHubRepoUseCase(useCase: GitHubRepoUseCaseImpl): GitHubRepoUseCase

    @Binds
    abstract fun GitHubRepoRepository(repository: GitHubRepoRepositoryImpl): GitHubRepoRepository

}