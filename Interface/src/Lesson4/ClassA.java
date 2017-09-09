package Lesson4;

public class ClassA {

    public void doSomething() throws MyException {
        System.out.println("A class");
        throw new MyException("MyE");
    }

    public ClassA() throws MyException {
        throw new MyException("MyE");
    }
}
