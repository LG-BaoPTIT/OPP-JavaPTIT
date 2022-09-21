/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05042;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable{
    private String ten;
    private int c;
    private long t;

    public Sinhvien(String ten, int c, long t) {
        this.ten = ten;
        this.c = c;
        this.t = t;
    }

    @Override
    public String toString() {
        return  ten + " " + c + " " + t ;
    }
    
    @Override
    public int compareTo(Object o) {
       if(this.c > ((Sinhvien)o).c) return -1;
       else {
           if(this.c < ((Sinhvien)o).c) return 1;
           else {
                if(this.t < ((Sinhvien)o).t) return -1;
                if(this.t > ((Sinhvien)o).t) return 1;
                return 0;
           }
       }
    }
    
}
