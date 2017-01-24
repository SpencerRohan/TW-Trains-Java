package com.railwaysystem.java.model;

import java.util.ArrayList;

/**
 * Created by N/A on 1/19/17.
 */
public class Town {

    private Boolean visited;
    private ArrayList<Line> lines = new ArrayList<Line>();


    public Boolean isVisted(){
        return this.visited;
    }

    public void setVisted(Boolean visted){
        this.visted = visted;
    }



}
