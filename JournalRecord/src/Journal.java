/**
 * Class Journal
 *
 * @author cortisol
 */

import java.util.Arrays;
import java.util.Date;

public class Journal {

    /**
     * Class fields
     */
    private Record[] setOfRecords;

    private int index = 0;

    /**
     * Constructors
     */
    public Journal() {
        setOfRecords = new Record[0];
    }

    public Journal(int size) {
        setOfRecords = new Record[size];
    }

    /**
     * @param record
     */
    public void add(Record record) {
        // check record
        checkRecord(record);
        // expand the array if needed
        if (this.index + 1 >= setOfRecords.length) changeArraySize(setOfRecords.length + 1);
        // add record to current position or to the next
        if (this.setOfRecords[this.index] == null) {
            this.setOfRecords[this.index++] = record;
        } else {
            this.setOfRecords[++this.index] = record;
        }

    }

    public void add(Journal j) {
    }

    public void remove(Record r) {
    }

    public void remove(int index) {
    }

    public void remove(int fromIndex, int toIndex) {
    }

    public void removeAll() {
    }

    public Journal filter(String s) {
        return null;
    }

    public Journal filter(Date fromDate, Date toDate) {
        return null;
    }

    public void sortByDate() {
    }

    public void sortByImportanceDate() {
    }

    public void sortByImportanceSourceDate() {
    }

    public void sortBySourceDate() {
    }

    /**
     * Helper methods
     */

    private void checkRecord(Record record) {
        if (record == null) throw new IllegalArgumentException("Record cannot be null!");
    }

    private void changeArraySize(int newSize) {
        if (newSize < this.setOfRecords.length) throw new IllegalArgumentException("Wrong array size!");
        this.setOfRecords = Arrays.copyOf(this.setOfRecords, newSize);
    }

    /**
     * Overrides toString() method for proper representation of our Object
     *
     * @return String representation
     */
    @Override
    public String toString() {
        return "Journal{" +
                "setOfRecords=" + Arrays.toString(setOfRecords) +
                ", index=" + index +
                '}';
    }
}
