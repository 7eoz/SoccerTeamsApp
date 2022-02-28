package com.leo.soccerteamsapp.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.leo.soccerteamsapp.R;
import com.leo.soccerteamsapp.adapter.SoccerTeamsAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView soccerTeamsRecyclerView = findViewById(R.id.teams_recycler_view);

        SoccerTeamsAdapter soccerTeamsAdapter = new SoccerTeamsAdapter();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        soccerTeamsRecyclerView.setLayoutManager(layoutManager);

        soccerTeamsRecyclerView.setHasFixedSize(true);
        soccerTeamsRecyclerView.setAdapter(soccerTeamsAdapter);

    }
}