package com.railwaysystem.java.model;

/**
 * Created by N/A on 1/19/17.
 */
public class GraphValidator {
    public boolean checkValidation(String data){
        data = data.replaceAll("Graph:", ""); //Removes Graph:
        data = data.replaceAll("\\s+",""); //Removes White Spaces
        System.out.println(data);
        return true;

    }
}
