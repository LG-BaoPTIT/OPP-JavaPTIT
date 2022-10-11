/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class Test8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("LUYENTAP.in");
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList();
        while(t-->0){
            String ten =sc.nextLine();
            String s = sc.nextLine();
            String[] str = s.split(" ");
            
            list.add(new Sinhvien(ten, Integer.valueOf(str[0]), Integer.valueOf(str[1])));
        }
       Collections.sort(list);
        for(Sinhvien i : list){
            System.out.println(i);
        }
    }
    
}
