package com.prikhodko.Oop1;

import java.util.Date;

/**
 * Created by руслан on 22.07.2017.
 */

    public class Student {
        private int age;
        private String name;
        private String lastName;
        private String middleName;
        private String phone;
        private double averageMark;
        private Date birthday;

        public Student(){
        }
        public Student(int age){
            CheckUtil.check(age <= 15,
                    "age cant be less than 15");
            this.age=age;
        }
        public Student(int age,String name){
            this(age);
            CheckUtil.check(name == null,
                    "name cant be empty");
            this.name=name;
        }
    public Student(int age,String name, String lastName){
        this(age, name);
        CheckUtil.check(lastName == null,
                "last name cant be empty");
        this.lastName=lastName;
    }
        public Student(int age,String name, String lastName, String middleName){
            this(age, name, lastName);
            CheckUtil.check(middleName == null,
                    "middle name cant be empty");
            this.middleName=middleName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            CheckUtil.check(age <= 15,
                    "age cant be less than 15");
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            CheckUtil.check(name == null || name.isEmpty(),
                    "Name cant be null or empty");
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            CheckUtil.check(lastName == null || lastName.isEmpty(),
                    "Last name cant be null or empty");
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            CheckUtil.check(middleName == null || middleName.isEmpty(),
                    "Middle name cant be null or empty");
            this.middleName = middleName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public double getAverageMark() {
            return averageMark;
        }

        public void setAverageMark(double averageMark) {
            CheckUtil.check(averageMark < 0 || averageMark > 5,
                    "Average mark cant be less than 0");
            this.averageMark = averageMark;
        }

        public Date getBirthday() {
            return new Date(birthday.getTime());
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public String getInfo() {
            return "age= " + age
                    + "\nname= " + name
                    + "\nlast name= " + lastName
                    + "\nmiddle name=  " + middleName
                    + "\nphone= " + phone
                    + "\naverage mark= " + averageMark
                    + "\nbirthday= " + birthday;

        }
}
