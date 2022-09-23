import java.util.*;

/*
 * 
 * 
 * 
Pattern for N = 4

   1
  121
 12321   
1234321 

 * 
 */
public class Pattern14 {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //isosceles triangle
        for (int i = 1;i<=n; i++) {
            //printing spaces
            for(int j=0;j < n-i; j++){
                System.out.print(" ");
            }

            //printing the left side until middle column
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }

            //printing the right side of the triangle
            for(int r=i-1;r>=1;r--){
                System.out.print(r);
            }
            
            System.out.println();
        }
    }
}