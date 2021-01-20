package com.aku.git.api

import com.aku.git.data.model.DetailUser
import com.aku.git.data.model.User
import com.aku.git.data.model.UserRespon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/user")
    @Headers ("Autorization: token 5beb64ef5c5c4e4910cc5f9133221ddf6e3ff645")
    fun getSearchUsers(
        @Query("q") query : String
    ):Call<UserRespon>

    @GET("users/username")
    @Headers("Autorization: token 5beb64ef5c5c4e4910cc5f9133221ddf6e3ff645")
    fun getUserDetail(
            @Path("username") username: () -> String?
    ):Call<DetailUser>

    @GET("/users/{username}/followers")
    @Headers("Autorization: token 5beb64ef5c5c4e4910cc5f9133221ddf6e3ff645")
    fun getFollowers(
            @Path("username") username:String
    ):Call<ArrayList<User>>
    @GET("/users/{username}/following")
    @Headers("Autorization: token 5beb64ef5c5c4e4910cc5f9133221ddf6e3ff645")
    fun getFollowing(
            @Path("username") username:String
    ):Call<ArrayList<User>>
}