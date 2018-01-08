package com.netcracker.simpleinjection;

public class ComputerConfig {

    private VCard vCard = new Gt880m();
    private int coresNumber = 4;
    private String owner = "Oleg";

    public ComputerConfig() {
    }

    public VCard getvCard() {
        return vCard;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public String getOwner() {
        return owner;
    }
}
