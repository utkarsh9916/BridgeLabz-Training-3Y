package Assignment.Methods_Practise.Level3;

/*
Level 3 Practice Programs
Create a program to find the shortest, tallest, and mean height of players present in a football team.
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team
Write the method to find the tallest height of the players on the football team
Finally display the results
*/
import java.util.*;
public class Q2_FootballTeamHeights {
    public static int[] createHeights(int n,int min,int max){
        int[] h=new int[n];
        for(int i=0;i<n;i++) h[i]=(int)(Math.random()*(max-min+1))+min;
        return h;
    }
    public static int sum(int[] a){ int s=0; for(int v:a) s+=v; return s; }
    public static double mean(int[] a){ return a.length==0?0.0: (double)sum(a)/a.length; }
    public static int minVal(int[] a){ int m=Integer.MAX_VALUE; for(int v:a) if(v<m) m=v; return m; }
    public static int maxVal(int[] a){ int m=Integer.MIN_VALUE; for(int v:a) if(v>m) m=v; return m; }
    public static void main(String[] args){
        int[] heights=createHeights(11,150,250);
        System.out.println(Arrays.toString(heights));
        System.out.println(sum(heights));
        System.out.printf("%.2f\n",mean(heights));
        System.out.println(minVal(heights));
        System.out.println(maxVal(heights));
    }
}
