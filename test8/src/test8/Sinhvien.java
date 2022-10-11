/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test8;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable {
    private String ten;
    private int ac;
    private int tong;

    public String getTen() {
        return ten;
    }

    public int getAc() {
        return ac;
    }

    public int getTong() {
        return tong;
    }

    public Sinhvien(String ten, int ac, int tong) {
        this.ten = ten;
        this.ac = ac;
        this.tong = tong;
    }

    @Override
    public String toString() {
        return ten + " " + ac + " " + tong ;
    }

    @Override
    public int compareTo(Object o) {
        if(this.ac>((Sinhvien)o).ac){
            return -1;
        }
        else{
            if(this.ac<((Sinhvien)o).ac){
                return 1;
            }
            else {
                if(this.tong>((Sinhvien)o).tong){
                    return 1;
                }
                else {
                    if(this.tong<((Sinhvien)o).tong){
                        return -1;
                    }
                    else {
                        return this.ten.compareTo(((Sinhvien)o).ten);
                    }
                }
                
            }
        }
    }
    
}
