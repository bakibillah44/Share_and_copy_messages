package com.example.copytext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    Context context;
    ArrayList<MainActivityItem> activityItems;

    public MainActivityAdapter(Context context, ArrayList<MainActivityItem> activityItems) {
        this.context = context;
        this.activityItems = activityItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_model,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        final MainActivityItem modelClass = activityItems.get(position);

        holder.imageView.setImageResource(activityItems.get(position).getImg());
        holder.txtTitel.setText(activityItems.get(position).getTitel());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),SecondActivity.class);
                intent.putExtra("name",modelClass.getTitel());
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
                view.getContext().startActivity(intent);



            }
        });

    }

    @Override
    public int getItemCount() {
        return activityItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtTitel;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgView);
            txtTitel = itemView.findViewById(R.id.txtTitel);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
