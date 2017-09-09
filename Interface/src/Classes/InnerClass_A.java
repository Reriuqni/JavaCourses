package Classes;

public class InnerClass_A {

    private static int count;

    private String name;

    public InnerClass_B createB() {
        return new InnerClass_B();
    }

    public class InnerClass_B {
        private String a;

        public void func() {
            name = "ddd";
            count = 6;
            getName();
            InnerClass_A.this.func();
            System.out.println(name);
            System.out.println(count);
        }
    }

    public void func() {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
