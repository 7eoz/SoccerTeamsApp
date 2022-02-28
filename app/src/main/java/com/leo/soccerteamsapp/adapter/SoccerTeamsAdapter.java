package com.leo.soccerteamsapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leo.soccerteamsapp.R;
import com.leo.soccerteamsapp.model.SoccerTeam;

import java.util.List;

public class SoccerTeamsAdapter extends RecyclerView.Adapter<SoccerTeamsAdapter.MyViewHolder> {

    private List<SoccerTeam> soccerTeams;

    public SoccerTeamsAdapter(List<SoccerTeam> list) {this.soccerTeams = list;}

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView teamName, cityState;
        ImageView teamEmblem;

        public MyViewHolder(View view) {
            super(view);
            teamName = view.findViewById(R.id.team_name);
            cityState = view.findViewById(R.id.city_state);
            teamEmblem = view.findViewById(R.id.team_emblem);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.soccer_teams_list_adapter, parent, false);

        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SoccerTeam soccerTeam = soccerTeams.get(position);
        holder.teamName.setText(soccerTeam.getTeamName());
        holder.cityState.setText(soccerTeam.getCityState());
        holder.teamEmblem.setImageResource(soccerTeam.getEmblem());
    }


    @Override
    public int getItemCount() {
        return soccerTeams.size();
    }
}
