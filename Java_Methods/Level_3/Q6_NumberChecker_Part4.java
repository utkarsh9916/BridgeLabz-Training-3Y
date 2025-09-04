package Assignment.Methods_Practise.Level3;

/*
Extend or Create a NumberChecker utility class and perform following tasks (part 4).
Method to Check if a number is prime number.
Method to Check if a number is a neon number.
Method to Check if a number is a spy number.
Method to Check if a number is an automorphic number.
Method to Check if a number is a buzz number.
*/
import java.util.*;
public class Q6_NumberChecker_Part4 {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        int sq=n*n; int s=0; while(sq>0){ s+=sq%10; sq/=10; } return s==n;
    }
    public static boolean isSpy(int n){
        int sum=0, prod=1; int t=n;
        while(t>0){ int d=t%10; sum+=d; prod*=d; t/=10; }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n){
        int sq=n*n; String s1=String.valueOf(n); String s2=String.valueOf(sq);
        return s2.endsWith(s1);
    }
    public static boolean isBuzz(int n){ return n%7==0 || Math.abs(n)%10==7; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        System.out.println(isSpy(n));
        System.out.println(isAutomorphic(n));
        System.out.println(isBuzz(n));
    }
}
