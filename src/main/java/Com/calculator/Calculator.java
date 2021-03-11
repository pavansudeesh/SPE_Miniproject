package com.calculator;
import java.lang.Math;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("sqrt of 9 = " + sqrt(9));
        System.out.println("factorial of 5 = " + factorial(5));
        System.out.println("ln of 8 = "+ ln(8));
        System.out.println("2 ^ 3 = " + pow(2,3));
    }

    public static double sqrt(double a) {
        double sqrt = Math.sqrt(a);
        return sqrt;
    }
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }
    public static double ln(double a) {
        return Math.log(a);
    }
    public static double pow(double a,double b) {
        return Math.pow(a,b);
    }
}