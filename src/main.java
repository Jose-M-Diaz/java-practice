package src;

import java.util.Scanner;

public class main {
    
    private static long[] fibonacciCache;
   public static void main(String[] args) {
    //    System.out.println("The app is running");
    //    int n = 15;
    //    for(int num = 0; num <= n; num++) {
    //        if(num % 15 == 0)
    //        System.out.println("FizzBuzz");
    //        else if(num % 3 == 0)
    //        System.out.println("Fizz");
    //        else if(num % 5 == 0)
    //        System.out.println("Buzz");
    //        else
    //        System.out.println(num);
    //    }
    int n = 50;
        fibonacciCache = new long[n + 1];

        for( int i = 0; i <= n; i++) {
            System.out.print( fibonacci(i) + " ");
        }


   }

   private static long fibonacci(int n) {
       if(n <=1) {
           return n;
       }
       
       if(fibonacciCache[n] != 0) {
           return fibonacciCache[n];
       }

       long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n-2));
       fibonacciCache[n] = nthFibonacciNumber;
       return nthFibonacciNumber;
   }
}
