/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07034;

/**
 *
 * @author LGB
 */
public class Monhoc implements Comparable{
    private String ms;
    private String ten;
    private int sotin;

    public String getTen() {
        return ten;
    }
    
    
    public Monhoc(String ms, String ten, int sotin) {
        this.ms = ms;
        this.ten = ten;
        this.sotin = sotin;
    }

    @Override
    public String toString() {
        return  ms + " " + ten + " " + sotin;
    }

    @Override
    public int compareTo(Object o) {
        return this.ten.compareTo(((Monhoc)o).getTen());
    }
    
}
