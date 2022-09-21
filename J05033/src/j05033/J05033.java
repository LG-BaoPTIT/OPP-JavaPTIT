/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05033;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Time> list =new ArrayList();
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            list.add(new Time(s));
        }
        Collections.sort(list);
        for(Time i : list){
            System.out.println(i);
        }
        
    }
    
}
