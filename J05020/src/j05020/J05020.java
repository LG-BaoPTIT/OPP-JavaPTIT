/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05020;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> list = new ArrayList();
        while(t-->0){
            String msv=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String gmail=sc.nextLine();
            list.add(new Sinhvien(msv,ten,lop,gmail));
        }
        Collections.sort(list);
        for(Sinhvien i : list){
            System.out.println(i);
        }
    }
    
}
