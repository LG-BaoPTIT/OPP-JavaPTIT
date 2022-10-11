/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class Test11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<Team> list1 = new ArrayList();
        ArrayList<Thisinh> list2 = new ArrayList();
        for(int i=1;i<=x;i++){
            String a =sc.nextLine();
            String b = sc.nextLine();
            list1.add(new Team(String.valueOf(i), a, b));
        }
        int y = Integer.parseInt(sc.nextLine());
        int g=1;
        
        for(int i=1;i<=y;i++){          
            String c =sc.nextLine();
            String d = sc.nextLine();
            list2.add(new Thisinh(String.valueOf(i),c, d,list1.get(g-1).getTenteam(),list1.get(g-1).getTruong())); 
            if(i%3==0) g++;
        }
        Collections.sort(list2);
        for(Thisinh h :list2){
            System.out.println(h);
        }
        
    }
    
}
