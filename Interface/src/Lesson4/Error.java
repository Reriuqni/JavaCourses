package Lesson4;

public class Error {

    public static void main(String[] args) {

        String num = null;
        Integer i;

        //TODO: monkey code
        try {
            i = Integer.valueOf(num);
        } catch (Exception e) {
            System.out.println("Bad integer");
        }
        finally {
            i = 1;
        }
        System.out.println(i);



        /*
        try {
            System.out.println("try");
            //throw new MyException("This is my exception");
            throw new NullPointerException("333");
        }
        /*catch (MyException e) {
            e.printStackTrace();
            System.out.println("We catch this exception");
        }*/
        /*catch (Exception e) {
            if (e instanceof NullPointerException) {
                System.out.println("This is null pointer exception");
            }
            System.out.println("We catch this exception");
        }
        finally {
            System.out.println("final block");
        }*/

    }
}
