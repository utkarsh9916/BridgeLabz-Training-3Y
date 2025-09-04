package Assignment.Methods_Practise.Level3;

/*
Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month.
Write a Method to get the name of the month.
Write a Method to get the number of days in the month.
Write a method to get the first day of the month using the Gregorian calendar algorithm
*/
import java.util.*;
public class Q10_CalendarDisplay {
    public static String monthName(int m){ String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"}; return months[m-1]; }
    public static boolean isLeap(int y){ return (y%400==0)|| (y%4==0 && y%100!=0); }
    public static int daysInMonth(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeap(y)) return 29;
        return d[m-1];
    }
    public static int firstDayOfMonth(int m,int y){
        int Y=y; int M=m;
        if(M<3){ M+=12; Y-=1; }
        int K=Y%100; int J=Y/100;
        int q=1;
        int h=(q + (13*(M+1))/5 + K + K/4 + J/4 + 5*J) % 7;
        int d=(h+6)%7;
        return d;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(); int y=sc.nextInt();
        System.out.println("    "+monthName(m)+" "+y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int first=firstDayOfMonth(m,y);
        int days=daysInMonth(m,y);
        for(int i=0;i<first;i++) System.out.print("   ");
        for(int day=1;day<=days;day++){
            System.out.printf("%2d ",day);
            if((first+day)%7==0) System.out.println();
        }
        System.out.println();
    }
}
