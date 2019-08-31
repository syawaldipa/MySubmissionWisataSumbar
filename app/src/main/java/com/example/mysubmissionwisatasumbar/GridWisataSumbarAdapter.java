package com.example.mysubmissionwisatasumbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridWisataSumbarAdapter  extends RecyclerView.Adapter<GridWisataSumbarAdapter.GridViewHolder> {
    private ArrayList<WisataSumbar> listwisatasumbar;

    public GridWisataSumbarAdapter(ArrayList<WisataSumbar> list) {
        this.listwisatasumbar = list;
    }

    @NonNull
    @Override
    public GridWisataSumbarAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_wisata_sumbar, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridWisataSumbarAdapter.GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listwisatasumbar.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return listwisatasumbar.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo_item);
        }
    }
}
