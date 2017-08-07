/**
 * @author cortisol
 *
 */

import java.util.Date;

public class Journal {

    public void add(Record r) {}

    public void add(Journal j) {}

    public void remove(Record r) {}

    public void remove(int index) {}

    public void remove(int fromIndex, int toIndex) {}

    public void removeAll() {}

    public Journal filter(String s) {return null;}

    public Journal filter(Date fromDate, Date toDate) { return null;}

    public void sortByDate() {}

    public void sortByImportanceDate() {}

    public void sortByImportanceSourceDate() {}

    public void sortBySourceDate() {}



}
