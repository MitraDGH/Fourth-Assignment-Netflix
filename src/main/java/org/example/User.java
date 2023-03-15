package org.example;

import java.util.ArrayList;

class User {
    private String username , password ;
    private static ArrayList<TVShow> favoriteShows = new ArrayList<TVShow>();
    private ArrayList<TVShow> watchHistory = new ArrayList<TVShow>();
    public User (String username , String password , ArrayList<TVShow> favoriteShows ,  ArrayList<TVShow> watchHistory){
        this.username = username;
        this.password = password;
        this.favoriteShows = favoriteShows;
        this.watchHistory = watchHistory;
    }
    //***************************** Getters & Setters ************************************//
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<TVShow> getFavoriteShows() {
        return favoriteShows;
    }
    public void setFavoriteShows(ArrayList<TVShow> favoriteShows) {
        this.favoriteShows = favoriteShows;
    }
    public ArrayList<TVShow> getWatchHistory() {
        return watchHistory;
    }
    public void setWatchHistory(ArrayList<TVShow> watchHistory) {
        this.watchHistory = watchHistory;
    }
    //****************************

    //**************************** Search Methods *******************************//
    public static TVShow searchByTitle(String title) {
        int i =0;
        while(i<favoriteShows.size()){
            if(favoriteShows.get(i).getTitle().equals(title)){
                return favoriteShows.get(i);
            }
            i++;
        }
        return null;
    }
    public static TVShow searchByGenre(String genre) {
        int i =0;
        while(i<favoriteShows.size()){
            if(favoriteShows.get(i).getGenre().equals(genre)){
                return favoriteShows.get(i);
            }
            i++;
        }
        return null;
    }
    public static TVShow searchByReleaseYear(int year) {
        int i =0;
        while(i<favoriteShows.size()){
            if(favoriteShows.get(i).getReleaseYear()==year){
                return favoriteShows.get(i);
            }
            i++;
        }        return null;
    }
    //***************************************************************************//

    public static void addToFavorites(TVShow show) {
        favoriteShows.add(show);
    }

    public static void viewFavorites() {
        System.out.println(favoriteShows.toArray().toString());
    }
    public ArrayList<TVShow> getRecommendations() {///?????????
        // Implement get recommendations logic here
        return null;
    }

}
