/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07055;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("BANGDIEM.in");
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        sc.nextLine();
        
        ArrayList<Hocsinh> list = new ArrayList();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            list.add(new Hocsinh(String.valueOf(i), ten, d1, d2, d3));
        }
        Collections.sort(list);
        for(Hocsinh i : list){
            System.out.println(i);
        }
        
    }
    
}
