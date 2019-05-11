package com.aca.imdb.move.moveGenere;


public class Romance extends Move{
    public Romance(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Romance " + super.toString();
    }

}
