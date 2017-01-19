package com.railwaysystem.java.model;

import com.railwaysystem.java.model.GraphValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by N/A on 1/19/17.
 */
public class TransitGenerator {
    private Boolean graphGenerated = false;
    private String graphString;
    private GraphValidator gvalidator = new GraphValidator();
    private Railway railway;

    public Boolean setDataString(String graph){
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

    private void setGraphGenerated(Boolean bool){
        this.graphGenerated = bool;
    }

    public Boolean graphIsGenerated(){
        return this.graphGenerated;
    }

    public String getGraphString(){
        if (graphIsGenerated()){
            return graphString;
        } else {
            return null;
        }
    }

    public void run() {
        buildRailway(gvalidator.getEdgeList());
    }

    private void buildRailway(List<String> edgeList){
        for (String edge : edgeList) {
            String from = edge.substring(0, 1);
            String to = edge.substring(1, 2);
            String distance = edge.replaceAll("[^0-9]+", "");
        }
    }

    public Railway getRailway() {
        return this.railway;
    }
}
