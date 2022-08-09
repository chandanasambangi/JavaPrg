import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=15;
        int marks[][] = new int[15][7];
        int total=0;
        for(int i=0;i<15;i++){
            System.out.println("Enter Student"+(i+1)+" marks");
            int studentTotal=0;
            for(int j=0;j<5;j++){
                marks[i][j]=sc.nextInt();
                studentTotal+=marks[i][j];
                total+=marks[i][j];
            }
            marks[i][5]=studentTotal;
        }

    }
    public static void total(int[][] marks){
        for(int i=0;i<15;i++){
            System.out.println("Total of Student"+(i+1)+" is "+marks[i][5]);
        }
    }
}
