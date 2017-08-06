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

    /**
     * First constructor which gets parameters as separated values
     *
     * @param date         instance of Date class
     * @param importance   integer value in 1..4 range
     * @param source       String without spaces
     * @param errorMessage String which can contain spaces
     */
    Record(Date date, int importance, String source, String errorMessage) {
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
    Record(String parametersAsString) {
        // get all the arguments as array of objects
        Object[] parameters = parseParameters(parametersAsString);
        // and separate them into the
        Date date = (Date) parameters[0];
        int importance = Integer.parseInt((String) parameters[1]);
        String source = (String) parameters[2];
        String errorMessage = (String) parameters[3];
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
    private void setParameters(Date date, int importance, String source, String errorMessage) {
        checkParameters(date, importance, source, errorMessage);
        this.date = date;
        this.importance = importance;
        this.source = source;
        this.errorMessage = errorMessage;
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
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        if (importance < 1 || importance > 4) {
            throw new IllegalArgumentException("Importance must be in 1..4 range!");
        }
        if (source == null || source.equals("")) {
            throw new IllegalArgumentException("Source cannot be empty!");
        }
        if (errorMessage == null || errorMessage.equals("")) {
            throw new IllegalArgumentException("Error message cannot be empty!");
        }
    }

    /**
     * Method parses the String into the array of Object
     *
     * @param parametersAsString contains String as parameters "111 2 aaa bbb_bbb"
     * @return array of Objects (Date, Integer, String, String)
     */
    private Object[] parseParameters(String parametersAsString) {
        String[] parametersArray = parametersAsString.split(SEPARATOR);
        if (parametersArray.length < COUNT_OF_FIELDS) {
            throw new IllegalArgumentException("Too few arguments!");
        }
        // create an array of Object class
        Object[] objParameters = new Object[COUNT_OF_FIELDS];
        // the first parameter is the instance of Date class
        Date tempDate = new Date();
        tempDate.setTime(Integer.parseInt(parametersArray[1]));
        objParameters[0] = tempDate.toString();
        // second and others - Integer and 2 String objects, where 3-th parameter cannot contain ' '
        for (int i = 1; i < COUNT_OF_FIELDS; i++) objParameters[i] = parametersArray[i];
        // if 'errorMessage' contains ' ', add the remained words to the 4-th parameter
        if (parametersArray.length > COUNT_OF_FIELDS) {
            int c = parametersArray.length - COUNT_OF_FIELDS;
            while (c > 0) {
                objParameters[3] += SEPARATOR + parametersArray[parametersArray.length - c];
                c--;
            }
        }
        return objParameters;
    }

    /**
     * @return String representation of importance field
     */
    private String importanceToString() {
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
                throw new IllegalArgumentException("Wrong arguments!");
        }
    }

    /**
     * Overrides toString() method for proper representation of our Object
     *
     * @return String representation
     */
    @Override
    public String toString() {
        return date.toString() + SEPARATOR + importanceToString() + SEPARATOR + source + SEPARATOR + errorMessage;
    }
}
