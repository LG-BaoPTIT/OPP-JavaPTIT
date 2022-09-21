/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J05022 {
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
        int x=sc.nextInt();
        sc.nextLine();
        while(x-->0){
            String str =sc.nextLine();
            StringBuilder a=new StringBuilder("");
            if(str.equals("Ke toan")){
                a.append("DCKT");
            }
            if(str.equals("Cong nghe thong tin")){
                a.append("DCCN");
            }
            if(str.equals("An toan thong tin")){
                a.append("DCAT");
            }
            if(str.equals("Vien thong")){
                a.append("DCVT");
            }
            if(str.equals("Dien tu")){
                a.append("DCDT");
            }
            String e=a.toString();
            System.out.println("DANH SACH SINH VIEN NGANH "+ str.toUpperCase()+":");
            for(Sinhvien i : list){
                String b=i.getMsv().substring(3, 7);
                String c=i.getMsv().substring(0, 1);
                if(b.equals(e) && c.equals("E")==false ){
                    System.out.println(i);
                }
                
            }
        }
        
    }
    
    
}
