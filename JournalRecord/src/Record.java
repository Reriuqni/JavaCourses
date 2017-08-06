import java.util.Date;

/**
 * @author cortisol
 */

public class Record {

    /**
     * Class fields
     */
    private Date date;
    private int importance;
    private String source;
    private String errorMessage;
    private final int COUNT_OF_FIELDS = 4;
    /**
     * @param date
     * @param importance
     * @param source
     * @param errorMessage
     */
    Record(Date date, int importance, String source, String errorMessage) {
        setParameters(date, importance, source, errorMessage);
    }

    Record(String parametersAsString) {
        // parse all the arguments into array of objects
        Object[] parameters = parseParameters(parametersAsString);
        Date date = (Date) parameters[0];
        int importance = Integer.parseInt((String) parameters[1]);
        String source = (String) parameters[2];
        String errorMessage = (String) parameters[3];
        // set the parameters
        setParameters(date, importance, source, errorMessage);
    }

    /**
     *
     * @param date
     * @param importance
     * @param source
     * @param errorMessage
     */
    public void setParameters(Date date, int importance, String source, String errorMessage) {
        checkParameters(date, importance, source, errorMessage);
        this.date = date;
        this.importance = importance;
        this.source = source;
        this.errorMessage = errorMessage;
    }

    /**
     *
     * @param date
     * @param importance
     * @param source
     * @param errorMessage
     */
    private void checkParameters(Date date, int importance, String source, String errorMessage) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        if (importance < 1 || importance > 4) {
            throw new IllegalArgumentException("Importance must be in 1..4 range!");
        }
        if (source == null || source.equals("")) {
            throw new IllegalArgumentException("Source cannot be empty!");
        } else {
            // TODO: normalize string
        }
        if (errorMessage == null || errorMessage.equals("")) {
            throw new IllegalArgumentException("Source cannot be empty!");
        } else {
            // TODO: normalize string
        }
    }

    /**
     *
     * @param parametersAsString
     * @return
     */
    private Object[] parseParameters(String parametersAsString) {
        String[] parametersArray = parametersAsString.split(" ");
        if (parametersArray.length != COUNT_OF_FIELDS) {
            throw new IllegalArgumentException("Wrong arguments!");
        }
        Object[] params = new Object[parametersArray.length];
        Date tempDate = new Date();
        tempDate.setTime(Integer.parseInt(parametersArray[1]));
        params[0] = tempDate;
        for (int i = 1; i < COUNT_OF_FIELDS; i++) {
            params[i] = parametersArray[i];
        }
        return params;
    }
}
