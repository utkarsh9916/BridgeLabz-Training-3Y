package Assignment.Methods_Practise.Level3;

/*
Create a program to take input marks of students in 3 subjects: physics, chemistry, and maths. Compute the total, average, and the percentage score.
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Round off to 2 digits.
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t".
*/
import java.util.*;
public class Q14_StudentScoresPCM {
    public static int[][] genScores(int students){
        int[][] s=new int[students][3];
        for(int i=0;i<students;i++){
            s[i][0]=(int)(Math.random()*41)+50;
            s[i][1]=(int)(Math.random()*41)+50;
            s[i][2]=(int)(Math.random()*41)+50;
        }
        return s;
    }
    public static double[][] compute(int[][] s){
        int n=s.length;
        double[][] out=new double[n][3];
        for(int i=0;i<n;i++){
            int total=s[i][0]+s[i][1]+s[i][2];
            double avg=(double)total/3.0;
            double perc=(double)total/300.0*100.0;
            out[i][0]=Math.round(total*100.0)/100.0;
            out[i][1]=Math.round(avg*100.0)/100.0;
            out[i][2]=Math.round(perc*100.0)/100.0;
        }
        return out;
    }
    public static void display(int[][] s,double[][] r){
        System.out.println("P\tC\tM\tTotal\tAvg\t%");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+(int)r[i][0]+"\t"+String.format("%.2f",r[i][1])+"\t"+String.format("%.2f",r[i][2]));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] scores=genScores(n);
        double[][] res=compute(scores);
        display(scores,res);
    }
}
