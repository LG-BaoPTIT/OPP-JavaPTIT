/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("DANHSACH.in");
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Persons> list = new ArrayList();
        while(t-->0){
            String ten = sc.nextLine();
            list.add(new Persons(ten));
        }
        Collections.sort(list);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String str = sc.nextLine();
            StringBuilder s = new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!= '.'){
                    s.append(str.charAt(i));
                }
            }
            String hehe = s.toString();
            for(Persons x : list){
                int g=0;
                for(int i=0;i<hehe.length();i++){
                    if(hehe.charAt(i) == x.getViettat().charAt(i)){
                        g++;
                    }
                }
                if(g==x.getViettat().length()-1){
                    System.out.println(x);
                }
             
            }
            
        }
    }
    
}
