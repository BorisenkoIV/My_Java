// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Iterator;
import java.util.*;

public class program3 {
    public static void main(String[] args) {
        // System.out.println("bye world");
        // String s = null; // определяется парой
        // System.out.println(s); //определяется парой
        task3();
        //task1(createList( 10, 0, 9));
        // System.out.println(task3("Добро пожаловать на курс по Java"));
        // System.out.println(task4(2, -2));
    }

    /*
     ** Текст задачи-0:**
     * Даны следующие строки, cравнить их с помощью == и метода equals() класса
     * Object
     * 
     * String s1 = "hello";
     * String s2 = "hello";
     * String s3 = s1;
     * String s4 = "h" + "e" + "l" + "l" + "o";
     * String s5 = new String("hello");
     * String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
     */

    // 21:04 Решение:

    // Архип Чижанов (Администратор)
    static void task0() {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    } // 21:11

    // /*
    // * Текст задачи-1:
    // * Заполнить список десятью случайными числами. Отсортировать список методом
    // * sort() и вывести его на экран.
    // */
    // Архип Чижанов (Администратор)
    static void task1(List<Integer> list) {

        System.out.println(list);
        Collections.sort(list); // сортировка по возрастанию
        System.out.println(list);

        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());  // Компаратор - правило сортировки
                                                            // здесь - сортировка по убыванию
       
        System.out.println(list);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    /*
     * ++++++++++++++++++++++++
     * Николай Ковальчук
     * (max - min + 1) + min )
     * если 9 - 0 + 1 + 1
     * 
     * 21:21
     * 11 выходит
     * 
     * 21:21
     * а, тогда 10
     * 
     * 21:21-пояснения преподавателя...
     * +++++++++++++++++++++++++++
     */

    /*
     * Текст задачи-2:
     * Создать список типа ArrayList<String>. Поместить в него как строки, так и
     * целые числа. Пройти по списку, найти и удалить целые числа.
     */

    // Архип Чижанов (Администратор)
    static void task2() {

        List list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(22);
        list.add("hi");
        list.add(111);
        list.add("privet");

        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Integer) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

    // с ошибкой!!!(iterator-исправлено)

    /*
     * +++++++++++++++++++++
     * Николай Ковальчук
     * удаляем из итератора, а удаляется из базового листа тоже? Получается что
     * итератор не создает дубль
     * ++++++++++++++++++ коментарии в семинаре
     */

    /*
     * Текст задачи-3:
     * Каталог товаров книжного магазина сохранен в виде двумерного списка
     * List<ArrayList<String>> так, что на 0-й позиции
     * каждого внутреннего списка содержится название жанра, а на остальных позициях
     * - названия книг.
     * Напишите метод для заполнения данной структуры.
     */

    // Архип Чижанов (Администратор)
    static void task3() {
        // 0 // фантастика, марсианин, ...
        // 1 // роман, мастер и маргарита, евгений онегин, ...
        // 2 // классика, пушкин, лермонтов, ...
        List<List<String>> bookShop = new ArrayList<>();
        addBook("Фантастика", "Марсианин", bookShop);
        addBook("Роман", "Мастер и Маргарита", bookShop);
        addBook("Фантастика", "Солярис", bookShop);
        addBook("Роман", "Евгений Онегин", bookShop);
        addBook("Классика", "Война и мир", bookShop);

        System.out.println(bookShop);
    }

    static void addBook(String ganre, String bookName, List<List<String>> bookShop) {
        for (int i = 0; i < bookShop.size(); i++) {
            if (bookShop.get(i).get(0).equals(ganre)) {
                bookShop.get(i).add(bookName);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(bookName);
        bookShop.add(list);
    }
}