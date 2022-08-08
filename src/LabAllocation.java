/*There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating
 capacity of x, y, and z respectively.
  A single lab needs to be allocated to a class of 'n' students.
  The labs need to be utilized to the maximum i.e the number of systems used should not be minimal.
   Which lab needs to be allocated to this class?

        Input consists of 4 integers
        The first input denotes 'x', The second input denotes 'y', The third input denotes 'z', The fourth input denotes 'n'
        Output format: Print the lab which is suitable for 'n' number of students
        Example:

        Input
        30
        40
        20
        25

        Output
        L1*/
import java.util.*;
public class LabAllocation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        String ans="";

         int v1=x-n;
         int v2=y-n;
         int v3=z-n;
         if(v1 < 0){
             v1=n;
         }
        if(v2 < 0){
            v2=n;
        }
        if(v3 < 0){
            v3=n;
        }

        ans=v1<v2?((v1<v2)? "L1": "L3"):((v2<v3)? "L2":"L3");
        System.out.println(ans);




    }
}
