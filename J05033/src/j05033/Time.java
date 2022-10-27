/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05033;

/**
 *
 * @author Asus ROG
 */
public class Time implements Comparable {
    private int gio;
    private int phut;;
    private int giay;

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    public Time(String s) {
        String[] str = s.split(" ");
        this.gio = Integer.valueOf(str[0]);
        this.phut = Integer.valueOf(str[1]);
        this.giay = Integer.valueOf(str[2]);
                
        
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(this.gio-((Time)o).getGio()==0){
            if(this.phut-((Time)o).getPhut()==0){
                return this.giay-((Time)o).getGiay();
            }
            else return this.phut-((Time)o).getPhut();
        }
        else return this.gio-((Time)o).getGio();
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay ;
    }
    
    
}
