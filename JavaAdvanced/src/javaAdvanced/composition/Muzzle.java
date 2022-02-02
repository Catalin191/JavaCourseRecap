package javaAdvanced.composition;

//Create a Muzzle class.
//a) Create a Muzzle object.
//b) Assigning the created object to a Dog object.
//c) How to use a Dog object to show all attributes of a Muzzle object?

public class Muzzle {

    private boolean hasSpikes;
    private String color;

    public Muzzle(boolean hasSpikes, String color) {
        this.hasSpikes = hasSpikes;
        this.color = color;
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes(boolean hasSpikes) {
        this.hasSpikes = hasSpikes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
