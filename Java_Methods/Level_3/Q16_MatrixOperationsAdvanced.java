package Assignment.Methods_Practise.Level3;

/*
Write a program to perform matrix manipulation operations like finding the transpose, determinant, and inverse of a matrix.
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to find the transpose of a matrix
Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix
*/
import java.util.*;
public class Q16_MatrixOperationsAdvanced {
    public static double[][] randomMatrix(int r,int c){
        double[][] m=new double[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=Math.round(Math.random()*10);
        return m;
    }
    public static double[][] transpose(double[][] a){
        int r=a.length,c=a[0].length; double[][] t=new double[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    public static double det2(double[][] m){ return m[0][0]*m[1][1]-m[0][1]*m[1][0]; }
    public static double det3(double[][] m){
        double a=m[0][0], b=m[0][1], c=m[0][2];
        double d=m[1][0], e=m[1][1], f=m[1][2];
        double g=m[2][0], h=m[2][1], i=m[2][2];
        return a*(e*i-f*h)-b*(d*i-f*g)+c*(d*h-e*g);
    }
    public static double[][] inverse2(double[][] m){
        double d=det2(m);
        if(Math.abs(d)<1e-9) return null;
        double[][] inv=new double[2][2];
        inv[0][0]=m[1][1]/d; inv[0][1]=-m[0][1]/d;
        inv[1][0]=-m[1][0]/d; inv[1][1]=m[0][0]/d;
        return inv;
    }
    public static double[][] inverse3(double[][] m){
        double d=det3(m);
        if(Math.abs(d)<1e-9) return null;
        double[][] adj=new double[3][3];
        adj[0][0]= (m[1][1]*m[2][2]-m[1][2]*m[2][1]);
        adj[0][1]=-(m[0][1]*m[2][2]-m[0][2]*m[2][1]);
        adj[0][2]= (m[0][1]*m[1][2]-m[0][2]*m[1][1]);
        adj[1][0]=-(m[1][0]*m[2][2]-m[1][2]*m[2][0]);
        adj[1][1]= (m[0][0]*m[2][2]-m[0][2]*m[2][0]);
        adj[1][2]=-(m[0][0]*m[1][2]-m[0][2]*m[1][0]);
        adj[2][0]= (m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        adj[2][1]=-(m[0][0]*m[2][1]-m[0][1]*m[2][0]);
        adj[2][2]= (m[0][0]*m[1][1]-m[0][1]*m[1][0]);
        double[][] inv=new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) inv[j][i]=adj[i][j]/d;
        return inv;
    }
    public static void print(double[][] m){ for(double[] r:m){ for(double v:r) System.out.print(String.format("%.2f ",v)); System.out.println(); } }
    public static void main(String[] args){
        double[][] a = randomMatrix(3,3);
        print(a); System.out.println("Transpose:"); print(transpose(a));
        System.out.println("Det3: "+det3(a));
        double[][] inv=inverse3(a);
        if(inv!=null){ System.out.println("Inverse:"); print(inv); } else System.out.println("Non-invertible");
        double[][] b = new double[][]{{1,2},{3,4}};
        System.out.println("Det2: "+det2(b));
        double[][] inv2=inverse2(b);
        if(inv2!=null){ System.out.println("Inverse2:"); print(inv2); } else System.out.println("Non-invertible2");
    }
}
