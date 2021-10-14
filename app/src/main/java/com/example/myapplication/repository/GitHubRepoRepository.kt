package com.example.myapplication.repository

import com.example.myapplication.api.GithubApi
import com.example.myapplication.model.Item
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