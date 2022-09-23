import java.util.*;

/*
 * 
 * 
 * 
Pattern for N = 5

    1
   232
  34543
 4567654
567898765 

 * 
 */
public class Pattern15 {
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
            for(int k=i;k<=(2*i)-1;k++){
                System.out.print(k);
            }

            //printing the right side of the triangle
            for(int r=(2*i)-2;r>=i;r--){
                System.out.print(r);
            }
            
            System.out.println();
        }
    }
}