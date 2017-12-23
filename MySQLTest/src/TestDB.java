import domain.Student;
import repository.StudentRepository;
import repository.impl.StudentInMemoryRepository;
import repository.impl.StudentMySqlStudentRepository;

public class TestDB {
    public static void main(String[] args) {
        System.out.println("Start test");
        StudentRepository studentRepository = new StudentMySqlStudentRepository();

        System.out.println(studentRepository.get(13));
        /*

        Student student = new Student();
        student.setName("Anna");
        student.setLastName("Ivanenko");
        student.setMiddleName("Petrivich");
        studentRepository.add(student);

        System.out.println(studentRepository.findAll());
*/

       /*       Student student1 = new Student();
        student1.setLastName("Ivanenko1");
        student1.setMiddleName("Petrivich1");
        studentRepository.add(student);

        System.out.println(studentRepository.findAll());
*/
    }
}