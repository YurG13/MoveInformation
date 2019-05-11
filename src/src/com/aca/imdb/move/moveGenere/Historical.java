package com.aca.imdb.move.moveGenere;

public class Historical extends Move{
    public Historical(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Historical " + super.toString();
    }
}
