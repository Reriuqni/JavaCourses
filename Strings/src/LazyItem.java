public class LazyItem {

    static class Item {
        String name;

        Item(String name) {
            this.name = name;
        }
    }

    static void printName(Item[] items) {
        for (Item a : items) System.out.println(a.name);
    }

    public static void main(String[] args) {

        Item[] a = new Item[]{new Item("a"), new Item("b")};
        Item[] b = {new Item("c")};

        printName(a); // ok
        printName(b); // ok
        printName(new Item[]{new Item("d")}); // ok
        //printName({new Item("e")}); // error
    }
}
