/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file =new File("DATA.in");
        Scanner sc =new Scanner(file);
        long sum_ = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
               sum_ = sum_ + Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                continue;
            }
        }
        System.out.println(sum_);
    }
    
}
