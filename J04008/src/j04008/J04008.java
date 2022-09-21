/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04008;
import java.util.*;
import java.math.*;
/**
 *
 * @author LGB
 */
public class J04008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Point A=new Point();
            Point B=new Point();
            Point C=new Point();
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            A.Point(a, b);
            a=sc.nextDouble();
            b=sc.nextDouble();
            B.Point(a, b);
            a=sc.nextDouble();
            b=sc.nextDouble();
            C.Point(a, b);
            if( A.distance(B)< A.distance(C) + B.distance(C) && A.distance(C) < A.distance(B) + B.distance(C) && B.distance(C)< A.distance(C) + A.distance(B)  ){
                double x=(A.distance(B)*A.distance(C)*B.distance(C))/Math.sqrt( (A.distance(B)+A.distance(C)+C.distance(B))* (A.distance(B)+A.distance(C)-C.distance(B))*(A.distance(B)-A.distance(C)+C.distance(B))*(-A.distance(B)+A.distance(C)+C.distance(B)));
                System.out.printf("%.3f\n",Math.PI*x*x);   
            }
            else{
                
                System.out.println("INVALID");
            }
        }
        
    }
    
    public static class Point {
        
        public double x;
        public double y;
    
        public void Point(double x,double y){
            this.x=x;
            this.y=y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
        public double distance(Point b){
            return Math.sqrt((this.x-b.x)*(this.x-b.x) + (this.y-b.y)*(this.y-b.y) );
        }
    
    }
}
