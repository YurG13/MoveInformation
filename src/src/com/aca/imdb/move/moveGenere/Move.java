package com.aca.imdb.move.moveGenere;

public abstract class Move {
    private String title;
    private String description;
    private String premierDate;
    private int rating = 0;

    public Move(String title, String description, String premierDate) {
        this.title = title;
        this.description = description;
        this.premierDate = premierDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPremierDate() {
        return premierDate;
    }

    @Override
    public String toString() {
        return "\nPremier Date :" +  premierDate + "\nDescription :" + description + "\nRating : "+ rating;
    }


}
