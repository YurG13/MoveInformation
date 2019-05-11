package com.aca.imdb.move.moveGenere;

public class Horror extends Move{
    public Horror(String title, String description, String premierDate) {
        super(title, description, premierDate);
    }

    @Override
    public String toString() {
        return "Genre : Horror " + super.toString();
    }
}
