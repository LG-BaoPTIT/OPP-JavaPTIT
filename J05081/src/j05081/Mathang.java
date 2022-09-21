/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05081;

/**
 *
 * @author LGB
 */
public class Mathang implements Comparable<Mathang> {
    private String ms;
    private String ten;
    private String dvt;
    private int gianhap;
    private int giaban;
    private int lai;
    
    public String getMs() {
        return ms;
    }
    public Mathang(String ms,String ten,String dvt,int a,int b){
        StringBuilder s =new StringBuilder();
        s.append("MH");
        if(ms.length()==1){
            s.append("00");
            s.append(ms);
        }
        if(ms.length()==2){
            s.append("0");
            s.append(ms);
        }
        if(ms.length()==3){
            s.append(ms);
        }
        
        this.ms = s.toString();
        this.ten=ten;
        this.dvt=dvt;
        this.gianhap=a;
        this.giaban=b;
        this.lai=(giaban-gianhap);
    }
   
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public long getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public long getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getLai() {
        return lai;
    }

    @Override
    public String toString() {
        return this.ms +" "+ this.ten +" "+this.dvt+" "+ this.gianhap+" "+this.giaban+" "+ this.lai; 
    }

    @Override
    public int compareTo(Mathang o) {
       int x=o.getLai();
        return x-this.lai;
    }
    
}
