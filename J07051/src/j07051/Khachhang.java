/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07051;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.*;
public class Khachhang implements Comparable{
    private String ms;
    private String ten;
    private String phong;
    private String ngayden;
    private String ngaydi;
    private long songay;
    private long pdv;
    private long tongtien;

    public long getTongtien() {
        return tongtien;
    }

    public Khachhang(String ms, String ten, String phong, String ngayden, String ngaydi, long pdv) {
        this.ten = ten;
        this.phong = phong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        this.pdv = pdv;
        StringBuilder s= new StringBuilder();
        s.append("KH");
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else{
            s.append(ms);
        }
        this.ms = s.toString();
        SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bd = (Date) simpledate.parse(ngayden);
            Date kt = (Date) simpledate.parse(ngaydi);
            
            long startValue = bd.getTime();
            long endValue = kt.getTime();
            long times = Math.abs(startValue-endValue);
            this.songay = times/(24*60*60*1000)+1;
            if(this.songay==0) this.songay=1;
            
        } catch (ParseException ex) {
            System.out.print("123");
        }
        switch (phong.charAt(0)) {
            case '1':
                this.tongtien = this.songay * 25 + this.pdv;
                break;
            case '2':
                this.tongtien = this.songay * 34 + this.pdv;
                break;
            case '3':
                this.tongtien = this.songay * 50 + this.pdv;
                break;
            case '4':
                this.tongtien = this.songay * 80 + this.pdv;
                break;
            
        }
        
        
    }

    @Override
    public String toString() {
        return ms + " " + ten + " " + phong + " " + songay + " " + tongtien ;
    }

    @Override
    public int compareTo(Object o) {
       if(this.tongtien > ((Khachhang)o).getTongtien()){
           return -1;
       }
       else {
            if(this.tongtien > ((Khachhang)o).getTongtien()){
                return 1;
            }
            else return 0;
       }
    }
    
    
}
