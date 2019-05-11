package com.aca.imdb.move.moveGenere;

public class Comedy extends Move {
    public Comedy(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Comedy " + super.toString();
    }
}
