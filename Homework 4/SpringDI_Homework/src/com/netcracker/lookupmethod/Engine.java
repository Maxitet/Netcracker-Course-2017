package com.netcracker.lookupmethod;

public class Engine {
    private float hp;
    private boolean isTurbo;

    public Engine() {
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setIsTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Engine{");
        sb.append("hp=").append(hp);
        sb.append(", isTurbo=").append(isTurbo);
        sb.append('}');
        return sb.toString();
    }
}
