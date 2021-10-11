/**
 * @author Raden Dimas Erlangga
 */
//this is java basic command used for creating a cube visual from a user number input
import java.util.Scanner;
public class square_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number = ");
        int N = sc.nextInt();
     
      for (int iOuter=0; iOuter<=N; iOuter++){
        for(int i=1; i<=N; i++){
            System.out.print("*");
        }
        System.out.println();
    } 
}
}