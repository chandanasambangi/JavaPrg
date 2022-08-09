import java.util.*;
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.next();
        String string2=sc.next();
        //length
        System.out.println("String1 length is "+string1.length());
        System.out.println("String2 length is "+string2.length());
        //concatenate
        String string3 = string1+" "+string2 ;
        System.out.println(string3);
        //split
        String splitString[] = string3.split(" ",2);
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
        //reverse
        string1=rev(splitString[0]);
        string2=rev(splitString[1]);
        System.out.println(string1);
        System.out.println(string2);
        //strings are equal or not
        System.out.println("whether 2 strings are equal or not :  " +string1.equals(string2));



    }
    public static String rev(String temp){
        String ans="";
        for(int i=temp.length()-1;i>=0;i--){
            char ch=temp.charAt(i);
            ans=ans + ch;
        }
        return ans;
    }
}
