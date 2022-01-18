package com.example.android.newsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ViewHolder> {

    private ArrayList<Articles> articlesArrayList;
    private Context context;

    public NewsRVAdapter(ArrayList<Articles> articlesArrayList, Context context) {
        this.articlesArrayList = articlesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_rv_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsRVAdapter.ViewHolder holder, int position) {
         Articles articles = articlesArrayList.get(position);
         holder.title.setText(articles.getTitle());
         holder.subtitle.setText(articles.getDescription());
        Picasso.get().load(articles.getUrlToImage()).into(holder.img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,NewsDetailActivity.class);
                intent.putExtra("title",articles.getTitle());
                intent.putExtra("desc",articles.getDescription());
                intent.putExtra("content",articles.getContent());
                intent.putExtra("urlToImage",articles.getUrlToImage());
                intent.putExtra("url",articles.getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title,subtitle;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.idTVNewsHeading);
            subtitle = (TextView)itemView.findViewById(R.id.idTVSubtitle);
            img = (ImageView)itemView.findViewById(R.id.idIVNews);
        }
    }
}
