/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07032;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.math.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author LGB
 */
public class J07032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
       
        int f[] = new int[1000000];
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for (int i = 2; i < 1000; i++)
            if (f[i] == 1)
                for (int j = i * i; j < 1000000; j += i)
                    f[j] = 0;
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject()  ;
        int[] a = new int[1000009];
        for(Integer i : list1){
            
                a[i]+=f[i];
            
        }
        in1.close();;
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));       
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject()  ;
        int[] b = new int[1000009];
        for(Integer i : list2){
                 b[i]+=f[i];
        }
        in2.close();
        
        for(int i=0;i<=1000009;i++){
            if(a[i] != 0 && b[1000000-i] !=0){
                System.out.println(i + " " + (1000000-i));
                a[i] = 0;
                b[1000000-i] =0;
            }
        }
    }
    
   public static boolean check(int n){
        if(n<2) return false;
        for(int i=3;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}
