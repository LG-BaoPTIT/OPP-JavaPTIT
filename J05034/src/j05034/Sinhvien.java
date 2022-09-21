/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05034;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable{
    private String ms;
    private String msv;
    private String ten;
    private String lop;
    private String gmail;
    private String doanhnghiep;
    public Sinhvien(String ms,String msv,String ten,String lop,String gmail, String doanhnghiep){
        this.ms=ms;
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.gmail=gmail;
        this.doanhnghiep=doanhnghiep;
        
        
    }

    public String getMs() {
        return ms;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getGmail() {
        return gmail;
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }
    
    @Override
    public int compareTo(Object o) {
        return this.msv.compareTo(((Sinhvien)o).getMsv());
    }

    @Override
    public String toString() {
        return  ms + " " + msv + " " + ten + " " + lop + " " + gmail + " " + doanhnghiep ;
    }
    
}
