/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05036;

/**
 *
 * @author LGB
 */
public class Mathang implements Comparable {
    private String ms;
    private String ten;
    private String dvt;
    private double gianhap;
    private double soluong;
    private double ship;
    private double thanhtien;
    private double giaban;
    
    public Mathang(String ms, String ten, String dvt, double gianhap, double soluong){
        StringBuilder s = new StringBuilder();
        s.append("MH");
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else{
            s.append(ms);
        }
        this.ms = s.toString();
        this.ten = ten;
        this.dvt = dvt;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.ship =gianhap * soluong * 5 / 100 ;
        this.thanhtien = gianhap * soluong + this.ship;
        this.giaban = (this.thanhtien + 2 * this.thanhtien / 100)/this.soluong;
        
    }

    @Override
    public String toString() {
        System.out.print( ms + " " + ten + " " + dvt + " ");
        System.out.printf("%.0f",ship );
        System.out.print(" ");
        System.out.printf("%.0f",thanhtien );
        System.out.print(" ");
       
        System.out.print((int)(Math.ceil(giaban/100.0))*100 );
        return "";
    }

    @Override
    public int compareTo(Object o) {
       if(this.giaban < ((Mathang)o).giaban){
           return 1;          
       }
        if(this.giaban > ((Mathang)o).giaban){
           return -1;          
       }
        else return 0;
        
    }
    
}
