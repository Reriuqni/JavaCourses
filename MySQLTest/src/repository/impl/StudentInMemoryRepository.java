package repository.impl;

import domain.Student;
import domain.criteria.StudentCriteria;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentInMemoryRepository implements StudentRepository {
    private long count;
    private final List<Student> students;

    public StudentInMemoryRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public Student get(long id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student;
        }
        return null;
    }

    @Override
    public long add(Student student) {
        student.setId(++count);
        students.add(student);
        return student.getId();
    }

    @Override
    public void update(Student student) {
        long id = students.indexOf(student);

        if (id != 1) {
            students.set((int) id, student);
        }
    }

    @Override
    public Student findByName(String name) {
        for (Student student : students) {
            if (name.equals(student.getName()))
                return student;
        }
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
        for (Student student : students) {
            if (lastName.equals(student.getLastName()))
                return student;
        }
        return null;
    }

    @Override
    public Student findByMiddleName(String middleName) {
        for (Student student : students) {
            if (middleName.equals(student.getMiddleName()))
                return student;
        }
        return null;
    }

    @Override
    public List<Student> findByCriteria(StudentCriteria criteria) {
        // TODO: 18.11.2017 home
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(long id) {

    }
}