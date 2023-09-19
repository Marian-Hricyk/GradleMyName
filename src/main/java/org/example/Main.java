package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson= new Gson();
        String name= gson.toJson(new Name("Gritsyuk","Mrian"));
        System.out.println(name);
    }
}