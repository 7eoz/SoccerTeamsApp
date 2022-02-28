package com.leo.soccerteamsapp.model;

import java.io.Serializable;

public class SoccerTeam implements Serializable {

    private int id;
    private int emblem;
    private String teamName;
    private String cityState;

    public SoccerTeam() {

    }

    public SoccerTeam(int id, int emblem, String teamName, String cityState) {
        this.id = id;
        this.emblem = emblem;
        this.teamName = teamName;
        this.cityState = cityState;
    }

    public int getId() {
        return id;
    }

    public int getEmblem() {
        return emblem;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCityState() {
        return cityState;
    }

    public void setEmblem(int emblem) {
        this.emblem = emblem;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }
}


