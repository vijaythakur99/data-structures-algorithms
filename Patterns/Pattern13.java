import java.util.*;

/*
 * 
 * 
 * 
Pattern for N = 4

****
***
**
*   

 * 
 */
public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = n;i>0; i--) {
            for(int j=0;j < i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}