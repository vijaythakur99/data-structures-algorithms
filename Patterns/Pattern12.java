import java.util.*;

/*
 * 
 * 
 * 
Pattern for N = 4

    1
   12
  123
 1234   

 * 
 */
public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0;i<n; i++) {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j <= 1+i; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}