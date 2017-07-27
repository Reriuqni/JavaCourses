package com.prikhodko.Oop1;

/**
 * Created by руслан on 22.07.2017.
 */
public class ТestStudents1507 {
    public static void main(String[] args) {

       /*
        Student studentA = new Student();
        studentA.setBirthday(new Date());
        System.out.println(studentA.getInfo());

        Date date = studentA.getBirthday();
        date.setTime(1000);
        System.out.println(studentA.getInfo());
        */
        Student studentA = new Student(16, "Vasilij", "Kononenko", "Ivanovich");
        studentA.setPhone("911");
        studentA.setAverageMark(5.0);

        Student studentB = new Student(16, "Petro", "Poroshenko", "Vasiljovich");
        studentB.setPhone("922");
        studentB.setAverageMark(2.0);

      /*
       studentA.setAge(16);
        studentA.setName("Petro");
        studentA.setLastName("Ivanov");
        studentA.setMiddleName("Ivanovich");
        studentA.setPhone("0963456712");
        studentA.setAverageMark(5);

        Student studentB = new Student();
        studentB.setAge(16);
        studentB.setName("Vasiliy");
        studentB.setLastName("P");
        studentB.setMiddleName("Ivanovich");
        studentB.setPhone("0963456712");
        studentB.setPhone("0963456712");
        studentB.setAverageMark(4.0);
*/
/*
        Group group = new Group();
        group.setName(null);
        group.setName("PM-81");
        group.addStudent(studentA);
        group.addStudent(studentB);
        System.out.println(group.getCount());
        group.getGroupInfo();
   */
        Group group = new Group();
        group.setName("PM-81");
        group.addStudent(studentA);
        group.addStudent(studentB);
        group.getGroupInfo();
    }
}
