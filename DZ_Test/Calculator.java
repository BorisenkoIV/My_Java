package DZ_Test;
import java.io.IOException;
import java.util.logging.*;
import java.lang.System.Logger;
import java.util.Scanner;
// import java.util.logging.Level;
// import java.util.logging.LogManager;

public class Calculator {
    
public static void main(String[] args) {
    Logger logger = Logger.getLogger(Calculator.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        //logger.log(Level.WARNING, "Тестовое логирование 1");
try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number:");
    int num2 = scanner.nextInt();
    int result = num1 - num2;
    logger.log(Level.INFO, "Result:" + result);
    //System.out.println("Result:" + result);
}
}

public int calculate(char op, int a, int b) {
    return 0;
}
}

