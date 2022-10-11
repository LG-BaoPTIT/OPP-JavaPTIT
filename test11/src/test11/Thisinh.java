/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test11;

/**
 *
 * @author LGB
 */
public class Thisinh implements Comparable{
    private String ms;
    private String ten;
    private String mst;
    private String truong;
    private String tenteam;

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getTenteam() {
        return tenteam;
    }

    public void setTenteam(String tenteam) {
        this.tenteam = tenteam;
    }

    public Thisinh(String ms, String ten, String mst,String tenteam,String truong) {
        StringBuilder s= new StringBuilder();
        s.append("C");
        if(ms.length()==1){
            s.append("00");
            s.append(ms);
        }
        else {
            if(ms.length()==2){
                s.append("0");
                s.append(ms);
            }
            else {
                s.append(ms);
            }
        }
        
        this.ms = s.toString();
        this.ten = ten;
        this.mst = mst;
        this.tenteam=tenteam;
        this.truong=truong;
    }

    @Override
    public String toString() {
        return  ms + " " + ten + " " + tenteam + " " + truong ;
    }

    @Override
    public int compareTo(Object o) {
       return this.ten.compareTo(((Thisinh)o).getTen());
    }
    
}
