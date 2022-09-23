import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
 
1
21
321
4321

 * 
 */
public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for(int j=i;j>=1; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}