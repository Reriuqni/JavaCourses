package our.courses.brovary.com.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import our.courses.brovary.com.domain.criteria.StudentCriteria;

public class ValidationUtil {
    public static boolean validate(StudentCriteria criteria) {
        return (CollectionUtils.isEmpty(criteria.getIds()))
                || StringUtils.isEmpty(criteria.getName())
                || StringUtils.isEmpty(criteria.getLastName())
                || StringUtils.isEmpty(criteria.getMiddleName())
                || StringUtils.isEmpty(criteria.getSearchStr());
    }
}