/*
Jeevitha just started work as a programming trainer for UIT's Placement Cell.
She is paid Rs.100 an hour, with a few exceptions.
 She earns an extra Rs.15 an hour for any part of a day where she works more than 8 hours,
 and an extra Rs.25 an hour for hours beyond 40 in any one week.
  Also, she earns a 25% bonus for working on Saturday and a 50% bonus for working on Sunday.
  The bonuses for Saturday and Sunday are computed based on the hours worked those days;
  they are not used to calculate any bonus for working more than 40 hours in a week.
  You'll be given the number of hours Jeevitha worked on each day in a week (Sunday, Monday, ..., Saturday),
  and you need to compute her salary for the week.
        Input consists of 7 integers less than or equal to 24 on separate lines.
         Print Jeevitha’s weekly salary as output.
*/

import java.util.*;
public class WeekSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        double sal=0;
        int wh=0;
        for(int i=1;i<6;i++){
            wh=wh+d[i];
            sal=sal+calday(d[i]);
        }
        if(wh > 40){
            sal=sal + ((wh-40)*25);
        }
        if(d[0] > 0){
            sal= sal + calday(d[0]) + (0.5)*calday(d[0]) ;
        }
        if(d[6] > 0){
            sal= sal + calday(d[6]) + (0.25)*calday(d[6]) ;
        }
        System.out.println(sal);


    }
    static double calday(int hrs){
        double ans;
        ans = 0.0;
        if(hrs <= 8){
            ans=hrs*100;
        }
        else{
            ans=800 + ((hrs-8)*115);
        }
        return ans;

    }
}
