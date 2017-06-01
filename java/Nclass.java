package com.company;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nick on 24.05.2016.
 *
 * messing with collections, iterators, array lists and other stuff
 *
 */

class Nclass {

    public void aVoid() {

        ArrayList<String> a = new ArrayList<String>();

        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");
        a.add("Ololo");

        for (String s: a) {
            System.out.println(s);
        }

        if (a.contains("Ololo")) {
            System.out.println("Ololo!");
        } else  {
            System.out.println("Not ololo :(");
        }

        a.remove("Ololo");

        Collections.sort(a);

        System.out.println(a+" "+a.size());

        Iterator<String> b = a.iterator();

        while (b.hasNext()) {
            System.out.println(b.next());
        }
    }

    Nclass() {
        aVoid();
    }
}
