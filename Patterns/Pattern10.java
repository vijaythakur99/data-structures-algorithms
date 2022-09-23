import java.util.*;

/*
 * 
 * 
 * Pattern for N = 4
 
A
BC
CDE
DEFG

 * 
 */
public class Pattern10 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = (int)'A'; i < (int)'A'+n; i++) {
            for(int j=i;j<= i+count; j++){
                System.out.print((char)j);
            }
            count++;
            
            System.out.println();
        }
    }
}