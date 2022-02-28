package com.leo.soccerteamsapp.model;

public class SoccerTeam {

    private int emblem;
    private String teamName;
    private String cityState;

    public SoccerTeam() {

    }

    public SoccerTeam(int emblem, String teamName, String cityState) {
        this.emblem = emblem;
        this.teamName = teamName;
        this.cityState = cityState;
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


