package com.cruz.laboratorio_08.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.cruz.laboratorio_08.data.MovieModel
import com.cruz.laboratorio_08.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardView.setOnClickListener {
            clickListener(movie)
        }
    }
}