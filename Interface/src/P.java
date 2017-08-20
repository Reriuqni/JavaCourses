public class P implements Student, StudentA {

    private int i;

    public P() {
        i = 0;
    }

    public P(int i) {
        setI(i);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return getI() + " " + super.toString();
    }
}