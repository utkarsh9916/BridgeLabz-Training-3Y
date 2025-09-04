package Assignment.Methods_Practise.Level3;

/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Write a method to generate a 6-digit OTP number using Math.random()
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/
import java.util.*;
public class Q9_OTPGenerator {
    public static int generateOTP(){ return (int)(Math.random()*900000)+100000; }
    public static boolean allUnique(int[] arr){
        HashSet<Integer> s=new HashSet<>();
        for(int v:arr) s.add(v);
        return s.size()==arr.length;
    }
    public static void main(String[] args){
        int[] otps=new int[10];
        for(int i=0;i<10;i++) otps[i]=generateOTP();
        for(int v:otps) System.out.println(v);
        System.out.println(allUnique(otps));
    }
}
