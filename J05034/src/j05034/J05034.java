/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05034;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> list =new ArrayList();
        for(int i=1;i<=t;i++){
           
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String gmail = sc.nextLine();
            String doanhnghiep = sc.nextLine();
            list.add(new Sinhvien(String.valueOf(i), msv, ten, lop, gmail, doanhnghiep));
        }
        Collections.sort(list);
        int x = sc.nextInt();
        sc.nextLine();
        while(x-->0){
            String s = sc.nextLine();
            for(Sinhvien i : list){
                if(s.equals(i.getDoanhnghiep())){
                    System.out.println(i);
                }
            }
        }
    }
    
}
