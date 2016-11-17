package com.example.sandraleticia.chig;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by LIZ SUAREZ on 27/10/2016.
 */
public interface UserService {
    @GET("/users/{login}")
    public void obtenerUsuario(@Path("login") String login, Callback<User> user);
    @GET("/user/{login}/repos")
    void obtenerRespotoriod(@Path("login") String login, Callback<List<Repository>> callback);


   // @GET("/users/leodufer")
    //public void obtenerUsuarioEstatico(String login);

}
