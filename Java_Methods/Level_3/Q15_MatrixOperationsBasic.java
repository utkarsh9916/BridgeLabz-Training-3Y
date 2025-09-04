package Assignment.Methods_Practise.Level3;

/*
Write a program to perform matrix manipulation operations like addition, subtraction, and multiplication. The program should take random matrices as input and display the result of the operations.
Write a Method to create a random matrix, taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices
*/
import java.util.*;
public class Q15_MatrixOperationsBasic {
    public static int[][] randomMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    public static int[][] add(int[][] a,int[][] b){
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    public static int[][] subtract(int[][] a,int[][] b){
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int r=a.length, c=b[0].length, mid=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++){
            int s=0; for(int k=0;k<mid;k++) s+=a[i][k]*b[k][j];
            res[i][j]=s;
        }
        return res;
    }
    public static void print(int[][] m){ for(int[] row:m){ for(int v:row) System.out.print(v+" "); System.out.println(); } }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(), c=sc.nextInt();
        int[][] a=randomMatrix(r,c);
        int[][] b=randomMatrix(r,c);
        print(a); System.out.println();
        print(b); System.out.println();
        print(add(a,b)); System.out.println();
        print(subtract(a,b)); System.out.println();
        if(c==r) { print(multiply(a,b)); }
    }
}
