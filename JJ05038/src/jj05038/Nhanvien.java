/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jj05038;

/**
 *
 * @author LGB
 */
public class Nhanvien implements Comparable{
    private String ms;
    private String ten;
    private long luongngay;
    private int ngaycong;
    private String cvu;
    private long luongthang;
    private long thuong;
    private long phucap;
    private long tong;
    
    public Nhanvien (String ms, String ten, long luongngay, int ngaycong, String cvu) {
        StringBuilder s = new StringBuilder();
        s.append("NV");
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else s.append(ms);
        this.ms = s.toString();
        this.ten = ten;
        this.luongngay = luongngay;
        this.ngaycong = ngaycong;
        this.cvu = cvu;
        this.luongthang = this.luongngay * this.ngaycong;
        
        if(this.ngaycong>=25) this.thuong=(long)(this.luongthang*0.2);
        if(this.ngaycong>=22 && this.ngaycong<25) this.thuong=(long)(this.luongthang*0.1);
        
        if(this.cvu.equals("GD")) this.phucap=250000;
        if(this.cvu.equals("PGD")) this.phucap=200000;
        if(this.cvu.equals("TP")) this.phucap=180000;
        if(this.cvu.equals("NV")) this.phucap=150000;
        
        this.tong = this.luongthang + this.thuong + this.phucap;
    }

    @Override
    public String toString() {
        return ms + " " + ten + " " + luongthang + " " + thuong + " " + phucap + " " + tong ;
    }

    public long getTong() {
        return tong;
    }

    @Override
    public int compareTo(Object o) {
       if(this.tong < ((Nhanvien)o).tong) return 1;
       if(this.tong > ((Nhanvien)o).tong) return -1;
       else return 0;
    }
    
}
