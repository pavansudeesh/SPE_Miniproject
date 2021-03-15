package Calculator;
import java.lang.Math;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii, Welcome to Scientific Calculator!!");
        System.out.println("Choose which operation to do, by selecting the corrosponding number");
        System.out.println("Press 1 to get square root \nPress 2 to get factorial\nPress 3 to get natural logarithm\nPress 4 to get power function");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("enter the number for which you want square root");
            double n = sc.nextDouble();
            System.out.println("sqrt of " + n + "=" + sqrt(n));
        } else if (input == 2) {
            System.out.println("enter the number for which you want factorial");
            int n1 = sc.nextInt();
            System.out.println("factorial of" + n1 + " = " + factorial(n1));
        } else if (input == 3) {
            System.out.println("enter the number for which you want ln");
            double n2 = sc.nextDouble();
            System.out.println("ln of" + n2 + "= " + ln(n2));
        } else if (input == 4) {
            System.out.println("enter the numbers of a,b for which you want a power b");
            double n3 = sc.nextDouble();
            double n4 = sc.nextDouble();
            System.out.println(+n3 + "^" + n4 + " = " + pow(n3, n4));
        } else {
            System.out.println("inavlid input");
        }

    }
        public static double sqrt ( double a)
        {
            logger.info("[ROOT] - " + a);
            double sqrt1 = Math.sqrt(a);
            logger.info("[RESULT - ROOT] - " + sqrt1);
            return sqrt1;
        }
        public static int factorial ( int n)
        {
            logger.info("[FACTORIAL] - " + n);
            int fact = 1;
            if (n == 0)
                return fact;
            fact = n*factorial(n-1);
            logger.info("[RESULT - FACTORIAL] - " + fact);
            return n * factorial(n - 1);
        }
        public static double ln ( double a)
        {
            logger.info("[LOG] - " + a);
            logger.info("[RESULT - LOG] - " + Math.log(a));
            return Math.log(a);
        }
        public static double pow ( double a, double b)
        {
            logger.info("[POWER] - " + a + ", " + b);
            logger.info("[RESULT - POWER] - " + Math.pow(a,b ));

            return Math.pow(a, b);
        }
}