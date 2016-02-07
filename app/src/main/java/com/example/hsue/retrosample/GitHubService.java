package com.example.hsue.retrosample;

/**
 * Created by sue on 2016-02-07.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);
}
