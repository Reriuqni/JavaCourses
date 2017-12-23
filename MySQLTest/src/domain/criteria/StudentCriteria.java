package domain.criteria;
import lombok.*;

@Getter
@Setter
@ToString
public class StudentCriteria {
    private long id;
    private String name;
    private String lastName;
    private String middleName;
}
