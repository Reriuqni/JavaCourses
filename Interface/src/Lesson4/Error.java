package Lesson4;

public class Error {

    public static long rec(long i) {
        return i * rec(i - 1);
    }

    public static void main(String[] args) {

        String num = "ololo";
        Integer i;

        /*
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
*/

        try {
            throw new RuntimeException();
            //while (true) num += num;
            //rec(100000);
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory. o_O");
            e.printStackTrace();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow. O_o");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

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
