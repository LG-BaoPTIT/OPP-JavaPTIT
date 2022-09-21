/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05025;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc =new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       ArrayList<Giangvien> list =new ArrayList();
       for(int i=1;i<=t;i++){
           String ten=sc.nextLine();
           String khoa=sc.nextLine();
           list.add(new Giangvien(String.valueOf(i),ten,khoa));        
       }
       int x=sc.nextInt();
       sc.nextLine();
       while(x-->0){
            String s=sc.nextLine();
           
           System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
           for(Giangvien i : list){
               if(i.getHoten().toLowerCase().contains(s.toLowerCase())){
                   System.out.println(i);
               }
                           
           }
       }
       
    }
    
}
