package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class NetflixService {
    private static ArrayList<User> usersList = new ArrayList<User>();
    private static ArrayList<TVShow> tvShowsList = new ArrayList<TVShow>();
    private static ArrayList<Movie> moviesList = new ArrayList<Movie>();
    static Scanner input = new Scanner(System.in);
    public NetflixService (ArrayList<User> usersList,ArrayList<TVShow> tvShowsList , ArrayList<Movie> moviesList) {
        this.usersList = usersList;
        this.tvShowsList = tvShowsList;
        this.moviesList = moviesList;
    }
    //******************************* Getters & Setters *************************************//
    public ArrayList<User> getUsersList() {
        return usersList;
    }
    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }
    public ArrayList<TVShow> getTvShowsList() {
        return tvShowsList;
    }
    public void setTvShowsList(ArrayList<TVShow> tvShowsList) {
        this.tvShowsList = tvShowsList;
    }
    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }
    public void setMoviesList(ArrayList<Movie> moviesList) {
        this.moviesList = moviesList;
    }
    //******************************************************************************//

    public static void addTVShow(TVShow tvShow){
        tvShowsList.add(tvShow);
    }
    public static void addMovie(Movie movie){
        moviesList.add(movie);
    }

    public static void addUser(User user){
        usersList.add(user);
    }//Me



    private static boolean usernameUniqueness(String username) {
        boolean result = true;
     for(int i=0 ; i<usersList.size() ; i++){
         if(usersList.get(i).getUsername().equals(username)){
                 result = false;
                 break;
         }
     }
     return result;
    }
    private static boolean passwordUniqueness(String password) {
        boolean result = true;
        for(int i=0 ; i<usersList.size() ; i++){
                if(usersList.get(i).getPassword().equals(password)){
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static void createAccount(String username, String password) {

        if (usernameUniqueness(username) == true) {
            if (passwordUniqueness(password) == true) {
                User newuser = new User(username, password, null, null);
                usersList.add(newuser);
            } else {System.out.println("Your password is taken!\nTry something else");}
        } else {System.out.println("Your username is taken!\nTry something else");
            if (passwordUniqueness(password) == false) {
                System.out.println("Your password is taken!\nTry something else");} }
    }

    public static User login(String username, String password) {
        int i =0;
        while(i<usersList.size()){
            if(usersList.get(i).getUsername().equals(username)){
                if(usersList.get(i).getPassword().equals(password)){
                    return usersList.get(i);
                }
            }
            i++;
        }
        return null;
    }

    public void logout() {
        // Implement logout logic here
    }
    public static String toString(TVShow show){
        return "\nTitle :" +show.getTitle() +"\nGenre :" + show.getGenre()
                +"\nRelease year :" +show.getReleaseYear() +"\nDuration :" + show.getDuration()
                +"\nRating :" +show.getRating()
                +"\nCast :" +show.getCast();

    }
    //**************************** Search Methods *******************************//
    public static TVShow searchByTitle(String title) {
        int i = 0;
        while (i < tvShowsList.size()) {
            if(tvShowsList.get(i).getTitle().equals(title)){
                System.out.println(toString(tvShowsList.get(i)));
            }
            i++;
        }
        return null;
    }
    public static TVShow searchByGenre(String genre) {
        for (int k = 0; k < tvShowsList.size(); k++) {
            if (tvShowsList.get(k).getGenre().equals(genre)) {
                System.out.println(toString(tvShowsList.get(k)));
            }
        }
        return null;
    }

    public static TVShow searchByReleaseYear(int year) {
        int i =0;
        while(i<tvShowsList.size()){
            if(tvShowsList.get(i).getReleaseYear()==year){
                System.out.println(toString(tvShowsList.get(i)));
                return tvShowsList.get(i);
            }
            i++;
        }
        return null;
    }

    //***************************************************************************//


}

