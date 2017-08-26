package Std;

import java.util.Date;

public class Student implements Cloneable {
    private int age;
    private String name;
    private Date birthday;
    private Address address;

    public Student(int age, String name, Date birthday) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }

    public Student(Student student) {
        age = (student == null) ? 0 : student.getAge();
        name = student.getName();
        birthday = new Date(student.getBirthday().getTime());
        address = new Address(student.getAddress());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }

    @Override
    protected Student clone() {
        try {
            Student student = (Student) super.clone();
            student.address = address.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
