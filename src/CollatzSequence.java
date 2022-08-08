import java.util.*;
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n > 1){
            System.out.print(n+" ");
           n = (n%2 == 0) ? (n/2) : ( 3*n + 1) ;
        }
        if(n != 0){
            System.out.print(n);
        }
    }
}
