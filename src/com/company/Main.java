package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> movies = new ArrayList<String>();
	Boolean start = true;
	Scanner scan = new Scanner(System.in);

        System.out.println("Enter a movie to the list: ");
        String addMovie = scan.nextLine();
        movies.add(addMovie);
        while(start){
            if(!addMovie.equalsIgnoreCase("q")) {
                System.out.println("Add another movie: // Enter q to stop");
                addMovie = scan.nextLine();
                movies.add(addMovie);
            }
                if(addMovie.equalsIgnoreCase("q")){
                    System.out.println("Thank you for using");
                    start = false;
                }
        }
        Collections.sort(movies);
        movies.remove("q");
        System.out.println("Movie List: ");
        for(String x : movies){
            System.out.println(x);
        }
    }
}
