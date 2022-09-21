/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05081;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<Mathang> list = new ArrayList<Mathang>();
        
        for(int i=0;i<t;i++){
            String a=sc.nextLine();
          
            String b=sc.nextLine();
            
            String c=sc.nextLine();
            String d=sc.nextLine();
            
            int x=i+1;
            list.add(new Mathang(String.valueOf(x),a,b,Integer.valueOf(c),Integer.valueOf(d)));
            
        }
        Collections.sort(list);
        for(Mathang i :  list){
            System.out.println(i);
        }
    }
    
}
