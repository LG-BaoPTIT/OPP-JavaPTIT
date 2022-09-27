/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class J07021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
       
        while(sc.hasNextLine()){
            
            String s=sc.nextLine();
            if(s.equals("END")) break;
            String a = s.toLowerCase();
            StringTokenizer tk= new StringTokenizer(a);
            StringBuilder kq = new StringBuilder();
            while(tk.hasMoreTokens()){
                String x=tk.nextToken();
                kq.append(Character.toUpperCase(x.charAt(0)));
                for(int i=1;i<x.length();i++){
                    kq.append(x.charAt(i));
                }
                kq.append(" ");
            }
            String y=kq.toString().trim();
            System.out.println(y);
            
        }
    }
    
}
