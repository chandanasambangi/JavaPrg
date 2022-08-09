import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=15;
        int marks[][] = new int[15][6];
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
        total(marks);
        rank(marks);


    }
    public static void total(int[][] marks){
        for(int i=0;i<15;i++){
            System.out.println("Total of Student"+(i+1)+" is "+marks[i][5]);
        }
    }
    public static void rank(int[][] marks){
        int[][] rankArray=new int[15][2];
        for(int i=0;i<15;i++){
            rankArray[i][0]=i;
            rankArray[i][1]=marks[i][5];
        }
        Arrays.sort(rankArray, new Comparator<int[]>() {
            public int compare(final int[] entry1, final int[] entry2) {
                if (entry1[1] > entry2[1])
                    return 1;
                else
                    return -1;
            }
        });
        for(int i=0;i<15;i++){
            System.out.println( "rank "+(i+1)+" - Student"+(rankArray[i][0] +1 ));
        }

    }

}
