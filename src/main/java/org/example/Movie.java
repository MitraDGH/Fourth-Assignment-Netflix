package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    private int length;
    public Movie(String title, String genre, int releaseYear,int length , double rating, ArrayList<String> cast)
    {
        super(title, genre, releaseYear, rating, cast);
        this.length = length ;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


