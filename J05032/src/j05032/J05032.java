/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05032;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        int g=t;
        sc.nextLine();
        ArrayList<Nguoi> list =new ArrayList();
        while(t-->0){
            String ten=sc.next();
            String ns=sc.next();
            String[] a=ns.split("/");
            list.add(new Nguoi(ten,a[0],a[1],a[2]));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(g-1));
    }
    
}
