package Miscleanous;
import java.util.*;

// You are given an input integer N, and you have to calculate the Nth
// Fibonacci number.
// For example, if the given number is 7, then the Fibonacci series will be 1,1,2,3,5,8,13,........ Then
// 13 will be the 7th fibonacci number.


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a nth number to be find in the fibonacci series");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int prev = 0;
        int current =1;

        int next = 0;

        for(int i=0;i<n;i++){
            next = current + prev;
            prev = current;
            current = next;
        }

        System.out.println(n+"th value from the fibonacci series is "+prev );
    }
}
