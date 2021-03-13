package Calculator;
import java.lang.Math;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
public class Calculator
{
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
            double sqrt = Math.sqrt(a);
            return sqrt;
        }
        public static int factorial ( int n)
        {
            if (n == 0)
                return 1;

            return n * factorial(n - 1);
        }
        public static double ln ( double a){
            return Math.log(a);
        }
        public static double pow ( double a, double b){
            return Math.pow(a, b);
        }
}