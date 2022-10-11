/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("MONHOC.in");
        Scanner sc  =new Scanner(file);
        ArrayList<Monhoc> list =new ArrayList();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a=sc.nextLine();
            String b = sc.nextLine();
            String c= sc.nextLine();
            list.add(new Monhoc(a, b,Integer.valueOf(c)));
        }
        Collections.sort(list);
        for(Monhoc i : list){
            System.out.println(i);
        }
    }
    
}
