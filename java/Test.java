package com.company;

/**
 * Created by nick on 06.05.2016.
 *
 * Some class
 *
 */

class Test {

    private int t;

    public void setT(int t) {
        this.t = t;
    }

    public int getT() {
        return t;
    }

    Test() {
        setT(1);
    }

    Test(int t){
        setT(t);
    }

    public void zeroT() {
        setT(0);
    }
}