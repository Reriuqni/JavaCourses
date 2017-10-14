import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        /** Итератор
         * и так поехали
         * что такое итератор и с чем его едят
         * первое что я хочу что в Java итератор определяет общий интерфейс для доступа и обхода элементов.
         *
         * Коллекции реализуют различные структуры данных, и вы мне ожете сказать как сделать обход сета припустим или
         * той же карты ведь у них нету индексов, мой ответ будет такой элементарно.
         * Идея паттерна Iterator заключается в том, что к коллекции привязывается объект,
         * который поможет обойти в некотором порядке все элементы коллекции.
         *
         * Вы думаете на этом все нет.
         * Самые хитрые могут скзать мне хах, зачем нам итератор ведь есть цикл форич,
         * для обхода коллекции и они в чем-то будут правы, ведь он перебирает быстрее всех в том числе и итератора.
         * Я лчино юзаю для перебора стрим апи, но это джава 8 и совсем другая история
         *
         * Давайте рассмотрим такой пример, его задают часто на собеседованиях
         * */
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("e");
        list.add("a");
        List<String> list1 = new ArrayList<>(list);
        System.out.println("list " + list);
        System.out.println("list1 " + list1);
        /** Я хочу перебирать и удалять с коллекци нужные мне элементы
         * идем делаьше и пробуем так
         * */
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("RunnableA")) list.remove(i);
        }
        System.out.println("list " + list);
        System.out.println("list1 " + list1);
        */
        /** Получается правда?
         *  Но не все коллекции можно перебрать по индексу правда а если взять интерфейс карта?
         * Пробуем так
         * раскомментируйте
         * */
        /*for (String s : list1) {
            if (s.equalsIgnoreCase("RunnableA")) list1.remove("a");
        }*/
        //System.out.println("list " + list);
        //System.out.println("list1 " + list1);
        /** Упс попали...
         * Что єто значит что модифицировать коллекцию и перебирать можно только через простой цикл но
         * вощвращаемся назад и вспоминаем что сет мы не переберем через простой цикл какой же выход с этой ситуации?
         * */

        Iterator<String> iterator = list1.iterator();
        /** Пробуем что у нас получается
         * для начала просто выедем на экран
         * */
        //while (iterator.hasNext()) System.out.println(iterator.next());
        /** Пробуем пробуем перебрать и удалить
         * */
        Iterator<String> iterator1 = list1.iterator();
        /*    while (iterator1.hasNext()) {
            String s = iterator1.next();
            if (s.equalsIgnoreCase("a")) iterator1.remove();

        }
        System.out.println("list1 " + list1);
        */
        /** смотрим на такой итератор - лист итератор
         * этот интерфейс отнаследован от интерфейса итератор
         * счотрим что добавилось
         * */
        ListIterator<String> listIterator = list1.listIterator();
        listIterator.next();
        /* System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        */
        /** Как обойти линкедлист без использования метода get(i) в обратном порядке
         * Все очень и очень просто
         * */
        /*LinkedList<String> list2 = new LinkedList<>(list);
        Iterator descendingIterator = list2.descendingIterator();
        while (descendingIterator.hasNext()) System.out.println(descendingIterator.next());
        */
        /**
         * Set no problem
         * */
        /* Set<String> set = new HashSet<>(list);
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) System.out.println(setIterator.next());
        */
        /**
         * Now try HashMap
         * As you know Map is separate collection, but there is iterator too
         * now make HashMap iterations
         * lets try
         * */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        Iterator mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) System.out.println(mapIterator.next());
        /**
         * this method works too
         */
        /*for (Map.Entry<Integer, String> pair : map.entrySet()) {
            Integer i = pair.getKey();
            String s = pair.getValue();
            System.out.println(i + "=" + s);
        }*/
        /**
         * Ok we did it
         * try to iterate and remove
         * ups little problem
         * */
        /*for (Integer key : map.keySet()) {
            map.remove(key);
        }*/
        /**
         * with Iterator
         * */
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(map);
        /** Итог нашел на сайте
         * ConcurrentModificationException не всегда является следствием неверной синхронизации работы с коллекциями.
         * ConcurrentModificationException возникает при изменении коллекции любыми средствами, отличными от итератора,\
         * при проходе по коллекции с помощью итератора.
         * Изменение такое, как продемонстрировано выше может происходить и в одно-тредной среде.
         * Не лишне также добавить, что исключение может возникать не только при удалении,
         * но и при добавлении элемента, а также что модификация контейнера может возникать и в многотредной среде.
         * Так что исключение не обязательно тривиальное. Однако, прежде чем пугаться,
         * есть повод проверить а не является ли это одним из приведенных выше антипаттернов.
         *
         * Надежность библиотек Java усыпляет.
         * Описанные выше примеры показывают, что в Java все таки есть способы «стрельнуть себе в ногу».
         * Good luck my dear students
         * */
    }
}