import java.util.*;

/*
 * 
 * 
 * Pattern for N = 3
 
111
222
333

 * 
 */
public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}