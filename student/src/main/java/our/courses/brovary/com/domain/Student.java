package our.courses.brovary.com.domain;

import lombok.*;
import our.courses.brovary.com.domain.base.AbstractEntity;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends AbstractEntity {
    private String name;
    private String lastName;
    private String middleName;
}