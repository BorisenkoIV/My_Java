package Sem_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class program {

    public static void main(String[] args) {
        // System.out.println("bye world");
        // String s = null; // определяется парой
        // System.out.println(s); //определяется парой
        // task0();
        //task1(createArr(100, 0, 24));
        // task0();(repeat (10, "TEST"));
        Cat cat1 = new Cat( name: "Мурзик", owner: "Иван Петрович", breed: "Мейнкун", age: 6);
        System.out.println(cat1);
    }

    // Архип Чижанов (Администратор)
    static void task0() {
        /*
         ** Текст задачи 0:**
         * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
         * 3}.
         * Распечатайте содержимое данного множества.
         * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4,
         * 5, 6, 3}.
         * Распечатайте содержимое данного множества.
         * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
         * 3}.
         * Распечатайте содержимое данного множества.
         */
        Integer[] arr = { 1, 4, 3, 2, 9, 5, 3, 1, 4, 5, 6, 3 };
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr)); // не запоминает порядок заполнения
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr)); // запоминает порядок заполнения
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr)); // сортирует добавленные значения

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    } // 21:15

    // Архип Чижанов (Администратор)
    static void task1(Integer[] arr) {
        /*
         ** Текст задачи 1:**
         * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
         * цифрами от 0 до 24.
         * 2. Создайте метод, в который передайте заполненный выше массив и с помощью
         * Set вычислите
         * процент уникальных значений в данном массиве и верните его в виде числа с
         * плавающей запятой.
         * Для вычисления процента используйте формулу:
         * процент уникальных чисел = количество уникальных чисел * 100 / общее
         * количество чисел в массиве.
         */

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        System.out.println(percent);
    }

    static Integer[] createArr(int size, int max, int min) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr; // 21:18
    }

    public void Cat(String name, String owner, String breed, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.breed = breed;
        healthHistory = new ArrayList<>();
    }

   
}
