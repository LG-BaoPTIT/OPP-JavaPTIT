/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07022;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J07022 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file =new File("DATA.in");
        Scanner sc =new Scanner(file);
        ArrayList<String> list = new ArrayList();
        long sum_ = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
               sum_ = sum_ + Integer.parseInt(s);
            }
            catch(NumberFormatException e){
              list.add(s);
               //System.out.print(s+" ");
            }
        }
        //System.out.println(sum_);
        Collections.sort(list);
        for(String i : list){
            System.out.print(i + " ");
        }
    }
    
    
}
