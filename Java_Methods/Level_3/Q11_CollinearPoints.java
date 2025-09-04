package Assignment.Methods_Practise.Level3;

/*
Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae.
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Method to find using slope formula and using area formula
*/
import java.util.*;
public class Q11_CollinearPoints {
    public static boolean collinearBySlope(double x1,double y1,double x2,double y2,double x3,double y3){
        double ab = (x2-x1)==0? Double.POSITIVE_INFINITY : (y2-y1)/(x2-x1);
        double bc = (x3-x2)==0? Double.POSITIVE_INFINITY : (y3-y2)/(x3-x2);
        double ac = (x3-x1)==0? Double.POSITIVE_INFINITY : (y3-y1)/(x3-x1);
        return Math.abs(ab-bc)<1e-9 && Math.abs(bc-ac)<1e-9;
    }
    public static boolean collinearByArea(double x1,double y1,double x2,double y2,double x3,double y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return Math.abs(area)<1e-9;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble(), y1=sc.nextDouble();
        double x2=sc.nextDouble(), y2=sc.nextDouble();
        double x3=sc.nextDouble(), y3=sc.nextDouble();
        System.out.println(collinearBySlope(x1,y1,x2,y2,x3,y3));
        System.out.println(collinearByArea(x1,y1,x2,y2,x3,y3));
    }
}
