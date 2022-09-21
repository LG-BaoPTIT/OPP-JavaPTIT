/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05009;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable {
    private String ms;
    private String ten;
    private String ngaysinh;
    private double d1;
    private double d2;
    private double d3;
    private double tong;
    public Sinhvien(String ms,String ten,String ngaysinh,double d1,double d2,double d3){
        this.ms=ms;
        this.ten=ten;
        this.ngaysinh=ngaysinh;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.tong=d1+d2+d3;        
        
    }

    public String getMs() {
        return ms;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    public double getD3() {
        return d3;
    }

    public double getTong() {
        return tong;
    }
    
    public Sinhvien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Object o) {
        String x=String.valueOf(((Sinhvien)o).tong);
        return x.compareTo(String.valueOf(this.tong));
    }

    @Override
    public String toString() {
        
        return ms + " " + ten + " " + ngaysinh +" "+ tong;
    }
    
    
    
}
