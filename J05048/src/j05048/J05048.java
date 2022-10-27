/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05048;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus ROG
 */
public class J05048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Mathang> list = new ArrayList();
        while(t-->0){
            String a = sc.nextLine();
            int b = Integer.parseInt(sc.nextLine());
            list.add(new Mathang(a,b));
        }
        String x = sc.nextLine();
        Collections.sort(list);
        for(Mathang i : list){
            if(i.getLoai().equals(x)){
                System.out.println(i);
            }
            
        }
    }
    
}
