public class HomeString {

    private static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {

        String str = "1  sf25gj   f-10456    jklm123";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                int j = i;
                while (j != str.length() && isDigit(str.charAt(j))) j++;
                sum += Integer.parseInt(str.substring(i, j));
                i = j;
            }
        }

        System.out.println("Сумма чисел: " + sum);
    }
}
