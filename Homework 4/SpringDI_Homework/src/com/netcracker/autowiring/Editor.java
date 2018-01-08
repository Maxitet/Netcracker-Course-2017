package com.netcracker.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Editor {

    @Autowired
    Spellchecker spellchecker;

    public Spellchecker getSpellchecker() {
        return spellchecker;
    }

    @Autowired
    public void setSpellchecker(Spellchecker spellchecker) {
        this.spellchecker = spellchecker;
    }
}
