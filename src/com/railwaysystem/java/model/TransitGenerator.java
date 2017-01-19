package com.railwaysystem.java.model;

import com.railwaysystem.java.model.GraphValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by N/A on 1/19/17.
 */
public class TransitGenerator {
    private Boolean graphGenerated = false;
    private String graphString;
    private GraphValidator gvalidator = new GraphValidator();

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
}
