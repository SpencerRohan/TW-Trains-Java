package com.railwaysystem.java.model;

/**
 * Created by N/A on 1/19/17.
 */
public class Railway {


    public void createRailwayLine(String from, String to, int distance) {
        createRailwayStop(new String[]{from});
        createRailwayStop(new String[]{to});

    }

    public void createRailwayStop(String[] towns) {
//        System.out.println(towns[0]);

    }
}
