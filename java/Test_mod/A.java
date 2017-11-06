package Test_mod;

public class A implements Runnable {
    private String name;

    public A (String str) {
        this.name = str;
    }

    @Override
    public void  run() {
        for(int i =0; i< 100; i++) {
            System.out.println("Tread " + this.name + " = " + i);
        }

    }
}

