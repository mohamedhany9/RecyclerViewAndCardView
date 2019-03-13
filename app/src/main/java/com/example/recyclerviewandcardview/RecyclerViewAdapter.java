package com.example.recyclerviewandcardview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Book> mData;

    public RecyclerViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view =layoutInflater.inflate(R.layout.cardview_item_book , viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,BookActivity.class);

                intent.putExtra("title",mData.get(position).getTitle());
                intent.putExtra("category",mData.get(position).getCategory());
                intent.putExtra("description",mData.get(position).getDescription());
                intent.putExtra("img",mData.get(position).getThumbnail());

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img_book_thumbnail;
        TextView tv_book_title;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_book_thumbnail = itemView.findViewById(R.id.book_img_id);
            tv_book_title = itemView.findViewById(R.id.book_title_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
