package com.example.androidCleanArchitecture.api

import com.example.androidCleanArchitecture.model.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApi {

    @GET("search/users?q=repos:>1")
    suspend fun getUsersList(
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int
    ): Response

//    @GET("users/{username}")
//    suspend fun getUserInfo(
//        @Path("username") username: String
//    ): Response<GithubUserModel>
}