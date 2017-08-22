/**
 * Enum Importance
 *
 * @author cortisol
 */

public enum Importance {
    LowImportance("."),
    MediumImportance("!"),
    HighImportance("!!!"),
    CriticalImportance("!!!!!");

    private String strImportance;

    Importance(String s) {
        this.strImportance = s;
    }

    public String getStrImportance() {
        return strImportance;
    }
}
