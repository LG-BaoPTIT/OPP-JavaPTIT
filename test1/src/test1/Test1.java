/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
import java.math.BigInteger;
public class Test1 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner in = new Scanner(file);
        long ans =0;
        while(in.hasNext()){
            String s = in.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception e){
                try{
                    ans += Long.parseLong(s);
                }
                catch(Exception ex){
                    
                }
            }
        }
        System.out.println(ans);
    }
}