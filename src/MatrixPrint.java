import java.util.*;
public class MatrixPrint {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.nextLine();
       char c1=sc.nextLine().charAt(0);
       char c2 = sc.nextLine().charAt(0);
       for(int i=1;i<=n;i++){
           int k=1;
           while(k++ <= i){
               System.out.print(c1);
           }
           while(k++ <= n+1){
               System.out.print(c2);
           }
           System.out.println();

       }
    }
}
