package com.aca.imdb.move.moveGenere;

public class Mystery extends Move {
    public Mystery(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Mystery " + super.toString();
    }
}
