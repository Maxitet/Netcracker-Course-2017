package com.netcracker.simpleinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Computer {


    protected VCard vCard;

    protected int coresNumber;
    protected String owner;

    //Constructor based DI
    /*public Computer(VCard vcard, int coreNumber, String owner) {
        this.vCard = vcard;
        this.coresNumber = coreNumber;
        this.owner = owner;
    }*/

    @Required
    @Autowired
    @Qualifier("main")
    public void setvCard(VCard vCard) {
        this.vCard = vCard;
    }

    @Required
    public void setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computer{");
        sb.append("vCard=").append(vCard);
        sb.append(", coresNumber=").append(coresNumber);
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
