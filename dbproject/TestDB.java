package dbproject;

import dbproject.domain.Student;
import dbproject.repository.StudentRepository;
import dbproject.repository.impl.StudentMySqlRepository;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestDB {
    public static void main(String[] args) {
        System.out.println("Start test");
        StudentRepository studentRepository = new StudentMySqlRepository();

        ExecutorService executorService = Executors.newCachedThreadPool();

        int threadCount = 10;
        List<Future<?>> futures = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            futures.add(executorService.submit(new Runnable() {
                @Override
                public void run() {

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Student student = new Student();
                    student.setName(RandomStringUtils.randomAlphanumeric(10));
                    student.setLastName(RandomStringUtils.randomAlphanumeric(10));
                    student.setMiddleName(RandomStringUtils.randomAlphanumeric(10));

                    studentRepository.create(student);
                }
            }));
        }
        waitForFutures(futures);

        // close connection
        executorService.shutdown();


/*        StudentService service = new StudentServiceImpl(studentRepository);

        System.out.println(service.getStudentById(13));

        System.out.println(service.findAll());

        service.deleteAll();
        *//*

        Student student = new Student();
        student.setName("Anna");
        student.setLastName("Ivanenko");
        student.setMiddleName("Petrivich");
        studentRepository.create(student);

        System.out.println(studentRepository.findAll());
*/

       /*       Student student1 = new Student();
        student1.setLastName("Ivanenko1");
        student1.setMiddleName("Petrivich1");
        studentRepository.create(student);

        System.out.println(studentRepository.findAll());
*/
    }

    private static void waitForFutures(List<Future<?>> futures) {
        futures.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}