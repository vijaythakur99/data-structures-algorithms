import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
    1
    23
    345
    4567
 * 
 */
public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= (2*i)-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}