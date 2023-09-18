package com.example.copytext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
   RecyclerView secondRecycler;
   ArrayList<SecondActivityItem> secondActivityItems = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent=getIntent();
        String name= intent.getStringExtra("name");
        secondRecycler = findViewById(R.id.secondRecycler);

        if (name.equals("Loves SMS")){
            secondActivityItems.add(new SecondActivityItem("dahfb ausd aeiur akiu  adf",R.drawable.copy_icon,R.drawable.share_icon));
            secondActivityItems.add(new SecondActivityItem("dahfb ausd aeiur akiu  adf",R.drawable.copy_icon,R.drawable.share_icon));
            secondActivityItems.add(new SecondActivityItem("dahfb ausd aeiur akiu  adf",R.drawable.copy_icon,R.drawable.share_icon));
            secondActivityItems.add(new SecondActivityItem("dahfb ausd aeiur akiu  adf",R.drawable.copy_icon,R.drawable.share_icon));
            secondActivityItems.add(new SecondActivityItem("dahfb ausd aeiur akiu  adf",R.drawable.copy_icon,R.drawable.share_icon));
            secondActivityItems.add(new SecondActivityItem("dahfb ausd aeiur akiu  adf",R.drawable.copy_icon,R.drawable.share_icon));
            secondRecycler.setLayoutManager(new LinearLayoutManager(this));

            SecondActivityAdapter adapter = new SecondActivityAdapter(secondActivityItems,this);
            secondRecycler.setAdapter(adapter);

        }else if (name.equals("Sade SMS")){

        }
    }
}