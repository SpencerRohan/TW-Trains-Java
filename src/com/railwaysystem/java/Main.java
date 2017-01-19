package com.railwaysystem.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by N/A on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("START");
        String sourceFile = "assets/txt/sample-graph.txt";
        String targetFile = "assets/txt/graph.txt";
        String graphString;

        if (args.length == 1){
            graphString = args[0];
        } else {
            try {
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile);
            }
        }




        // Generate graph - with optional args if no string - check if graph.txt exists
        // run railways system with returned graph data
        System.out.println("Done");
    }
}
