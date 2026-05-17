package com.playlistrec.model;

public class Artist {
    private String name;
    private String genre;
    private int popularity;

    public Artist (String name, String genre, int popularity) {
        this.name = name;
        this.genre = genre;
        this.popularity = popularity;
    }

    public String getName(){
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public int getPopularity(){
        return popularity;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
