package com.company;

/**
 * Created by nick on 13.05.2016.
 *
 * Das neue Schluhen klasse fur threading =)
 *
 */

class DasNeueKlass extends Thread {

    private int num;

    @Override
    public void run() {
        String name = getName();
        for (int i = 0; i <= getNum(); i++) {
            System.out.println(name+':'+i);
        }
        System.out.println("Guten tag from '"+name+"' Klasse! ");
    }

    public void setNum(int n) {
        this.num = n;
    }

    public int getNum() {
        return this.num;
    }

    DasNeueKlass() {
        setName("default");
        setNum(10);
    }

    DasNeueKlass(String name, int num) {
        setName(name);
        setNum(num);
    }

}
