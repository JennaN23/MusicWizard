package com.hfad.musicwizard;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class Spotify {
    @GET("search.json")
    Call<SpotifyResponse> searchSpotify(
            @Query("q") String keyword,
            @Query("restrict_sr") int restrict);
}
