package Assignment.Methods_Practise.Level3;

/*
Extend or Create a NumberChecker utility class and perform following tasks (part 2).
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array.
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/
import java.util.*;
public class Q4_NumberChecker_Part2 {
    public static int[] digitsArray(int n){ String s=String.valueOf(Math.abs(n)); int[] d=new int[s.length()]; for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0'; return d; }
    public static int sumDigits(int n){ int s=0; for(int v:digitsArray(n)) s+=v; return s; }
    public static int sumSquares(int n){ int s=0; for(int v:digitsArray(n)) s+=Math.pow(v,2); return s; }
    public static boolean isHarshad(int n){ int s=sumDigits(n); if(s==0) return false; return n % s == 0; }
    public static int[][] digitFrequency(int n){
        int[] freq=new int[10];
        for(int v:digitsArray(n)) freq[v]++;
        int[][] res=new int[10][2];
        for(int i=0;i<10;i++){ res[i][0]=i; res[i][1]=freq[i]; }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumDigits(n));
        System.out.println(sumSquares(n));
        System.out.println(isHarshad(n));
        int[][] f=digitFrequency(n);
        for(int i=0;i<10;i++) System.out.println(f[i][0]+" "+f[i][1]);
    }
}
