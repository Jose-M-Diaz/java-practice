package src;

import java.util.Scanner;

public class main {
    
   public static void main(String[] args) {
       System.out.println("The app is running");
       int n = 15;
       for(int num = 0; num <= n; num++) {
           if(num % 15 == 0)
           System.out.println("FizzBuzz");
           else if(num % 3 == 0)
           System.out.println("Fizz");
           else if(num % 5 == 0)
           System.out.println("Buzz");
           else
           System.out.println(num);
       }
   }
}
