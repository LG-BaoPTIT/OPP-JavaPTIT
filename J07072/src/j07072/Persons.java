/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07072;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class Persons implements Comparable{
    private String hten;
    private String ten;
    private String ho;
    private String tendem;
    public String getTen() {
        return ten;
    }

    public String getHo() {
        return ho;
    }

    public String getTendem() {
        return tendem;
    }
    
    public Persons(String hten) {
        StringTokenizer tk = new StringTokenizer(hten);
        StringBuilder x = new StringBuilder();
        while(tk.hasMoreTokens()){
            String token = tk.nextToken().toLowerCase();
            x.append(String.valueOf(token.charAt(0)).toUpperCase());
            for(int i=1;i<token.length();i++){
                x.append(String.valueOf(token.charAt(i)));
            }
            
            x.append(" ");
        }
        this.hten = x.toString().trim();
        
        String[] token =this.hten.split(" ");
        this.ten = token[token.length-1];  
        this.ho = token[0];
        
        StringBuilder str = new StringBuilder();
        for(int i=1;i<token.length-1;i++){
            str.append(token[i]);
        }
        this.tendem = str.toString();
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(this.ten.compareTo(((Persons)o).getTen())==0){
            if(this.ho.compareTo(((Persons)o).getHo())==0){
                return this.tendem.compareTo(((Persons)o).getTendem());
            }
            else{
                return this.ho.compareTo(((Persons)o).getHo());
            }
        }
        else {
            return this.ten.compareTo(((Persons)o).getTen());
        }
    }

    @Override
    public String toString() {
        return  hten ;
    }
    
}
