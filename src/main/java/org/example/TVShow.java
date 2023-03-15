package org.example;

import java.util.ArrayList;

class TVShow {

    private static String title;
    private static String genre;
    private static int releaseYear;
    private static int duration;
    private static double rating;
    private static ArrayList<String> cast = new ArrayList<String>();

    public TVShow(String title, String genre, int releaseYear, double rating, ArrayList<String> cast) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = 0;
        this.rating = rating;
        this.cast = cast;
    }

    //******************************* Getters & Setters *************************************//
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public ArrayList<String> getCast() {
        return cast;
    }
    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    //***************************************************************************//
}
