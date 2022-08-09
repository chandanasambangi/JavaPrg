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
        System.out.println("Average of class :"+(total/15));
        System.out.println("Average of Maths Marks : "+averageOfSubject(marks,0));
        System.out.println("Average of Computer science Marks : "+averageOfSubject(marks,1));
        System.out.println("Average of Science Marks : "+averageOfSubject(marks,2));
        System.out.println("Average of Social Science Marks : "+averageOfSubject(marks,3));
        System.out.println("Average of English Marks : "+averageOfSubject(marks,4));

        System.out.println("Top 3 performers in Maths :");
        topPerformers(marks,0);
        System.out.println("Top 3 performers in Computer Science :");
        topPerformers(marks,0);
        System.out.println("Top 3 performers in Science :");
        topPerformers(marks,0);
        System.out.println("Top 3 performers in Social Science :");
        topPerformers(marks,0);
        System.out.println("Top 3 performers in English :");
        topPerformers(marks,0);

        belowAveragePerformers(marks);


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
                if (entry1[1] < entry2[1])
                    return 1;
                else
                    return -1;
            }
        });
        for(int i=0;i<15;i++){
            System.out.println( "rank "+(i+1)+" - Student"+(rankArray[i][0] +1 ));
        }

    }
    public static double averageOfSubject(int[][] marks,int subjectCode){

        int sum=0;
        for(int i=0;i<15;i++){
            sum+=marks[i][subjectCode];
        }
        return (sum/15);
    }
    public static void topPerformers(int[][] marks,int subjectCode){
        int[][] subjectMarksArray=new int[15][2];
        for(int i=0;i<15;i++){
            subjectMarksArray[i][0]=i;
            subjectMarksArray[i][1]=marks[i][subjectCode];
        }
        Arrays.sort(subjectMarksArray, new Comparator<int[]>() {
            public int compare(final int[] entry1, final int[] entry2) {
                if (entry1[1] < entry2[1])
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println("First performer is Student"+ (subjectMarksArray[0][0]+1));
        System.out.println("Second performer is Student"+ (subjectMarksArray[1][0]+1));
        System.out.println("Third performer is Student"+ (subjectMarksArray[2][0]+1));

    }
    public static void belowAveragePerformers(int[][] marks){
        System.out.println("Below Average Performers: ");
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(marks[i][j] < 50){
                    System.out.println("Student"+(i+1)+" Total"+(marks[i][5]));
                    break;
                }
            }
        }
    }

}
