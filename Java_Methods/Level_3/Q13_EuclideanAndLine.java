package Assignment.Methods_Practise.Level3;

/*
Write a program for Euclidean distance between two points as well as the equation of the line using those two points. Use Math.pow() and Math.sqrt()
Take inputs for 2 points x1, y1, and x2, y2
Method to find the Euclidean distance between two points and return the distance
Write a Method to find the equation of a line given two points and return the array having slope m and y-intercept b
*/
import java.util.*;
public class Q13_EuclideanAndLine {
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] lineEquation(double x1,double y1,double x2,double y2){
        if(x2==x1) return new double[]{Double.POSITIVE_INFINITY, Double.NaN};
        double m=(y2-y1)/(x2-x1);
        double b=y1 - m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble(), y1=sc.nextDouble();
        double x2=sc.nextDouble(), y2=sc.nextDouble();
        System.out.println(distance(x1,y1,x2,y2));
        double[] eq=lineEquation(x1,y1,x2,y2);
        System.out.println(eq[0]+" "+eq[1]);
    }
}
