package com.netcracker.autowiring;

public class SpellcheckerServiceByName {
    Spellchecker spellchecker;

    public SpellcheckerServiceByName() {
        System.out.println("autowiring by name");
        this.spellchecker = spellchecker;
    }

    public Spellchecker getSpellchecker() {
        return spellchecker;
    }

    public void setSpellchecker(Spellchecker spellchecker) {
        this.spellchecker = spellchecker;
    }

    public void spellCheck() {
        spellchecker.spellCheck();
    }
}
