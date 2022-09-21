/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05030;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        ArrayList<Sinhvien> list =new ArrayList();
        int t = sc.nextInt();
        sc.nextLine();
        while( t-->0 ){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String d1 = sc.nextLine();
            String d2 = sc.nextLine();
            String d3 = sc.nextLine();
            list.add(new Sinhvien(msv,ten,lop,Double.valueOf(d1),Double.valueOf(d2),Double.valueOf(d3)));         
        }
        Collections.sort(list);
        int x=1;
        for(Sinhvien i : list){
            System.out.print(x+ " ");
            System.out.println(i);
            x=x+1;
        }
    }
    
}
