package com.cruz.laboratorio_07

import android.app.Application
import com.cruz.laboratorio_07.data.movies
import com.cruz.laboratorio_07.repositories.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}