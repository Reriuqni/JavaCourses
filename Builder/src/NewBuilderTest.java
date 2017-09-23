import lombok.val;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author cortisol
 */

public class NewBuilderTest {

    public static void main(String[] args) {
        Employer employer = new Employer.Builder("Ivan", "Ivanovich", "Ivanov")
                //.name("")
                //.middleName("")
                //.lastName("")
                .gender(Gender.MALE)
                .familyStatus(FamilyStatus.SINGLE)
                .birthday(new Date(100000))
                .position("worker")
                .build();

        System.out.println(employer);

        employer.setGender(Gender.FEMALE);

        employer.setName("Ivanna");

        System.out.println(employer);

        employer.setBirthday(new Date(123000));

        System.out.println(employer);

        employer.setFamilyStatus(FamilyStatus.MARRIED);

        System.out.println(employer);

        employer.setPosition("secretary");

        System.out.println(employer);

        employer.setSomeField("aa");

        System.out.println(employer);

        employer.setBonus(2);

        System.out.println(employer);

        val ar = new ArrayList<>();


    }
}
