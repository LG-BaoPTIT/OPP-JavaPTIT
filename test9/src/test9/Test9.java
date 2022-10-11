/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class Test9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       File file1 = new File("SINHVIEN.in");
       Scanner sc = new Scanner(file1);
       
       int t = Integer.parseInt(sc.nextLine());
       ArrayList<Sinhvien> list1 = new ArrayList();
       ArrayList<Detai> list2 = new ArrayList();
       ArrayList<Nhiemvu> list3 = new ArrayList();
       for(int i=1;i<=t;i++){
           String a = sc.nextLine();
           String b = sc.nextLine();
           String c = sc.nextLine();
           String d = sc.nextLine();
           list1.add(new Sinhvien(a, b, c, d));
       }
       //sc.close();
       
       File file2 = new File("DETAI.in");
       Scanner sc2 = new Scanner(file2);
       t = Integer.parseInt(sc2.nextLine());
       for(int i=1;i<=t;i++){
           String gv = sc2.nextLine();
           String dt = sc2.nextLine();
           list2.add(new Detai(gv, dt, String.valueOf(i)));
       }
       //sc2.close();
       
       File file3 = new File("NHIEMVU.in");
       Scanner sc3 = new Scanner(file3);
       t = Integer.parseInt(sc3.nextLine());
       for(int i=1;i<=t;i++){
           String msv = sc3.next();
           String msdt = sc3.next();
           list3.add(new Nhiemvu(msv, msdt));         
       }
      // sc3.close();
       
       for(Nhiemvu i : list3){
           for(Sinhvien j : list1){
               if(i.getMsv().equals(j.getMsv())){
                   j.setMadetai(i.getMadetai());
                   break;
               }
           }
       }
       for(Detai g : list2){
           for(Sinhvien h:list1){
               if(g.getMadetai().equals(h.getMadetai())){
                   h.setDetai(g.getTendetai());
                   h.setGv(g.getGv());
               }
           }
       }
       Collections.sort(list1);
       for(Sinhvien o : list1){
           System.out.println(o);
       }
    }
    
}
