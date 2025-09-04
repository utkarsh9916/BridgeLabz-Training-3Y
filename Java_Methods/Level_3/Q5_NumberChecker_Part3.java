package Assignment.Methods_Practise.Level3;

/*
Extend or Create a NumberChecker utility class and perform following tasks (part 3).
Method to reverse the digits array
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits.
Method to Check if a number is a duck number using the digits array.
*/
import java.util.*;
public class Q5_NumberChecker_Part3 {
    public static int[] digitsArray(int n){
        String s=String.valueOf(Math.abs(n));
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int[] reverseArray(int[] a){
        int[] r=new int[a.length];
        for(int i=0;i<a.length;i++) r[i]=a[a.length-1-i];
        return r;
    }
    public static boolean arraysEqual(int[] a,int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int n){
        return arraysEqual(digitsArray(n), reverseArray(digitsArray(n)));
    }
    public static boolean isDuck(int n){
        for(int v:digitsArray(n)) if(v==0) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Arrays.toString(reverseArray(digitsArray(n))));
        int m=sc.nextInt();
        System.out.println(arraysEqual(digitsArray(n), digitsArray(m)));
        System.out.println(isPalindrome(n));
        System.out.println(isDuck(n));
    }
}
