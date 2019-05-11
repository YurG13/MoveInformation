package com.aca.imdb;

import com.aca.imdb.move.information.MoveMamory;

public class Main {
    MoveMamory moveMamory = new MoveMamory();

    public void addMove(String genre,String title, String description, String premierDate){
        moveMamory.add(genre,title, description, premierDate);
    }

//    public void apdateMove(String genre) {
//
//    }
    public void searchMove(String title) {

        moveMamory.searchMove(title);

    }
}
