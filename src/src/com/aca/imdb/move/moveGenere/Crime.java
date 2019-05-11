package com.aca.imdb.move.moveGenere;

public class Crime extends Move {
    public Crime(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Crime " + super.toString();
    }
}
