package com.rct.machinetestapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rct.machinetestapp.R;
import com.rct.machinetestapp.models.FeaturedDataClass;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ViewHolder>{
    private List<FeaturedDataClass> listdata = new ArrayList<>();

    public FeaturedAdapter(List<FeaturedDataClass> allprofilesDataClasses) {
        this.listdata = allprofilesDataClasses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_recycler, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.productName.setText(listdata.get(position).getName());
        holder.productPrice.setText(listdata.get(position).getPrice());
        holder.productSize.setText(listdata.get(position).getProductFilters().get(1).getName()+
                listdata.get(position).getProductFilters().get(0).getName());
        loadImage(listdata.get(position).getImage(),holder.imageView);
    }
    @Override
    public int getItemCount() {
      return   listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView productName,productSize,productPrice;
        public ImageView imageView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.productName=itemView.findViewById(R.id.textViewName);
            this.imageView = itemView.findViewById(R.id.imageViewProduct);
            this.productPrice = itemView.findViewById(R.id.textViewPrice);
            this.productSize = itemView.findViewById(R.id.textViewSize);
        }
    }

    private void loadImage(String userimage, ImageView imageView) {

        Picasso.get()
                .load(userimage)
                .into(imageView);
    }
}
