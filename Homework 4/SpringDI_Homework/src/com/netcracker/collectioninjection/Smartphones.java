package com.netcracker.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Smartphones {
    List smartphonesList;
    Set smartphonesSet;
    Map smartphonesMap;

    public List getSmartphonesList() {
        System.out.println("List elements:");
        return smartphonesList;
    }

    public Smartphones(List smartphonesList, Set smartphonesSet, Map smartphonesMap) {
        this.smartphonesList = smartphonesList;
        this.smartphonesSet = smartphonesSet;
        this.smartphonesMap = smartphonesMap;
    }

    public void setSmartphonesList(List smartphonesList) {
        this.smartphonesList = smartphonesList;
    }

    public Set getSmartphonesSet() {
        System.out.println("Set elements:");
        return smartphonesSet;
    }

    public void setSmartphonesSet(Set smartphonesSet) {
        this.smartphonesSet = smartphonesSet;
    }

    public Map getSmartphonesMap() {
        System.out.println("Map elements:");
        return smartphonesMap;
    }

    public void setSmartphonesMap(Map smartphonesMap) {
        this.smartphonesMap = smartphonesMap;
    }
}
