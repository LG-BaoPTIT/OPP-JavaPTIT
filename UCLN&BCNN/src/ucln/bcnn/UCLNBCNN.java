/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucln.bcnn;
import java.util.*;
/**
 *
 * @author LGB
 */
public class UCLNBCNN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long a=sc.nextInt();
            long b= sc.nextInt();
            System.out.print((long)(a*b)/UCLN(a,b)+" ");
            System.out.println(UCLN(a,b));
            t--;
        }
    }
    public static long UCLN(long a,long b){
        while ( a != b)
    {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a; 
    }
    
}
