package com.gsc.miyazaki.ui.films;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gsc.miyazaki.R;
import com.gsc.miyazaki.model.Film;
import com.gsc.miyazaki.ui.base.OnBaseItemListener;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class FilmsRecyclerViewAdapter extends RecyclerView.Adapter<FilmsRecyclerViewAdapter.ViewHolder> {

    private OnBaseItemListener listener;
    private List<Film> films;


    public FilmsRecyclerViewAdapter(List<Film> films, OnBaseItemListener listener) {
        this.films = films;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Film film = films.get(position);
        Picasso.with(holder.image.getContext()).load(film.getImage()).into(holder.image);
        holder.title.setText(film.getTitle());

        holder.itemView.setOnClickListener(view -> {
            listener.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    //region ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.film_image)
        ImageView image;
        @BindView(R.id.film_title)
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    //endregion
}
