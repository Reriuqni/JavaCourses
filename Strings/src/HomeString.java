public class HomeString {

    public static void main(String[] args) {

        String str = "1  sf25gj   f-10456    jklm123";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int j = i;
                while (j != str.length() && Character.isDigit(str.charAt(j))) j++;
                sum += Integer.valueOf(str.substring(i, j));
                i = j;
            }
        }

        System.out.println("Сумма чисел: " + sum);
    }
}
