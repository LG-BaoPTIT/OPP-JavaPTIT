/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07048;

/**
 *
 * @author LGB
 */
public class Sanpham implements Comparable{
    private String ms;
    private String ten;
    private int giaban;
    private int tgbh;

    public String getMs() {
        return ms;
    }

    public int getGiaban() {
        return giaban;
    }
    
    public Sanpham(String ms, String ten, int giaban, int tgbh) {
        this.ms = ms;
        this.ten = ten;
        this.giaban = giaban;
        this.tgbh = tgbh;
    }

    @Override
    public int compareTo(Object o) {
       if(this.giaban > ((Sanpham)o).getGiaban()){
           return -1;
       }
       else {
           if(this.giaban < ((Sanpham)o).getGiaban()){
               return 1;
           }
           else return this.ms.compareTo(((Sanpham)o).getMs());
       }
    }

    @Override
    public String toString() {
        return  ms + " " + ten + " " + giaban + " " + tgbh ;
    }
    
    
}
