package com.cruz.laboratorio_08.ui.movie.billboard.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cruz.laboratorio_08.data.MovieModel
import com.cruz.laboratorio_08.databinding.MovieItemBinding

class MovieRecyclerViewAdapter(private val clickListener: (MovieModel) -> Unit) :
    RecyclerView.Adapter<MovieRecyclerViewHolder>() {
    private val movies = ArrayList<MovieModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieRecyclerViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieRecyclerViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie, clickListener)
    }

    fun setData(movies: List<MovieModel>) {
        this.movies.clear()
        this.movies.addAll(movies)
    }
}