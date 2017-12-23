package domain;

import domain.base.AbstractEntity;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends AbstractEntity {
    private String name;
    private String lastName;
    private String middleName;
}
