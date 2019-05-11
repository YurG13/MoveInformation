package com.aca.imdb.move.moveGenere;

public class Fantasy extends Move{
    public Fantasy(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Fantasy " + super.toString();
    }
}
