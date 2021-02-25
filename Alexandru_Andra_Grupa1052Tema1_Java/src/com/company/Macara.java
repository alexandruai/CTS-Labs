package com.company;

public class Macara  {

    TipContainer[] tipContainer = new TipContainer[4];
    int timpManipulare;

    public Macara(TipContainer[] tipContainer, int timpManipulare) {
        this.tipContainer = tipContainer;
        this.timpManipulare = timpManipulare;
    }

    public TipContainer[] getTipContainer() {
        return tipContainer;
    }

    public void setTipContainer(TipContainer[] tipContainer) {
        this.tipContainer = tipContainer;
    }

    public int getTimpManipulare() {
        return timpManipulare;
    }

    public void setTimpManipulare(int timpManipulare) {
        this.timpManipulare = timpManipulare;
    }

}
