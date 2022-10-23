/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07072;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class J07072 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("DANHSACH.in");
        Scanner sc = new Scanner(file);
        ArrayList<Persons> list = new ArrayList();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            list.add(new Persons(s));
        }
        Collections.sort(list);
        for(Persons i : list){
            System.out.println(i);
        }
    }
    
}
