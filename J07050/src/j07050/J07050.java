/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MATHANG.in");
        Scanner sc = new Scanner(file);
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<Mathang> list = new ArrayList();
        for(int i=1;i<=t;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            double c = Double.parseDouble(sc.nextLine());
            double d = Double.parseDouble(sc.nextLine());
            list.add(new Mathang(String.valueOf(i),a, b, c, d));
        }
        Collections.sort(list);
        
        for(Mathang i : list){
            System.out.println(i);
        }
    }
    
}
