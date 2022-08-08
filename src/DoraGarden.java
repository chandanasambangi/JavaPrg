import java.util.*;
public class DoraGarden {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col =sc.nextInt();
        int r=sc.nextInt();
        boolean b=false;
        //first row
        if((r>=1) && (r<= row) ){
            b=true;
        }
        else if((r>=(row*col)-row+1) && (r <= (row*col)) ){
            b=true;
        }
        else{
            for(int i=1;i<col;i++){
                if(r == (row*i + 1) ){
                    b=true;
                    break;
                }
            }
        }
        String ans =(b)?"Yes":"No";
        System.out.println(  ans  );
    }
}
