package com.aca.imdb.move.information;


import com.aca.imdb.move.moveGenere.*;

import java.util.ArrayList;
import java.util.List;

public class MoveMamory {
    Move move;
    protected List<String> genre = new ArrayList<>();
    protected List<String> title = new ArrayList<>();
    protected List<String> description  = new ArrayList<>();
    protected List<Integer> rating = new ArrayList<>();
    protected List<String>  premierDate = new ArrayList<>();


    public void add(String genre, String title, String premierDate, String description) {
        this.genre.add(genre);
        this.title.add(title);
        this.description.add(description);
        this.premierDate.add(premierDate);
    }

    public Integer searchMove(String title) {
        for (int i = 0; i < this.title.size(); i++) {
            if (title.equals(this.title.get(i))) {
                System.out.println(title);
                read(i);
                return i;
            }
        }
        return null;
    }

    public void read(Integer cont) {

        switch (this.genre.get(cont)) {
            case "Crime":
              move = new Crime(title.get(cont), description.get(cont), premierDate.get(cont));
              System.out.println(move);
              break;
            case "Comedy":
                move = new Comedy(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Drama":
                move = new Drama(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Fantasy":
                move = new Fantasy(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Historical":
                move = new Historical(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Horror":
                move = new Horror(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Mystery":
                move = new Mystery(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Roamnce":
                move = new Romance(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
            case "Adventure":
                move = new Adventure(title.get(cont), description.get(cont), premierDate.get(cont));
                System.out.println(move);
                break;
        }


        }
    }
//    public MoveMamory(){};




//    public void readMove(int cont) {
//        switch (genre.get(cont)) {
//            case Crime:
//              move = new Crime(title.get(cont), description.get(cont), premierDate.get(cont));
//              System.out.println(move);
//              break;
//            case Comedy:
//                move = new Comedy(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Drama:
//                move = new Drama(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Fantasy:
//                move = new Fantasy(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Historical:
//                move = new Historical(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Horror:
//                move = new Horror(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Mystery:
//                move = new Mystery(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Roamnce:
//                move = new Romance(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//            case Adventure:
//                move = new Adventure(title.get(cont), description.get(cont), premierDate.get(cont));
//                System.out.println(move);
//                break;
//        }
//    }
//}
