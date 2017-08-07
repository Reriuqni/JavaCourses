import java.text.SimpleDateFormat;
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

    /**
     * Block of constants
     */
    private final int COUNT_OF_FIELDS = 4;
    private final String SEPARATOR = " ";
    private final String timePattern = "yyyy-MM-dd HH:mm:ss";
    private final int IMPORTANCE_MIN_VALUE = 1;
    private final int IMPORTANCE_MAX_VALUE = 4;

    /**
     * First constructor which gets parameters as separated values
     *
     * @param date         instance of Date class
     * @param importance   integer value in 1..4 range
     * @param source       String without spaces
     * @param errorMessage String which can contain spaces
     */
    public Record(Date date, int importance, String source, String errorMessage) {
        setParameters(date, importance, source, errorMessage);
    }

    /**
     * Second constructor which gets parameters as String value
     *
     * @param parametersAsString contains String as parameters "date importance source errorMessage"
     *                           'date' instance of Date class
     *                           'importance' integer value in 1..4 range
     *                           'source' String without spaces
     *                           'errorMessage' String which can contain spaces
     */
    public Record(String parametersAsString) {
        // get all the arguments as array of objects
        Object[] objParameters = parseParameters(parametersAsString);
        // and separate them into the
        Date date = (Date) objParameters[0];
        int importance = Integer.parseInt((String) objParameters[1]);
        String source = (String) objParameters[2];
        String errorMessage = (String) objParameters[3];
        // set the parameters
        setParameters(date, importance, source, errorMessage);
    }

    /**
     * Method checks and sets the fields into the values of arguments
     *
     * @param date         instance of Date class
     * @param importance   integer value in 1..4 range
     * @param source       String without spaces
     * @param errorMessage String which can contain spaces
     */
    public void setParameters(Date date, int importance, String source, String errorMessage) {
        checkParameters(date, importance, source, errorMessage);
        this.date = date;
        this.importance = importance;
        this.source = source.trim();
        this.errorMessage = errorMessage.trim();
    }

    /**
     * Method checks the values of arguments and throws an exception in case of error
     *
     * @param date         instance of Date class
     * @param importance   integer value in 1..4 range
     * @param source       String without spaces
     * @param errorMessage String which can contain spaces
     * @throws IllegalArgumentException in case of inappropriate values of arguments
     */
    private void checkParameters(Date date, int importance, String source, String errorMessage) {
        if (checkDate(date)) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        if (checkImportance(importance)) {
            throw new IllegalArgumentException("Importance must be in 1..4 range!");
        }
        if (checkSource(source)) {
            throw new IllegalArgumentException("Source cannot be empty!");
        }
        if (checkErrorMessage(errorMessage)) {
            throw new IllegalArgumentException("Error message cannot be empty!");
        }
    }

    /**
     * Checkers
     */

    private boolean checkDate(Date date) {
        return (date == null);
    }

    private boolean checkImportance(int importance) {
        return (importance < IMPORTANCE_MIN_VALUE || importance > IMPORTANCE_MAX_VALUE);
    }

    private boolean checkSource(String source) {
        return (source == null || source.trim().equals("") || source.trim().equals(SEPARATOR));
    }

    private boolean checkErrorMessage(String errorMessage) {
        return (errorMessage == null || errorMessage.trim().equals("") || errorMessage.trim().equals(SEPARATOR));
    }

    /**
     * Method parses the String into the array of Object
     *
     * @param parametersAsString contains String as parameters "111 2 aaa bbb_bbb"
     * @return array of Objects (Date, Integer, String, String)
     */
    private Object[] parseParameters(String parametersAsString) {
        //TODO: fix situation where string contains spaces between arguments
        String[] parametersArray = parametersAsString.split(SEPARATOR);
        if (parametersArray.length < COUNT_OF_FIELDS) {
            throw new IllegalArgumentException("Too few arguments!");
        }
        // create an array of Object class
        Object[] objParameters = new Object[COUNT_OF_FIELDS];
        // the first parameter is the instance of Date class
        Date tempDate = new Date();
        tempDate.setTime(Integer.parseInt(parametersArray[1]));
        objParameters[0] = tempDate;
        // second and others - Integer and 2 String objects, where 3-th parameter cannot contain ' '
        for (int i = 1; i < COUNT_OF_FIELDS; i++) objParameters[i] = parametersArray[i];
        // if 'errorMessage' contains ' ', add the remained words to the last parameter
        if (parametersArray.length > COUNT_OF_FIELDS) {
            int c = parametersArray.length - COUNT_OF_FIELDS;
            while (c > 0) {
                objParameters[COUNT_OF_FIELDS - 1] += (SEPARATOR + parametersArray[parametersArray.length - c]);
                c--;
            }
        }
        return objParameters;
    }

    /**
     * @return String representation of importance field
     */
    private String getStatus(int importance) {
        switch (importance) {
            case 1:
                return ".    ";
            case 2:
                return "!    ";
            case 3:
                return "!!!  ";
            case 4:
                return "!!!!!";
            default:
                throw new IllegalArgumentException("Wrong argument!");
        }
    }

    /**
     * Overrides toString() method for proper representation of our Object
     *
     * @return String representation
     */
    @Override
    public String toString() {
        return new SimpleDateFormat(timePattern).format(date) + SEPARATOR +
                getStatus(importance) + SEPARATOR +
                source + SEPARATOR +
                errorMessage;
    }
}
