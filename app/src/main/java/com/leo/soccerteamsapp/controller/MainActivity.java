package com.leo.soccerteamsapp.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.leo.soccerteamsapp.R;
import com.leo.soccerteamsapp.RecyclerItemClickListener;
import com.leo.soccerteamsapp.adapter.SoccerTeamsAdapter;
import com.leo.soccerteamsapp.model.SoccerTeam;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView soccerTeamsRecyclerView;
    private List<SoccerTeam> soccerTeams = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soccerTeamsRecyclerView = findViewById(R.id.teams_recycler_view);

        this.createSoccerTeam();
        SoccerTeamsAdapter soccerTeamsAdapter = new SoccerTeamsAdapter(soccerTeams);

//        SoccerTeamsAdapter soccerTeamsAdapter = new SoccerTeamsAdapter();
//
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        soccerTeamsRecyclerView.setLayoutManager(layoutManager);

        soccerTeamsRecyclerView.setHasFixedSize(true);

        //Add lines between items
        soccerTeamsRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        //Connects Adapter to Recycler
        soccerTeamsRecyclerView.setAdapter(soccerTeamsAdapter);

        //Click event
        soccerTeamsRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        soccerTeamsRecyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                SoccerTeam soccerTeam = soccerTeams.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "selecionado " + soccerTeam.getTeamName(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Clique longo",
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );

    }

    public void createSoccerTeam(){
        SoccerTeam soccerTeam = new SoccerTeam(R.drawable.coxa,"Coritiba Foot Ball Club", "Curitiba/PR");
        soccerTeams.add(soccerTeam);
        soccerTeam = new SoccerTeam(R.drawable.flamengo,"Clube de Regatas Flamengo", "Rio de Janeiro/RJ");
        soccerTeams.add(soccerTeam);
        soccerTeam = new SoccerTeam(R.drawable.corinthians,"Sport Club Corinthians Paulista", "São Paulo/SP");
        soccerTeams.add(soccerTeam);
        soccerTeam = new SoccerTeam(R.drawable.athletico,"Clube Athletico Paranaense", "Curitiba/PR");
        soccerTeams.add(soccerTeam);
    }
}