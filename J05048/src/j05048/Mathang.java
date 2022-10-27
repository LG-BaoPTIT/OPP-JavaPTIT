/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05048;

/**
 *
 * @author Asus ROG
 */
public class Mathang implements Comparable {
    private String ms;
    private int slnhap;
    private int slxuat;
    private int dongia;
    private int tien;
    private int thue;
    private String loai;

    public String getLoai() {
        return loai;
    }
    
    public Mathang(String ms, int slnhap) {
        this.ms = ms;
        this.slnhap = slnhap;
        this.loai = String.valueOf(this.ms.charAt(0));
        if(this.ms.charAt(0)=='A'){
            double a = this.slnhap * 0.6;
            double x = a - (int)a;
            if(x>=0.5){
                this .slxuat = (int)a +1;
            }
            else {
                this.slxuat = (int)a;
            }
             
        }
        else{
            double a = this.slnhap * 0.7;
            double x = a - (int)a;
            if(x>=0.5){
                this .slxuat = (int)a +1;
            }
            else {
                this.slxuat = (int)a;
            }

        }
        if(this.ms.charAt(ms.length()-1)=='Y'){
            this.dongia = 110000;
        }
        else{
            this.dongia = 135000;
        }
        this.tien = this.slxuat * this.dongia;
        if(this.ms.charAt(0)=='A' && this.ms.charAt(ms.length()-1)=='Y'){
            double q= this.tien*0.08;
            this.thue = (int)q;
        }
        if(this.ms.charAt(0)=='A' && this.ms.charAt(ms.length()-1)=='N'){
            double q= this.tien*0.11;
            this.thue = (int)q;
        }
        if(this.ms.charAt(0)=='B' && this.ms.charAt(ms.length()-1)=='Y'){
            double q= this.tien*0.17;
            this.thue = (int)q;
        }
        if(this.ms.charAt(0)=='B' && this.ms.charAt(ms.length()-1)=='N'){
            double q= this.tien*0.22;
            this.thue = (int)q;
        }
    }

    @Override
    public String toString() {
        return  ms + " " + slnhap + " " + slxuat + " " + dongia + " " + tien + " " + thue ;
    }

    public int getThue() {
        return thue;
    }
    
    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(this.thue > ((Mathang)o).getThue()){
            return -1;
        }
        else {
            if(this.thue < ((Mathang)o).getThue()){
                return 1;
            }
            else return 0;
        }
    }
    
    
}
