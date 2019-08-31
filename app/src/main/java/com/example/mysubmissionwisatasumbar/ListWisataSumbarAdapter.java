package com.example.mysubmissionwisatasumbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataSumbarAdapter extends RecyclerView.Adapter<ListWisataSumbarAdapter.ListViewHolder> {
    private ArrayList<WisataSumbar> listwisatasumbar;
    public ListWisataSumbarAdapter(ArrayList<WisataSumbar> list) {
        this.listwisatasumbar = list;
    }
    @NonNull
    @Override
    public ListWisataSumbarAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wisatasumbar, viewGroup, false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ListWisataSumbarAdapter.ListViewHolder holder, int position) {
        WisataSumbar wisataSumbar = listwisatasumbar.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisataSumbar.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(wisataSumbar.getName());
        holder.tvLocation.setText(wisataSumbar.getLocation());

    }

    @Override
    public int getItemCount() {
        return listwisatasumbar.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvLocation;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo_item);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvLocation = itemView.findViewById(R.id.tv_item_location);
        }
    }
}

