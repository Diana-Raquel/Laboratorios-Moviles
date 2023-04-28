package com.cruz.laboratorio_06.repositories

import com.cruz.laboratorio_06.data.Movie

class MoviesRepository(private val movies: MutableList<Movie>) {
    fun getMovies() = movies

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }
}