/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j06003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J06003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n,t;
       n = sc.nextInt();
       t = sc.nextInt();
       sc.nextLine();
       ArrayList<Students> list = new ArrayList();
       ArrayList<String> Mission = new ArrayList();
       while(n-->0){
           list.add(new Students(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
       }
       while(t-->0){
           Mission.add(sc.nextLine());
       }
       for(Students i : list){
           i.setNhiemvu(Mission.get(i.getNhom()-1));
       }
       Collections.sort(list);
       for(Students x : list){
           System.out.println(x);
       }

    }
    
}
