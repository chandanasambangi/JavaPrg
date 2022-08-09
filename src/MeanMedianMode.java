import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("mean : " + mean(array));

    }
    public static double mean(int[] array){
        double result=0.0;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        result=sum/(array.length);
        return result;
    }
}
