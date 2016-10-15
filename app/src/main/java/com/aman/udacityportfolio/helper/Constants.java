package com.aman.udacityportfolio.helper;

/**
 * Created by Aman Kapoor on 12-10-2016.
 */

public final class Constants {

    private static final String MOVIE_API_KEY = "ENTER_YOUR_APIKEY_HERE";
    private static final String MOVIE_BASE_URL = "https://api.themoviedb.org/3/";
    private static final String MOVIE_BASE_IMAGE_URL = "http://image.tmdb.org/t/p/";
    private static final String MOVIE_BL_POPULAR_COMPLETE = "com.aman.udacityportfolio.popular.complete";
    private static final String MOVIE_BL_POPULAR_ERROR = "com.aman.udacityportfolio.popular.error";
    private static final String MOVIE_BL_TOP_COMPLETE = "com.aman.udacityportfolio.top.complete";
    private static final String MOVIE_BL_TOP_ERROR = "com.aman.udacityportfolio.top.error";

    public static String getMovieApiKey() {
        return MOVIE_API_KEY;
    }

    public static String getMovieBaseUrl() {
        return MOVIE_BASE_URL;
    }

    public static String getMovieBaseImageUrl(boolean thumb) {
        return thumb ? MOVIE_BASE_IMAGE_URL + "w185" : MOVIE_BASE_IMAGE_URL + "w500";
    }

    public static String getMovieBlPopularComplete() {
        return MOVIE_BL_POPULAR_COMPLETE;
    }

    public static String getMovieBlPopularError() {
        return MOVIE_BL_POPULAR_ERROR;
    }

    public static String getMovieBlTopComplete() {
        return MOVIE_BL_TOP_COMPLETE;
    }

    public static String getMovieBlTopError() {
        return MOVIE_BL_TOP_ERROR;
    }
}
