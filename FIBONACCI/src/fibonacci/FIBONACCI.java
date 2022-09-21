/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author LGB
 */
public class FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long arr[]= new long[99];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
   
      
            for(int i=3;i<=97;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
          
        while(t>0){
            long n = sc.nextInt();
            if(check(n,arr))System.out.println("YES");
            else {
                System.out.println("NO");
            }
            
            t--;
        }
    }
    public static boolean check(long n,long arr[]){
        for(int i=0;i<=97;i++){
            if(arr[i]==n) return true;
        }
        return false;
    }
    
        
}
    

