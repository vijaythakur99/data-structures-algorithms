import java.util.*;

/*
 * 
 * 
 * 
Pattern for N = 5

E
DE
CDE
BCDE
ABCDE

 * 
 */
public class Pattern11 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = (int)'A'+n-1; i >= (int)'A'; i--) {
            for(int j=i;j < (int)'A'+n; j++){
                System.out.print((char)j);
            }
            
            System.out.println();
        }
    }
}