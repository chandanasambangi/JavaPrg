import java.util.*;
public class Alphabets {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String string = sc.nextLine();
       String result="";
       for(int i=0;i<string.length();i++){
           char character=string.charAt(i);
           if(Character.isAlphabetic(character)){
               if(Character.isUpperCase(character)){
                  character = Character.toLowerCase(character);
               }
               else{
                   character = Character.toUpperCase(character);
               }
           }
           result+=character;
       }
       System.out.println(result);
    }
}
