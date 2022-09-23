import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
 
ABCD
BCDE
CDEF
DEFG

 * 
 */
public class Pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = (int)'A'; i < (int)'A'+n; i++) {
            for(int j=i;j< i+n; j++){
                System.out.print((char)j);
            }
            
            System.out.println();
        }
    }
}