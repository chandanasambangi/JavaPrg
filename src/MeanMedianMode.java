import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        //mean
        System.out.println("mean is : " + mean(array));
        //median
        Arrays.sort(array);
        System.out.println("median  : " + median(array));
        //mode
        System.out.println("mode  : " + mode(array));



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
    public static double median(int[] array){
        double result=0.0;
        int size=array.length;
        if(size%2 == 0){
            result= (double)((array[size/2 - 1] + array[size/2]))/28;
        }
        else{
            result= (double)(array[(int)size/2]);
        }
        return result;
    }
    public static int mode(int[] array){
        int maxValue=0;
        int maxCount=0;
        int count=0;
        for (int i = 0; i < array.length; ++i) {
            count = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
