package Assignment.Methods_Practise.Level3;

/*
Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Use Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus and return the new 2D Array
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/
import java.util.*;
public class Q12_EmployeeBonusZara {
    public static double[][] generateEmployees(int n){
        double[][] arr=new double[n][2];
        for(int i=0;i<n;i++){
            int salary=(int)((Math.random()*90000)+10000);
            int years=(int)(Math.random()*20);
            arr[i][0]=salary; arr[i][1]=years;
        }
        return arr;
    }
    public static double[][] computeNew(double[][] arr){
        double[][] res=new double[arr.length][3];
        for(int i=0;i<arr.length;i++){
            double old=arr[i][0]; double years=arr[i][1];
            double rate = years>5?0.05:0.02;
            double bonus=old*rate;
            double neu=old+bonus;
            res[i][0]=old; res[i][1]=bonus; res[i][2]=neu;
        }
        return res;
    }
    public static void summary(double[][] oldNew){
        double sumOld=0,sumNew=0,sumBonus=0;
        for(int i=0;i<oldNew.length;i++){
            sumOld+=oldNew[i][0];
            sumBonus+=oldNew[i][1];
            sumNew+=oldNew[i][2];
        }
        System.out.println("SumOld\tSumBonus\tSumNew");
        System.out.println((long)sumOld+"\t"+(long)sumBonus+"\t"+(long)sumNew);
    }
    public static void main(String[] args){
        double[][] emp=generateEmployees(10);
        double[][] res=computeNew(emp);
        for(int i=0;i<res.length;i++) System.out.println((long)res[i][0]+" "+(long)res[i][1]+" "+(long)res[i][2]);
        summary(res);
    }
}
