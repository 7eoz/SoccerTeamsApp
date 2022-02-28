package com.leo.soccerteamsapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.leo.soccerteamsapp.R;
import com.leo.soccerteamsapp.model.SoccerTeam;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        if (intent != null){
            SoccerTeam soccerTeam = (SoccerTeam) intent.getSerializableExtra("soccerTeam");

            ImageView emblem = findViewById(R.id.team_emblem_details);
            TextView teamName = findViewById(R.id.team_name_details);
            TextView cityState = findViewById(R.id.city_state_details);
            TextView achievements = findViewById(R.id.team_achievements);

            emblem.setImageResource(soccerTeam.getEmblem());
            teamName.setText(soccerTeam.getTeamName());
            cityState.setText(soccerTeam.getCityState());
            if (soccerTeam.getId() == 1){
                achievements.setText(
                        "•\tCampeão Paranaense: 1916\n" +
                        "•\tCampeão Paranaense: 1927\n" +
                        "•\tCampeão Paranaense: 1931\n" +
                        "•\tCampeão Paranaense: 1933\n"
                );
            }else if(soccerTeam.getId() == 2){
                achievements.setText(
                        "•\tMundial interclubes - 1981\n" +
                        "•\tTaça Libertadores da América - 1981 e 2019\n" +
                        "•\tCopa Mercosul - 1999\n" +
                        "•\tCopa Ouro Sul-americana - 1996 (invicto)\n" +
                        "•\tRecopa Sul-Americana - 2020"
                );
            }else if(soccerTeam.getId() == 3){
                achievements.setText(
                        "•\tMundial de Clubes: 2000\n" +
                        "•\tCopa Libertadores da América: 2012\n" +
                        "•\tMundial de Clubes: 2012\n" +
                        "•\tRecopa Sul-Americana: 2013"
                );
            }else if(soccerTeam.getId() == 4){
                achievements.setText(
                        "•\tCopa Sulamericana: 2018 e 2021\n" +
                        "•\tCopa Suruga Bank: 2019\n" +
                        "•\tCampeonato Brasileiro: 2001\n" +
                        "•\tCopa do Brasil: 2019"
                );
            }
        }

    }
}