package com.demoapps.moviefinderapp.web;

import com.demoapps.moviefinderapp.model.MovieListingResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Skip on 27-03-2017.
 */
public interface MovieListingService {

    @GET
    public Call<MovieListingResponse> getMovieListingResponse(@QueryMap(encoded=true) Map<String,String> filters);
}
