package Lesson4;

public class TestAB {

    public static void main(String[] args) {

        try {
            ClassA a = new ClassA();
            a.doSomething();
        }
        catch (MyException e) {
            System.out.println("We catch myexception");
        }

        try {
            ClassB b = new ClassB();
            b.doSomething();
        }
        catch (MyException e) {
            System.out.println("We catch exception");
        }


    }
}
