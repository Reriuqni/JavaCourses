public class HomeString {

    private static int[] numbers = new int[10];

    private static void setNumbers() {
        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 48; //ascii codes
    }

    private static boolean isDigit(char c) {
        for (int n : numbers) {
            if ((int) c == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        setNumbers();

        String str = "1  sf25gj   f-10456    jklm123";

        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                int j = i;
                while (j != str.length() && isDigit(str.charAt(j))) j++;
                number += Integer.parseInt(str.substring(i, j));
                i = j;
            }
        }

        System.out.println("Сумма чисел: "+number);

    }
}
