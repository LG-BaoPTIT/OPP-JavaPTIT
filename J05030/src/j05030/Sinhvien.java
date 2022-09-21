/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05030;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable{
    private String msv;
    private String ten;
    private String lop;
    private double d1;
    private double d2;
    private double d3;
    
    public Sinhvien(String msv,String ten,String lop,double d1,double d2,double d3){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }

    @Override
    public int compareTo(Object o) {
        return this.ten.compareTo(((Sinhvien)o).ten);
    }

    @Override
    public String toString() {
        System.out.print(this.msv+" "+this.ten+" "+ this.lop+" ");
        System.out.printf("%.1f %.1f %.1f",this.d1,this.d2,this.d3);
        return "";
    }
    
}
