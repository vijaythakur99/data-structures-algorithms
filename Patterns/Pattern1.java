import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
    1
    12
    123
    1234
 * 
 */
public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}