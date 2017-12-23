package our.courses.brovary.com.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import our.courses.brovary.com.domain.Student;
import our.courses.brovary.com.repository.impl.StudentInMemoryRepository;

import static org.junit.Assert.assertEquals;

public class StudentRepositoryTest {
    private StudentRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = new StudentInMemoryRepository();
        System.out.println("weokndkwoe");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("wkebfkwj");
    }

    @Test
    public void name() throws Exception {
        String s = "s";

        Student student = new Student();
        student.setId(2);
        student.setName("Petro");
        student.setLastName("Vasichkin");
        student.setMiddleName("Pupkin");

        long id = repository.create(student);
        System.out.println(id);

        assertEquals(2, id);
    }

    @Test
    public void name1() throws Exception {
    }
}