package logic;

import org.hibernate.mapping.Bag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Entity class for Specialist, mapped by
 * @see hibernateMapping/Specialist.nbm.xml
 * Created by user on 06.03.2015.
 */

public class Specialist {
    private int id;
    private String name;
    private String surName;
    private String fathersName;
    private String position;
    private String rank;
    private List decisions;
    private List actions;



    public Specialist(){};

    //getters
    public String getRank() {
        return rank;
    }

    public String getFathersName() {
        return fathersName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSurName() {
        return surName;
    }

    public List getDecisions() {
        return decisions;
    }

    public List getActions() {
        return actions;
    }



    // setters

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDecisions(List decisions) {
        this.decisions = decisions;
    }

    public void setActions(List actions) {
        this.actions = actions;
    }
}
