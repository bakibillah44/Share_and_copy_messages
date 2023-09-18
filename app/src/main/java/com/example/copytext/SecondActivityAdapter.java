package com.example.copytext;


import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivityAdapter extends RecyclerView.Adapter<SecondActivityAdapter.ViewHolder> {

    ArrayList<SecondActivityItem> secondActivityItems;
    Context context;

    public SecondActivityAdapter(ArrayList<SecondActivityItem> secondActivityItems, Context context) {
        this.secondActivityItems = secondActivityItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.second_model,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtSms.setText(secondActivityItems.get(position).getTxtSms());
        holder.imgCopy.setImageResource(secondActivityItems.get(position).getImgCopy());
        holder.imgShare.setImageResource(secondActivityItems.get(position).getImgShare());

        holder.imgCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = (ClipData) ClipData.newPlainText("text",secondActivityItems.get(position).getTxtSms());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(context, "Copied", Toast.LENGTH_SHORT).show();


            }
        });

        holder.imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plane");
                intent.putExtra(Intent.EXTRA_INTENT,secondActivityItems.get(position).getTxtSms());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return secondActivityItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtSms;
        ImageView imgCopy,imgShare;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtSms = itemView.findViewById(R.id.txtSms);
            imgCopy = itemView.findViewById(R.id.imgCopy);
            imgShare = itemView.findViewById(R.id.imgShare);
        }
    }
}
