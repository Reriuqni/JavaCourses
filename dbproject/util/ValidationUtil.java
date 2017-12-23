package dbproject.util;

import dbproject.domain.criteria.StudentCriteria;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class ValidationUtil {
    public static boolean validate(StudentCriteria criteria) {
        return (CollectionUtils.isEmpty(criteria.getIds()))
                || StringUtils.isEmpty(criteria.getName())
                || StringUtils.isEmpty(criteria.getLastName())
                || StringUtils.isEmpty(criteria.getMiddleName())
                || StringUtils.isEmpty(criteria.getSearchStr());
    }
}