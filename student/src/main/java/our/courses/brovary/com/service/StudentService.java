package our.courses.brovary.com.service;


import our.courses.brovary.com.domain.Student;
import our.courses.brovary.com.domain.criteria.StudentCriteria;
import java.util.List;

public interface StudentService {
    Student getStudentById(long id);

    Student getStudentByName(String name);

    Student getStudentByLastName(String lastName);

    Student getStudentByMiddleName(String muddleName);

    void deleteAll();

    List<Student> findAll();

    List<Student> findByCriteria(StudentCriteria criteria);
}