package Assignment.Methods_Practise.Level3;

/*
Extend or Create a NumberChecker utility class and perform following tasks (part 5).
Method to Check if a number is a perfect number.
Method to find the number is an abundant number.
Method to find the number is a deficient number.
Method to Check if a number is a strong number.
*/
import java.util.*;
public class Q7_NumberChecker_Part5 {
    public static int sumProperDivisors(int n){
        if(n<=1) return 0;
        int s=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                s+=i;
                if(i!=n/i) s+=n/i;
            }
        }
        return s;
    }
    public static boolean isPerfect(int n){ return n>0 && sumProperDivisors(n)==n; }
    public static boolean isAbundant(int n){ return sumProperDivisors(n)>n; }
    public static boolean isDeficient(int n){ return sumProperDivisors(n)<n; }
    public static int factorial(int n){ if(n<=1) return 1; int f=1; for(int i=2;i<=n;i++) f*=i; return f; }
    public static boolean isStrong(int n){
        int t=n, s=0;
        while(t>0){ s+=factorial(t%10); t/=10; }
        return s==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPerfect(n));
        System.out.println(isAbundant(n));
        System.out.println(isDeficient(n));
        System.out.println(isStrong(n));
    }
}
