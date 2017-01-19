package com.railwaysystem.java;

/**
 * Created by N/A on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("START");
        RailwayGraph graph = (args.length == 1) ?
                new RailwayGraph(args) : new RailwayGraph();


        // Create a new graph controller
        // Generate graph - with optional args if no string - check if graph.txt exists
        // run railways system with returned graph data
        System.out.println("Done");
    }
}
