/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class J07051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("KHACHHANG.in");
        Scanner sc =new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khachhang> list = new ArrayList();
        for(int i=1;i<=t;i++){
            String s = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            
            String a = s.toLowerCase();
            StringTokenizer tk= new StringTokenizer(a);
            StringBuilder kq = new StringBuilder();
            while(tk.hasMoreTokens()){
                String x=tk.nextToken();
                kq.append(Character.toUpperCase(x.charAt(0)));
                for(int k=1;k<x.length();k++){
                    kq.append(x.charAt(k));
                }
                kq.append(" ");
            }
            String y=kq.toString().trim();
            
            list.add(new Khachhang(String.valueOf(i), y, b, c, d,Long.valueOf(e)));
        }
        Collections.sort(list);
        for(Khachhang i : list){
            System.out.println(i);
        }
    }
    
}
