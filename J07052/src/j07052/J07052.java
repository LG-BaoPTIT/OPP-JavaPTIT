/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("THISINH.in");
        Scanner sc = new Scanner(file);
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<Thisinh> list = new ArrayList();
        while(t-->0){
            String ms = sc.nextLine();
            String ten = sc.nextLine();
            double d1= Double.parseDouble(sc.nextLine());
            double d2= Double.parseDouble(sc.nextLine());
            double d3= Double.parseDouble(sc.nextLine());
            list.add(new Thisinh(ms, ten, d1, d2, d3));
        }
        int x = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        double dtt = list.get(x-1).getTongdiem();
        
        for(Thisinh i : list){
            if(i.getTongdiem() >= dtt){
                i.setKq("TRUNG TUYEN");
            }
            else i.setKq("TRUOT");
        }
        System.out.printf("%.1f\n",dtt);
        for(Thisinh i : list){
            System.out.println(i);
        }
    
    }
}