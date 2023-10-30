package com.example.recyclerview1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview1.Model.listmodel;
import com.example.recyclerview1.R;

import java.util.List;

public class MycustomAdapter extends RecyclerView.Adapter<MycustomAdapter.bikeviewHolder > {
    List<listmodel> listmodelList;

    public MycustomAdapter(List<listmodel> listmodelList) {
        this.listmodelList = listmodelList;
    }

    @NonNull
    @Override
    public MycustomAdapter.bikeviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bikelist,parent,false);
        return new bikeviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MycustomAdapter.bikeviewHolder holder, int position) {
        listmodel listmodel = listmodelList.get(position);
        holder.textview.setText(listmodel.getCompany());
        holder.textview.setText(String.valueOf(listmodel.getCost()));
        holder.imageView.setImageResource(listmodel.getImage());

    }

    @Override
    public int getItemCount() {
        return listmodelList.size();
    }
    public static class bikeviewHolder extends RecyclerView.ViewHolder{

        TextView textview;
        ImageView imageView;

    public bikeviewHolder(@NonNull View itemView) {
        super(itemView);

        textview=itemView.findViewById(R.id.Company);
        textview=itemView.findViewById(R.id.cost);
        imageView=itemView.findViewById(R.id.image);
    }
}
}
