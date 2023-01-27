package com.example.playground.personal;

import com.example.playground.personal.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.viewUser.run();
    }
}
