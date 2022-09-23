import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
 
ABCD
ABCD
ABCD
ABCD

 * 
 */
public class Pattern8 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = (int)'A'; i < (int)'A'+n; i++) {
            for(int j=(int)'A';j< (int)'A'+n; j++){
                System.out.print((char)j);
            }
            
            System.out.println();
        }
    }
}