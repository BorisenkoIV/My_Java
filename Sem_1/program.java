import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Program
 */
public class program {
    public static void main(String[] args) {
        // System.out.println("bye world");
        // String s = null; // определяется парой
        // System.out.println(s); //определяется парой
        // task2();
        // System.out.println(task3("Добро пожаловать на курс по Java"));
        System.out.println(task4(2, -2));
    }

    static void task0() {
        /*
         * <aside>
         ** Текст задачи 0:**
         * В консоли запросить имя пользователя.
         * В зависимости от текуцего времени, вывести приветствие вида:
         * "Доброе утро, <Имя>!", если время от 65:00 до 11:59
         * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
         * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
         * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         * </aslde>
         */
        System.out.println("Введите свое имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12)
            System.out.println("Доброе утро, " + name);
        else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день, " + name);
        } else if (hour < 23) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }
        scanner.close();

    }

    static void task1() {
        /*
         * Текст задачи 1:
         * Дан массив двоичных чисел: [1,1,0,1,1,1],
         * вывести максимальное количество подряд идущих 1
         */

        int[] arr = { 1, 1, 0, 1, 0, 1, 1, 1, 1 };
        int temp = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                temp++;
            else if (arr[i] == 0) {
                if (temp > maxOnes) {
                    maxOnes = temp;
                }
                temp = 0;
            }
        }
        if (temp > maxOnes)
            maxOnes = temp;
        System.out.println(maxOnes);
    }

    static void task2() {
        /*
         * Текст задачи:
         * Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа,
         * равные заданному, нужно перенести эти элементы в конец массива.
         * Таким образом, первые несколько (или все) элементов массива должны быть
         * отличны от заданного, а остальные - равны ему.
         */

        int[] arr = { 3, 2, 2, 3, 44, 5, 9, 8, 7, 9, 9, 66 };
        int val = 9;
        int[] tempArr = new int[arr.length];
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                tempArr[current++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

    static String task3(String str) {
        /*
         * Текст задачи 3:
         * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
         * порядке.
         */

        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder.append(strArr[strArr.length - 1 - i]).append(" ");
        }
        return stringBuilder.toString();
    }

    /*
     * ЗАДАЧА 4:
     * Реализовать функцию возведения числа а в степень b. а, b из Z.
     * Сводя количество выполняемых действий к минимуму.
     * Пример 1: а = 3, b = 2, ответ: 9
     * Пример 2: а = 2, Ь = -2, ответ: 0.25
     * Пример 3: а = 3, b = 0, ответ: 1
     */
    
    // Вариант 1:
    // static double task4(double a, double b) {
    //     double result = Math.pow(a, b);
    //     return result;
    // }

       // Вариант 2: 
    static double task4(double a, double b){
        double result = 1;
       if(a==1 || b==0) return 1;
       for (int i=0; i < Math.abs(b); i++) {
        result = result * a;
       }
       return b > 0 ? result : 1/result;
       }

}
