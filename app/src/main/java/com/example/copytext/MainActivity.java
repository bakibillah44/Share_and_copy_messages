package com.example.copytext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<MainActivityItem> activityItems = new ArrayList<>();

        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Loves SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));
        activityItems.add(new MainActivityItem(R.drawable.ic_launcher_background, "Sade SMS"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainActivityAdapter adapter = new MainActivityAdapter(this,activityItems);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


       /* StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        MainActivityAdapter adapter = new MainActivityAdapter(this,activityItems);
        recyclerView.setAdapter(adapter);*/





















       /* txtSms = findViewById(R.id.txtSms);
        imgCopy = findViewById(R.id.imgCopy);
        imgShare = findViewById(R.id.imgShare);

        imgCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", txtSms.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

        imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Intent.ACTION_SEND);
               intent.putExtra(Intent.EXTRA_TEXT,txtSms.getText().toString());
               intent.setType("text/plain");
               intent = Intent.createChooser(intent,"share vai");
               startActivity(intent);
            }
        });*/
    }
}