package com.aca.imdb.move.moveGenere;

public class Drama extends Move {
    public Drama(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Drama " + super.toString();
    }
}
