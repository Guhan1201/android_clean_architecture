package com.example.androidCleanArchitecture.repository

import com.example.androidCleanArchitecture.api.GithubApi
import com.example.androidCleanArchitecture.model.Item
import javax.inject.Inject

interface GitHubRepoRepository {
    suspend fun getRepoList(): List<Item>
}

class GitHubRepoRepositoryImpl @Inject constructor(val githubApi: GithubApi) :
    GitHubRepoRepository {
    override suspend fun getRepoList(): List<Item> {
        return githubApi.getUsersList(1, 20).items
    }

}