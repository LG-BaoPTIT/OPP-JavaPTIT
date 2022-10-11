/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.pkg7;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LGB
 */
public class WordSet {
    private String s;

    public String getS() {
        return s;
    }

    public WordSet(String s) {
        this.s = s.toLowerCase();
    }
    public String union(WordSet s2){
        String[] x = this.s.split(" ");
        String[] y = s2.getS().split(" ");
        Set<String> setA = new TreeSet<>();
        for(String i : x){
            setA.add(i);
        }
        for(String i : y){
            setA.add(i);
        }
        for(String i : setA){
            System.out.print(i+" ");
        }
        return "";
    }
    public String intersection(WordSet s2){
        String[] y = s2.getS().split(" ");
        Set<String> setA = new TreeSet<>();
        for(String i : y){
            if(this.s.contains(i)) setA.add(i);
        }
        for(String i : setA){
            System.out.print(i+" ");
        }
        
        return "";
    }
}
