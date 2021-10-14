package com.example.myapplication.usecase

import com.example.myapplication.model.Item
import com.example.myapplication.repository.GitHubRepoRepository
import javax.inject.Inject

interface GitHubRepoUseCase {
    suspend fun getRepoList() : List<Item>
}

class GitHubRepoUseCaseImpl @Inject constructor(val repository: GitHubRepoRepository) : GitHubRepoUseCase {
    override suspend fun getRepoList(): List<Item> {
       return repository.getRepoList()
    }

}