package com.gsc.miyazaki.ui.films;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsc.miyazaki.R;
import com.gsc.miyazaki.model.Film;

import java.util.List;
import java.util.zip.Inflater;


public class FilmsRecyclerViewAdapter extends RecyclerView.Adapter<FilmsRecyclerViewAdapter.ViewHolder> {

    private List<Film> films;


    public FilmsRecyclerViewAdapter(List<Film> films) {
        this.films = films;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    //region ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
    //endregion
}
