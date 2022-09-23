import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
        1
       23
      456
     78910       
 * 
 */
public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        for (int i = 0; i <= n; i++) {
            for (int k = n; k > i-1; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}