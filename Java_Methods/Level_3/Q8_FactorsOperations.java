package Assignment.Methods_Practise.Level3;

/*
Write a program to find the factors of a number and perform various tasks using the factors array
Method to find factors of a number and return them as an array.
Method to find the greatest factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find the product of the cube of the factors using the factors array. Use Math.pow()
*/
import java.util.*;
public class Q8_FactorsOperations {
    public static int[] factors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i) list.add(n/i);
            }
        }
        Collections.sort(list);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }
    public static int greatest(int[] a){ return a.length==0?0:a[a.length-1]; }
    public static long sum(int[] a){ long s=0; for(int v:a) s+=v; return s; }
    public static long product(int[] a){ long p=1; for(int v:a) p*=v; return p; }
    public static double productOfCubes(int[] a){ double p=1; for(int v:a) p*=Math.pow(v,3); return p; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=factors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(greatest(f));
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(productOfCubes(f));
    }
}
