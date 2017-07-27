package com.prikhodko.Oop1;

/**
 * Created by руслан on 22.07.2017.
 */

    public class Group {
        private String name;
        private int count;
        private Student[] students;


        public void addStudent(Student student) {
            if (student == null)
                throw new IllegalArgumentException("Student cant be null!");
            if (students == null) students = new Student[25];
            students[count++] = student;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Student[] getStudents() {
            return students;
        }

        void getGroupInfo() {
            System.out.println(name);
            for (Student s : students) {
                if (s != null) {
                    System.out.println(s.getInfo());
                    System.out.println();
                }
            }
        }
}
