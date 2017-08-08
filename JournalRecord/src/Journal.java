/**
 * Class Journal
 *
 * @author cortisol
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Journal {

    /**
     * Class fields
     */
    private Record[] setOfRecords;

    /**
     * Index of cursor
     */
    private int index;

    /**
     * Constructors
     */
    public Journal() {
        setOfRecords = new Record[1];
        index = 0;
    }

    public Journal(int size) {
        setOfRecords = new Record[size];
        index = 0;
    }

    /**
     * @param record
     */
    public void add(Record record) {
        // check record
        checkRecord(record);
        // add record to th current position
        if (setOfRecords[index] == null) setOfRecords[index] = record;
        else {
            // expand the array if needed
            if (index + 1 >= setOfRecords.length) changeArraySize(setOfRecords.length + 1);
            // add record to the next position
            setOfRecords[++index] = record;
        }
    }

    public void add(Journal journal) {
    }

    public void remove(Record record) {
        checkRecord(record);
        for (int i = 0; i < this.setOfRecords.length; i++) {
            if (this.setOfRecords[i].equals(record)) {
                this.setOfRecords[i] = null;
                break;
            }
        }
        rebuildArray();
    }

    public void remove(int index) {
        checkIndex(index);
        this.setOfRecords[index] = null;
        rebuildArray();
    }

    public void remove(int fromIndex, int toIndex) {
        checkIndex(fromIndex, toIndex);
        for (int i = fromIndex; i <= toIndex; i++) this.setOfRecords[i] = null;
        rebuildArray();
    }

    public void removeAll() {
        this.setOfRecords = new Record[1];
        this.index = 0;
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

    private void checkIndex(int index) {
        if (index < 0 || index > this.index) throw new IllegalArgumentException("Wrong index value!");
    }

    private void checkIndex(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        if (fromIndex > toIndex) throw new IllegalArgumentException("Wrong index value!");
    }

    private void checkRecord(Record record) {
        if (record == null) throw new IllegalArgumentException("Record cannot be null!");
    }

    private void changeArraySize(int newSize) {
        if (newSize < this.setOfRecords.length) throw new IllegalArgumentException("Wrong array size!");
        this.setOfRecords = Arrays.copyOf(this.setOfRecords, newSize);
    }

    private void rebuildArray() {
        Record[] tmpArray = new Record[this.setOfRecords.length];
        int tmpIndex = 0;
        for (int i = 0; i < this.setOfRecords.length; i++) {
            if (this.setOfRecords[i] != null) {
                tmpArray[tmpIndex] = this.setOfRecords[i];
                tmpIndex++;
            }
        }
        this.setOfRecords = Arrays.copyOf(tmpArray, tmpIndex);
        this.index = this.setOfRecords.length - 1;
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
