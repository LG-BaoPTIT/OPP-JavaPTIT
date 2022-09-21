/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05020;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable {
    private String msv;
    private String ten;
    private String lop;
    private String gmail;

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
    public Sinhvien(String msv,String ten,String lop,String gmail){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.gmail=gmail;
        
    }

    @Override
    public int compareTo(Object o) {
        int rs=this.lop.compareTo(((Sinhvien)o).lop);
        if(rs==0){
            return this.msv.compareTo(((Sinhvien)o).msv);
        }
        else return rs;
        
    }

    @Override
    public String toString() {
        return  msv + " " + ten + " " + lop + " " + gmail ;
    }
    
}
