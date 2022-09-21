/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
package thuasonguyento;

/**
 *
 * @author LGB
 */
public class THUASONGUYENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++){
            int n = sc.nextInt();
            int a=(int)Math.sqrt(n);
             System.out.print("Test "+j+": ");
            for(int i=2;i <= a;i++){
                int x=0;
                if(n%i==0){
                    while(n%i==0){
                        x++;
                        n/=i;
                    }
                    System.out.print(i+"("+x+") ");
                }
                
            }
            
            System.out.println();
        }
    }
    
}
