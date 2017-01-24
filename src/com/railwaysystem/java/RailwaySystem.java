package com.railwaysystem.java;

import com.railwaysystem.java.model.Railway;
import com.railwaysystem.java.model.RailwayDisplay;
import com.railwaysystem.java.model.TransitGenerator;

import java.io.IOException;

public class RailwaySystem {

    public static void main(String[] args) throws IOException {
        String defaultFile = "assets/txt/sample-graph.txt";
        TransitGenerator generator = new TransitGenerator();
        String graphString;
        Boolean graphIsGenerated;
        Railway railway;

        if (args.length == 1) {
            graphString = args[0];
            graphIsGenerated = generator.setDataString(graphString);
        } else {
            graphIsGenerated = generator.setDataFile(defaultFile);
        }

        if (graphIsGenerated){
            generator.run();
            railway = generator.getRailway();
            RailwayDisplay rDisplay = new RailwayDisplay(railway);
            rDisplay.run();
            System.out.println(generator.getGraphString());
        } else {
            System.out.println("There seems to be an issue with the graph data, please check documentation.");
        }

    }
}
