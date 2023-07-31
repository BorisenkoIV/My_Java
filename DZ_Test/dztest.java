package DZ_Test;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class dztest {
    public static void main(String[] args) {
        // System.out.println("bye world");
        // String s = null; // определяется парой
        // System.out.println(s); //определяется парой
        task7();
        // System.out.println(task3("Добро пожаловать на курс по Java"));
        // System.out.println(task4(2, -2));
    }

   public static void task7() {

        class Calculator {
            public int calculate(char op, int a, int b) {
                // Введите свое решение ниже
                int result;
                switch (op) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        result = 0;
                        break;
                }
            
                int note;
               note = result;
                logStep(note);
                return result;
                }
                
            }
        }

    public static void logStep(int note) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            OutputStreamWriter fileWriter;
            fileWriter.write(timestamp + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    class Printer {

        private static final String LOG_FILE_PATH = "log.txt";

        public static void main(String[] args) {
            int a = 0;
            char op = ' ';
            int b = 0;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = 3;
                op = '+';
                b = 7;
            } else {
                a = Integer.parseInt(args[0]);
                op = args[1].charAt(0);
                b = Integer.parseInt(args[2]);
            }

            clearLogFile();
            Calculator calculator = new Calculator();
            int result = calculator.calculate(op, a, b);
            System.out.println(result);

            try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void clearLogFile() {
            File logFile = new File(LOG_FILE_PATH);
            if (logFile.exists()) {
                try {
                    FileWriter fileWriter = new FileWriter(logFile, false);
                    fileWriter.write("");
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}