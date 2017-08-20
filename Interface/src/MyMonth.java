enum MyMonth {
    JAN(31,"January", "Січень"),
    FEB(28, "February", "Лютий");

    private int days;
    private String nameEn;
    private String nameUa;

    MyMonth(int days, String nameEn, String nameUa) {
        this.days = days;
        this.nameEn = nameEn;
        this.nameUa = nameUa;
    }

    @Override
    public String toString() {
        return this.name() + "_" + this.ordinal();
    }

    public MyMonth getValue(int i) {
       return values()[i-1];
    }
}
