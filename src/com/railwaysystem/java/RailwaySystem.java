package com.railwaysystem.java;

import apple.laf.JRSUIConstants;
import com.railwaysystem.java.model.Railway;
import com.railwaysystem.java.model.TransitGenerator;

import java.io.IOException;

/**
 * Created by N/A on 1/18/17.
 */
public class RailwaySystem {

    public static void main(String[] args) throws IOException {
        String defaultFile = "assets/txt/sample-graph.txt";
        TransitGenerator generator = new TransitGenerator();
        String graphString;
        Boolean graphIsGenerated;

        if (args.length == 1) {
            graphString = args[0];
            graphIsGenerated = generator.setDataString(graphString);
        } else {
            graphIsGenerated = generator.setDataFile(defaultFile);
        }

        if (graphIsGenerated){
//            generator.run();
//            Railway railway = generator.getRailway();
//            RailwayDisplay rDisplay = new RailwayDisplay(railway);
//            rDisplay.run();
            System.out.println(generator.getGraphString());
        } else {
            System.out.println("There seems to be an issue with the graph data, please check documentation.");
        }


        // Generate graph - with optional args if no string - check if graph.txt exists
        // run railways system with returned graph data

    }
}
