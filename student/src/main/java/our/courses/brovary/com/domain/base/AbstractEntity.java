package our.courses.brovary.com.domain.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public abstract class AbstractEntity {
    private long id;
    private Date createdAt;
    private Date updatedAt;
}