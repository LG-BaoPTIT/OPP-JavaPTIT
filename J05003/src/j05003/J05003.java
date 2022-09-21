/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05003;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
        File file = new File("SV.in");
        Scanner sc =new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        
        ArrayList<Sinhvien> list =new ArrayList();
        for(int i=0;i<t;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            String d=sc.nextLine();
            double x=Double.parseDouble(d);
            list.add(new Sinhvien(String.valueOf(i+1),a,b,c,x));
            
        }
        
        for(Sinhvien i : list){
            System.out.println(i);
            
        }
    }
    
}
