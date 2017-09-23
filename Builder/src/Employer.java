/**
 * @author cortisol
 */

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
//@Data(staticConstructor = "name")
public class Employer extends BaseClass implements Cloneable {
    private String name;
    private String middleName;
    private String lastName;
    private Gender gender;
    private FamilyStatus familyStatus;
    private Date birthday;
    private double salary;
    private String position;
    private int bonus;

    private Employer(Builder builder) {
        this.name = builder.name;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.familyStatus = builder.familyStatus;
        this.birthday = builder.birthday;
        this.salary = builder.salary;
        this.position = builder.position;
    }

    public Employer() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof Employer;
    }

    /**
     * pattern helper class
     */
    public static class Builder {
        private final String name;
        private final String middleName;
        private final String lastName;
        private Gender gender;
        private FamilyStatus familyStatus;
        private Date birthday;
        private double salary;
        private String position;

        public Builder(String name, String middleName, String lastName) {
            this.name = name;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        /*
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }*/

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder familyStatus(FamilyStatus familyStatus) {
            this.familyStatus = familyStatus;
            return this;
        }

        public Builder birthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Employer build() {
            return new Employer(this);
        }

        @SneakyThrows
        @Override
        protected Employer clone(){
            return (Employer) super.clone();
        }
    }

}
