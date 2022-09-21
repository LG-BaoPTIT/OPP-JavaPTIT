/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author LGB
 */
public class J07004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        HashMap<Integer,Integer> map = new HashMap<>();
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else map.put(x, 1);
        }
        Set<Integer> st = map.keySet();
        for(Integer i : st ){
            System.out.println(i +" "+map.get(i));
        }
        sc.close();
    }
    
}
