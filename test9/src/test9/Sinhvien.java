/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test9;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable {
    private String msv;
    private String ten;
    private String sdt;
    private String email;
    private String gv;
    private String detai;
    private String madetai;

    public String getMadetai() {
        return madetai;
    }

    public void setMadetai(String madetai) {
        this.madetai = madetai;
    }
    
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public String getDetai() {
        return detai;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }

    public Sinhvien(String msv, String ten, String sdt, String email) {
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public int compareTo(Object o) {
        return this.detai.compareTo(((Sinhvien)o).getDetai());
    }

    @Override
    public String toString() {
        return  msv + " " + ten + " " + sdt + " " + email + " " + gv + " " + detai;
    }
    
    
}
