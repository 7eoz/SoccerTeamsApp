package com.leo.soccerteamsapp.model;

public class soccerTeam {

    private int image;
    private String teamName;
    private String cityState;

    public soccerTeam() {

    }

    public soccerTeam(int image, String teamName, String cityState) {
        this.image = image;
        this.teamName = teamName;
        this.cityState = cityState;
    }

    public int getImage() {
        return image;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCityState() {
        return cityState;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }
}


