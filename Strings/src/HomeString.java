public class HomeString {

    public static void main(String[] args) {

        String s = "1  sf25gj   f-10456    jklm123";

        // 1 + 25 + 10456 + 123

        // 0 = U+0030
        // 9 = U+0039
        System.out.println("\u0030");
        System.out.println("\u0039");

        char[] cb = s.toCharArray();

        char[] sym = new int[10];
        for (int i = 0; i < sym.length; i++) {
            sym[i] = (char)"\u003"+i;
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(cb[i]);
            for (:
                 ) {

            }
        }
    }

}
