package Lesson4;

public class ClassB extends ClassA {

    @Override
    public void doSomething() throws NullPointerException {
        System.out.println("B class");
        throw new NullPointerException();
    }

    public ClassB() throws MyException {
        super();
    }
}
