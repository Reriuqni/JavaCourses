package dbproject.repository.impl;

import dbproject.domain.Student;
import dbproject.domain.criteria.StudentCriteria;
import dbproject.repository.StudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static dbproject.repository.impl.db.Database.getMySQLDataSource;

public class StudentMySqlRepository implements StudentRepository {
    private static final String INSERT_SQL = "INSERT INTO student(NAME,LAST_NAME, MIDDLE_NAME) VALUES(?,?,?)";
    private static final String GET_ALL_SQL = "SELECT * FROM STUDENT";
    private static final String GET_BY_ID_SQL = "SELECT * FROM STUDENT WHERE ID=?";
    private static final String DELETE_ALL_SQL = "TRUNCATE STUDENT";

    @Override
    public Student get(long id) {
        try (Connection con = getMySQLDataSource().getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(GET_BY_ID_SQL)) {
                try (ResultSet rs = ps.executeQuery()) {
                    ps.setLong(1, id);

                    while (rs.next()) {
                        Student s = new Student();
                        s.setId(rs.getLong(1));
                        s.setName(rs.getString(2));
                        s.setLastName(rs.getString(3));
                        s.setMiddleName(rs.getString(4));
                        return s;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public long create(Student student) {
        long id = 0;
        try (Connection con = getMySQLDataSource().getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, student.getName());
                ps.setString(2, student.getLastName());
                ps.setString(3, student.getMiddleName());
                ps.executeUpdate();

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    while (rs.next()) {
                        id = rs.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student findByName(String name) {
        return null;
    }

    @Override
    public Student findByLastName(String name) {
        return null;
    }

    @Override
    public Student findByMiddleName(String name) {
        return null;
    }

    @Override
    public List<Student> findByCriteria(StudentCriteria criteria) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try (Connection con = getMySQLDataSource().getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(GET_ALL_SQL)) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Student s = new Student();
                    s.setId(rs.getInt(1));
                    s.setName(rs.getString(2));
                    s.setMiddleName(rs.getString(3));
                    s.setLastName(rs.getString(4));

                    students.add(s);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //GET_ALL_SQL
        return students;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void deleteAll() {
        PreparedStatement ps = null;
        try (Connection con = getMySQLDataSource().getConnection()) {
            ps = con.prepareStatement(DELETE_ALL_SQL);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
