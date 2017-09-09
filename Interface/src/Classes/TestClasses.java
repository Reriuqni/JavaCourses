package Classes;

public class TestClasses {

    public static void main(String[] args) {

        InnerClass_A a = new InnerClass_A();
        InnerClass_A.InnerClass_B b = a.new InnerClass_B();
        //InnerClass_A.InnerClass_B b = a.createB();

        b.func();

        InnerClass_C c = new InnerClass_C();
        InnerClass_C.InnerClass_D d = c.new InnerClass_D();

        a = c;
        b = d;

        a.func();
        b.func();

        InnerClass_A.InnerClass_B ab = new InnerClass_C().new InnerClass_D();

        ab.func();


        NestedClass_E.NestedClass_G g = new NestedClass_E.NestedClass_G();
        g.func();

        System.out.println();

        NestedClass_H h = new NestedClass_H();
        h.func();

        AnonymousClass ac = new AnonymousClass();
        ac.doSomething();

        Function function = new Function() {
            @Override
            public void doSomething() {
                System.out.println("from anonymous");
            }
        };

        function.doSomething();

    }
}
