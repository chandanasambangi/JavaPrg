import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=10;
        int student[] =new int[size];
        for(int i=0;i<size;i++){
                student[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
           System.out.println( "roll number : "+(1000+i)+ "marks : "+ student[i]);
        }


    }
}
