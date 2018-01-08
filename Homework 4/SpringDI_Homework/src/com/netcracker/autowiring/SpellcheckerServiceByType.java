package com.netcracker.autowiring;

public class SpellcheckerServiceByType {
    Spellchecker spellchecker;

    public SpellcheckerServiceByType() {
        System.out.println("autowiring by type");
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
