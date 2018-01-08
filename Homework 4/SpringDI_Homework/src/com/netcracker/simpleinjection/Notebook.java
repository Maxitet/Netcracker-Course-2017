package com.netcracker.simpleinjection;

public class Notebook extends Computer {
    int displayDiag;
    boolean transformer;

    public int getDisplayDiag() {
        return displayDiag;
    }

    public void setDisplayDiag(int displayDiag) {
        this.displayDiag = displayDiag;
    }

    public boolean isTransformer() {
        return transformer;
    }

    public void setTransformer(boolean transformer) {
        this.transformer = transformer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notebook{");
        sb.append("displayDiag=").append(displayDiag);
        sb.append(", transformer=").append(transformer);
        sb.append(", vCard=").append(vCard);
        sb.append(", coresNumber=").append(coresNumber);
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
