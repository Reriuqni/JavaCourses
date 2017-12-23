package dbproject.service.impl;

import dbproject.domain.Student;
import dbproject.domain.criteria.StudentCriteria;
import dbproject.repository.StudentRepository;
import dbproject.service.StudentService;
import dbproject.util.ValidationUtil;

import java.util.Collections;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student getStudentById(long id) {
        if (id < 1) throw new IllegalArgumentException("Bad id!");
        return repository.get(id);
    }

    @Override
    public Student getStudentByName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Bad name!");
        return repository.findByName(name);
    }

    @Override
    public Student getStudentByLastName(String lastName) {
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Bad last name!");
        return repository.findByLastName(lastName);
    }

    @Override
    public Student getStudentByMiddleName(String middleName) {
        if (middleName == null || middleName.isEmpty())
            throw new IllegalArgumentException("Bad muddle name!");
        return repository.findByMiddleName(middleName);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Student> findByCriteria(StudentCriteria criteria) {
        if (!ValidationUtil.validate(criteria)) return Collections.emptyList();
        return repository.findByCriteria(criteria);
    }
}