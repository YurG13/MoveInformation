package com.aca.imdb.move.moveGenere;

public class Adventure extends Move{
    public Adventure(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Adventure " + super.toString();
    }
}
