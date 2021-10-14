package com.example.androidCleanArchitecture.usecase

import com.example.androidCleanArchitecture.model.Item
import com.example.androidCleanArchitecture.repository.GitHubRepoRepository
import javax.inject.Inject

interface GitHubRepoUseCase {
    suspend fun getRepoList() : List<Item>
}

class GitHubRepoUseCaseImpl @Inject constructor(val repository: GitHubRepoRepository) : GitHubRepoUseCase {
    override suspend fun getRepoList(): List<Item> {
       return repository.getRepoList()
    }

}