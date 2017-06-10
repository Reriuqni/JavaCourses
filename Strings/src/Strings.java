public class Strings {

    public static void main(String[] args) {

        String s = new String("Hello");

        System.out.println(s + " " + s.length());

        s = s.concat("a");

        System.out.println(s + " " + s.length());

        System.out.println(s.equals("Helloa"));

        System.out.println(s.equalsIgnoreCase("helloa"));

        boolean a = s.equals(s.toLowerCase());

        System.out.println(a);

        s = s.concat(" 12 ");

        System.out.println(s + " " + s.length());

        s = s.trim();

        System.out.println(s + " " + s.length());

        s = s.substring(0, s.length());

        s = s.substring(0, 5);

        System.out.println(s + " " + s.length());

        s = s.replace('e', 'o');

        s = s.replaceAll("ll", "w");

        System.out.println(s + " " + s.length());

        System.out.println(s.isEmpty());

        System.out.println(s.charAt(3));

        System.out.println("indexOf "+s.indexOf('o'));

        s = s.concat(" how old are you?");

        String[] b = s.split(" ");

        System.out.println(b.length);

        for (String v : b) System.out.println(v);

        char[] c = s.toCharArray();

        for (char x: c) System.out.print(x);

        System.out.println("\n");

        System.out.println(String.format("%s-%s", s, "kuku"));

        System.out.println(s.compareTo("Hello"));
    }

}
