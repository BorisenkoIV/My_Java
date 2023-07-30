package Sem_2;

import java.io.FileWriter;
import java.lang.System.Logger.Level;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class program2 {
    
    public static void main(String[] args) {
        // System.out.println("bye world");
        // String s = null; // определяется парой
        // System.out.println(s); //определяется парой
        task5 (repeat (10, "TEST"));
    }
        // System.out.println(task3("по Java"));
        // System.out.println(task4(2, -2));

/* Текст задачи 1:
Дано четное число N (>0) и символы c1 и c2. Написать метод,
который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, 
начиная с c1.
*/

// Архип Чижанов (Администратор)
static String task1 (int n, char c1, char c2){
        /*Текст задачи:
 Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит
 из чередующихся символов c1 и c2, начиная с c1.*/
        StringBuilder stringBuilder = new StringBuilder();
        if( n % 2 == 0){
            for (int i = 0; i < n/2 ; i++) {
                stringBuilder.append(c1).append(c2);
            }
            return stringBuilder.toString();
        } else {
            System.out.println("N is not even number");
            return null;
        }
    }

/*  Текст задачи 2:
Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
Результат - a4b3cd2 для примера...
*/

// Архип Чижанов (Администратор)
static String task2(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == chars[i-1]){
                count++;
            } else {
                stringBuilder.append(chars[i-1]).append(count+1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        return stringBuilder.toString();
    }

/*  Текст задачи 3:
Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
(возвращает boolean значение).*/

// Архип Чижанов (Администратор)
static boolean task3 (String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();
        System.out.println(str);
        System.out.println(str2);
        return str.equals(str2);
    }


/*  Текст задачи 4:
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
запишет эту строку в простой текстовый файл, обработайте исключения.*/

// Архип Чижанов (Администратор)
static void task4 (String str) {

        String path = "text.txt";
        try(FileWriter writer = new FileWriter(path, true)) {
            writer.write(str);
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }

    static String repeat(int n, String str){
        return str.repeat(n);
    }

/*  Текст задачи 5:
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
запишет эту строку в простой текстовый файл, обработайте исключения.*/

// Архип Чижанов (Администратор)
/**
 * @param str
 */
static void task5 (String str) {
        String path = "/f/f/text.txt";

        Logger logger = Logger.getAnonymousLogger();
        FileHandler handler = null;
        try {
            handler =  new FileHandler("log.txt", true);
        } catch (Exception e){
            e.printStackTrace();
        }

        logger.addHandler(handler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        handler.setFormatter(simpleFormatter);

        try(FileWriter writer = new FileWriter(path, true)) {
            writer.write(str);
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
            logger.log(Level.WARNING , e.getMessage());
        }
    }  
}
