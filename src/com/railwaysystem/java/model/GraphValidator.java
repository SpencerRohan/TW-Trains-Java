package com.railwaysystem.java.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by N/A on 1/19/17.
 */
public class GraphValidator {
    private List<String> edgeList;
    private String graphString;

    public boolean checkValidation(String data){
        data = data.replaceAll("Graph:", ""); //Removes word Graph:
        data = data.replaceAll("\\s+",""); //Removes White Spaces
        this.graphString = data;
        this.edgeList = createEdgeList(this.graphString);
        return checkEachEdge(this.edgeList);
    }

    public List<String> getEdgeList(){
        return this.edgeList;
    }

    private Boolean checkEachEdge(List<String> edgeList){
        Boolean listValidated = true;
        for (String edge : edgeList) {
            if (!edge.matches("^[A-Za-z]{2}[\\d+]+$")){
                listValidated = false;
                break;
            }
        }

        return listValidated;
    }

    private List<String> createEdgeList(String data){
        String[] edges = data.split(",");
        return new ArrayList<String>(Arrays.asList(edges));
    }
}
