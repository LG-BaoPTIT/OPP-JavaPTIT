/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LGB
 */
class WordSet {
    public Set<String> st = new TreeSet<>();

    public Set<String> getSt() {
        return st;
    }
    
    public WordSet(String a) throws FileNotFoundException{
        File file = new File(a);
        Scanner sc = new Scanner(file);
        
        while(sc.hasNext()){
            String s =sc.next();
            
            this.st.add(s.toLowerCase());             
        }
        
    }

    @Override
    public String toString() {
        for(String i : st){
            System.out.println(i);
        }
        return "";
    }
    
    
    
}
