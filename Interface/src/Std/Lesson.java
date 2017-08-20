package Std;

import java.util.Date;

public class Lesson {

    public static void main(String[] args) {

        Address add = new Address("13", "Bankova", "Kyiv");

        Student s = new Student(12, "Petya", new Date());
        s.setAddress(add);

        Student s1 = s.clone();

        System.out.println(s);
        System.out.println(s1);

        add.setCity("Brovary");

        s.setBirthday(new Date(1000000));

        System.out.println(s);
        System.out.println(s1);
    }
}
