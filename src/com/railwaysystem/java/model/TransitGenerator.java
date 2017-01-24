package com.railwaysystem.java.model;

import com.railwaysystem.java.model.GraphValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TransitGenerator {
    private Boolean graphGenerated = false;
    private String graphString;
    private GraphValidator gvalidator = new GraphValidator();
    private Railway railway;

    public Boolean setDataString(String graph) {
        this.graphString = graph;
        setGraphGenerated(gvalidator.checkValidation(this.graphString));
        return graphIsGenerated();
    }


    public Boolean setDataFile(String filename) throws IOException {
        FileReader fReader = new FileReader(filename);
        BufferedReader bReader = new BufferedReader(fReader);
        this.graphString = bReader.readLine();
        setGraphGenerated(gvalidator.checkValidation(this.graphString));
        return graphIsGenerated();
    }

    private void setGraphGenerated(Boolean isGenerated) {
        this.graphGenerated = isGenerated;
    }

    public Boolean graphIsGenerated() {
        return this.graphGenerated;
    }

    public String getGraphString() {
        if (graphIsGenerated()) {
            return graphString;
        } else {
            return null;
        }
    }

    public void run() {
        buildRailway(gvalidator.getEdgeList());
    }

    private Railway buildRailway(List<String> edgeList) {
        this.railway = new Railway();
        for (String edge : edgeList) {
            String from = edge.substring(0, 1);
            String to = edge.substring(1, 2);
            String distance = edge.replaceAll("[^0-9]+", "");
            railway.createRailwayStop(new String[]{from, to});
            railway.createRailwayLine(from, to, Integer.parseInt(distance));
        }

        return this.railway;
    }

    public Railway getRailway() {
        return this.railway;
    }
}
