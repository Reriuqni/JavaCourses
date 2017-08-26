/**
 * Class Journal
 *
 * @author cortisol
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Journal implements Cloneable {

    /**
     * Class fields
     */
    private Record[] setOfRecords;

    /**
     * Index of current position
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
     * Method adds Record to Journal, expands array and shifts cursor to next position
     *
     * @param record instance of Record class
     */
    public void add(Record record) {
        check(record);
        // add record to th current position
        if (setOfRecords[index] == null) setOfRecords[index] = record;
        else {
            // expand the array if needed
            if (index + 1 >= setOfRecords.length) expandJournal(setOfRecords.length + 1);
            // add record to the next position
            setOfRecords[++index] = record;
        }
    }

    /**
     * Method adds Record from other Journal to this.Journal
     *
     * @param journal instance of Journal class
     * @throws IllegalArgumentException in case if other Journal is null
     */
    public void add(Journal journal) {
        check(journal);
        for (Record r : journal.setOfRecords) {
            if (r != null) add(r);
        }
    }

    /**
     * Method removes one Record from this.Journal and rebuilds this.Journal
     *
     * @param record instance of Record class to be removed
     * @throws IllegalArgumentException in case of record is null
     */
    public void remove(Record record) {
        check(record);
        for (int i = 0; i < setOfRecords.length; i++) {
            if (setOfRecords[i].equals(record)) {
                setOfRecords[i] = null;
                break;
            }
        }
        rebuildJournal();
    }

    /**
     * Method removes one Record with index from this.Journal and rebuilds this.Journal
     *
     * @param index int value of index
     * @throws IllegalArgumentException in checkIndex method in case of illegal index value
     */
    public void remove(int index) {
        check(index);
        setOfRecords[index] = null;
        rebuildJournal();
    }

    /**
     * Method removes Records in range 'fromIndex' to 'toIndex' from this.Journal and rebuilds this.Journal
     *
     * @param fromIndex int value of index
     * @param toIndex   int value of index
     * @throws IllegalArgumentException in checkIndex method in case of illegal index value
     */
    public void remove(int fromIndex, int toIndex) {
        check(fromIndex, toIndex);
        for (int i = fromIndex; i <= toIndex; i++) setOfRecords[i] = null;
        rebuildJournal();
    }

    /**
     * Method removes all Records from this.Journal and sets its size to 1 and index to 0
     */
    public void removeAll() {
        setOfRecords = new Record[1];
        index = 0;
    }

    /**
     * Method filters Records and returns new Journal with them
     *
     * @param strFilter String which contains values to be filtered
     * @return new Journal with filtered Records
     * @throws IllegalArgumentException in case of wrong Date values
     */
    public Journal filter(String strFilter) {
        if (strFilter != null && !strFilter.isEmpty()) {
            Journal filterJournal = new Journal();
            for (Record record : setOfRecords) {
                if (record != null && record.toString().toLowerCase().contains(strFilter.toLowerCase()))
                    filterJournal.add(record);
            }
            return filterJournal;
        } else throw new IllegalArgumentException("Filter cannot be empty!");
    }

    /**
     * Method filters Records and returns new Journal with them starting from 'fromDate' to 'toDate'
     *
     * @param fromDate Date object
     * @param toDate   Date object
     * @return new Journal with filtered Records
     * @throws IllegalArgumentException in case of wrong Date values
     */
    public Journal filter(Date fromDate, Date toDate) {
        check(fromDate, toDate);
        Journal filterJournal = new Journal();
        for (Record record : setOfRecords) {
            if (record != null && record.getDate().compareTo(fromDate) >= 0 && record.getDate().compareTo(toDate) <= 0)
                filterJournal.add(record);
        }
        return filterJournal;
    }

    /**
     * Method sorts Journal by date
     */
    public void sortByDate() {
        Comparator<Record> cmpRecord = new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        };
        Arrays.sort(setOfRecords, cmpRecord);
    }

    /**
     * Method sorts Journal by importance and date
     */
    public void sortByImportanceDate() {
        this.sortByDate();
        Comparator<Record> cmpRecord = new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.getImportance() - o2.getImportance();
            }
        };
        Arrays.sort(setOfRecords, cmpRecord);
    }

    /**
     * Method sorts Journal by source and date
     */
    public void sortBySourceDate() {
        this.sortByDate();
        Comparator<Record> cmpRecord = new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.getSource().compareTo(o2.getSource());
            }
        };
        Arrays.sort(setOfRecords, cmpRecord);
    }

    /**
     * Method sorts Journal by importance, source and date
     */
    public void sortByImportanceSourceDate() {
        this.sortBySourceDate();
        Comparator<Record> cmpRecord = new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.getImportance() - o2.getImportance();
            }
        };
        Arrays.sort(setOfRecords, cmpRecord);
    }

    /**
     * Overrides toString() method for proper representation of our Object
     *
     * @return String representation
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("------------------------------------\n");
        for (Record record : setOfRecords) {
            if (record != null) {
                sb.append(record.toString());
                sb.append("\n");
            }
        }
        sb.append("------------------------------------");
        return sb.toString();
    }

    /**
     * Checks if Date is not null
     *
     * @param date Date object
     */
    private void check(Date date) {
        if (date == null) throw new IllegalArgumentException("Date cannot be null");
    }

    /**
     * Checks if Dates are not null
     *
     * @param fromDate Date object
     * @param toDate   Date object
     */
    private void check(Date fromDate, Date toDate) {
        check(fromDate);
        check(toDate);
        if (fromDate.compareTo(toDate) > 0) throw new IllegalArgumentException("Date 'from' less than date 'to'!");
    }

    /**
     * Checks if Journal is not null
     *
     * @param journal Journal object
     */
    private void check(Journal journal) {
        if (journal == null) throw new IllegalArgumentException("Journal cannot be null");
    }

    /**
     * Checks if Record is not null
     *
     * @param record Record object
     */
    private void check(Record record) {
        if (record == null) throw new IllegalArgumentException("Record cannot be null!");
    }

    /**
     * Checks if index is in 0..this.index range
     *
     * @param index int value
     */
    private void check(int index) {
        if (index < 0 || index > this.index) throw new IllegalArgumentException("Wrong index value!");
    }

    /**
     * Checks if index is in 0..this.index range and fromIndex is less than toIndex
     *
     * @param fromIndex int value
     * @param toIndex   int value
     */
    private void check(int fromIndex, int toIndex) {
        check(fromIndex);
        check(toIndex);
        if (fromIndex > toIndex) throw new IllegalArgumentException("Wrong index value!");
    }

    /**
     * Expands size of this.Journal and copies content
     *
     * @param newSize int value
     */
    private void expandJournal(int newSize) {
        if (newSize < setOfRecords.length) throw new IllegalArgumentException("Wrong array size!");
        setOfRecords = Arrays.copyOf(setOfRecords, newSize);
    }

    /**
     * Rebuilds journal: null values are ignored, not null copied to new Journal,
     * than new Journal stored in this.Journal
     */
    private void rebuildJournal() {
        Record[] tmpArray = new Record[setOfRecords.length];
        int tmpIndex = 0;
        for (Record r : setOfRecords) {
            if (r != null) {
                tmpArray[tmpIndex] = r;
                tmpIndex++;
            }
        }
        setOfRecords = Arrays.copyOf(tmpArray, tmpIndex);
        index = setOfRecords.length - 1;
    }

    /**
     * Implementation of clone method
     *
     * @return cloned Journal
     */
    @Override
    protected Journal clone() {
        try {
            Journal jrn = (Journal) super.clone();
            jrn.setOfRecords = setOfRecords.clone();
            return jrn;
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
