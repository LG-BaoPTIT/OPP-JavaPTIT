/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07054 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("BANGDIEM.in");
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double c = Double.parseDouble(sc.nextLine());
            list.add(new Sinhvien(ten, String.valueOf(i), a, b, c));
        }
        Collections.sort(list);
        int count_=1;
        list.get(0).setXh(count_);
        System.out.println(list.get(0));
        for(int i=1;i<list.size();i++){
            if(list.get(i).getTb()==list.get(i-1).getTb()){
                list.get(i).setXh(list.get(i-1).getXh());
                System.out.println(list.get(i));
                count_++;
            }
            else{
                count_++;
                list.get(i).setXh(count_);
                System.out.println(list.get(i));
            }
        }
    }
    
}
