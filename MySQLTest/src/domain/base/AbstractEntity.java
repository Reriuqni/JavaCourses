package domain.base;

import lombok.Setter;
import lombok.Getter;
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
