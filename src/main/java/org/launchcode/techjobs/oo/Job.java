package org.launchcode.techjobs.oo;

import java.util.Objects;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    @Override
    public String toString(){
        String nextLine = System.lineSeparator();
        if (name == null) {
            name = "Data not available";
        }
        if (employer.getValue().isEmpty()) {
            employer.setValue("Data is not available");
        }
        if (location.getValue().isEmpty()) {
            location.setValue("Data is not available");
        }
        if (positionType.getValue().isEmpty()) {
            positionType.setValue("Data is not available");
        }
        if (coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue("Data is not available");
        }
        if (name == null && employer.getValue().equals("Data is not available") && location.getValue().equals("Data is not available") && positionType.getValue().equals("Data is not available") && coreCompetency.getValue().equals("Data is not available")) {
            return "OOPS! this job does not seem to exist.";
        } else return nextLine + "ID: " + id + nextLine + "Name: " + name + nextLine + "Employer: " + employer + nextLine + "Location: " + location + nextLine + "Position Type: " + positionType + nextLine + "Core Competency: " + coreCompetency;
    }



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
