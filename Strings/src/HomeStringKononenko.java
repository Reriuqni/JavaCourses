import java.util.Arrays;

public class HomeStringKononenko {

    public static void main(String[] args) {

        String s = "1  sf25gj   f-10456    jklm123";

        char[] ch = s.toCharArray();

        System.out.println(Arrays.toString(ch));

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                sb.append(Character.toString(ch[i]));
                if (i == ch.length - 1) sum += Integer.valueOf(sb.toString());
            } else {
                if (!sb.toString().isEmpty()) sum += Integer.valueOf(sb.toString());
                sb = new StringBuilder();
            }
        }
        System.out.println(sum);
    }
}
