package com.netcracker.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class SpellcheckerServiceByConstructor {

    private Spellchecker spellchecker;

    @Autowired
    public SpellcheckerServiceByConstructor(Spellchecker spellchecker) {
        System.out.println("autowiring by constructor");
        this.spellchecker = spellchecker;
    }

    public Spellchecker getSpellchecker() {
        return this.spellchecker;
    }

    public void spellCheck() {
        spellchecker.spellCheck();
    }
}
