/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05050;

/**
 *
 * @author Asus ROG
 */
public class Khachhang implements Comparable{
    private String ms;
    private int heso;
    private long thanhtien;
    private long phutroi;
    private long tong;
    private long sodien;

    public long getTong() {
        return tong;
    }
    
    public Khachhang(String ms, String heso,long a, long b){
        StringBuilder x = new StringBuilder();
        x.append("KH");
        if(ms.length() ==1){
            x.append("0");
            x.append(ms);
        }
        else{
            x.append(ms);
        }
        this.ms = x.toString();
        if(heso.equals("KD")){
            this.heso =3;
        }
        if(heso.equals("NN")){
            this.heso =5;
        }
        if(heso.equals("TT")){
            this.heso =4;
        }
        if(heso.equals("CN")){
            this.heso =2;
        }
        this.sodien = b-a;
        this.thanhtien = this.sodien * this.heso * 550;
        if(this.sodien< 50) this.phutroi =0;
        if(this.sodien >=50 && this.sodien <=100){
            double w = this.thanhtien/100.0*35;
            double q = w - (long)w;
            if(q>=0.5){
                this.phutroi = (long)w +1;
            }
            else {
                this.phutroi = (long)w;
            }
        } 
        if(this.sodien>100) this.phutroi = this.thanhtien;
        this.tong = this.thanhtien + this.phutroi;
                
        
    }

    @Override
    public String toString() {
        return  ms + " " + heso + " " + thanhtien + " " + phutroi + " " + tong;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (int)(-this.tong+((Khachhang)o).getTong());
    }
    
}
