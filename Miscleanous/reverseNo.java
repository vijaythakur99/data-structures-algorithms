package Miscleanous;
import java.util.*;

/*
 * 
 * 
 * 
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401. 

 * 
 */
public class reverseNo {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int r=0;
        for (int i = n;i>0; i=i/10) {
            r = (r*10) + (i%10);
        }
        System.out.println("reversed number is "+r);
    }
}