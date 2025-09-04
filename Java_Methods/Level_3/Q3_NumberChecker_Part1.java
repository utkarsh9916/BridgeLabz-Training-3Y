package Assignment.Methods_Practise.Level3;

/*
Extend or Create a NumberChecker utility class and perform following tasks (part 1).
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is an armstrong number using the digits array.
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/
import java.util.*;
public class Q3_NumberChecker_Part1 {
    public static int countDigits(int n){ return String.valueOf(Math.abs(n)).length(); }
    public static int[] digitsArray(int n){
        String s=String.valueOf(Math.abs(n));
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static boolean isDuck(int n){
        int[] d=digitsArray(n);
        for(int v:d) if(v==0) return true;
        return false;
    }
    public static boolean isArmstrong(int n){
        int[] d=digitsArray(n); int p=d.length; int sum=0;
        for(int v:d) sum+=Math.pow(v,p);
        return sum==n;
    }
    public static int[] largestAndSecond(int n){
        int[] d=digitsArray(n);
        int largest=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int v:d){
            if(v>largest){ second=largest; largest=v; }
            else if(v>second && v<largest) second=v;
        }
        return new int[]{largest, second};
    }
    public static int[] smallestAndSecond(int n){
        int[] d=digitsArray(n);
        int smallest=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        for(int v:d){
            if(v<smallest){ second=smallest; smallest=v; }
            else if(v<second && v>smallest) second=v;
        }
        if(second==Integer.MAX_VALUE) second = smallest;
        return new int[]{smallest, second};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countDigits(n));
        System.out.println(Arrays.toString(digitsArray(n)));
        System.out.println(isDuck(n));
        System.out.println(isArmstrong(n));
        System.out.println(Arrays.toString(largestAndSecond(n)));
        System.out.println(Arrays.toString(smallestAndSecond(n)));
    }
}
