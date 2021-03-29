package com.company;

import java.io.Serializable;

public class Salary <P> implements Serializable {
    private  P suma;

    public Salary(P suma) {
        this.suma = suma;
    }

    public Salary() {
    }

    public P getSuma() {
        return suma;
    }

    public void setSuma(P suma) {
        this.suma = suma;
    }

}
