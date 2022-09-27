/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07046;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.*;

/**
 *
 * @author LGB
 */
public class Khachhang implements Comparable{
    private String ten;
    private String phong;
    private String ms;
    private String ngayden;
    private String ngaydi;
    private long songay;
    public Khachhang(String ms, String ten, String phong, String ngayden, String ngaydi) {
       StringBuilder st = new StringBuilder();
        st.append("KH");
        if(ms.length()==1) {
            st.append("0");
            st.append(ms);
        }
        else{
            st.append(ms);
        }
           
              
        this.ms = st.toString().trim();
        this.ten = ten;
        this.phong = phong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        
         // Định dạng thời gian
        
         SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bd = (Date) simpledate.parse(ngayden);
            Date kt = (Date) simpledate.parse(ngaydi);
            
            long startValue = bd.getTime();
            long endValue = kt.getTime();
            long times = Math.abs(startValue-endValue);
            this.songay = times/(24*60*60*1000);
            
        } catch (ParseException ex) {
            System.out.print("123");
        }

    }
    
    
    @Override
    public String toString() {
        return  ms+" " + ten + " " + phong + " " + songay ;
    }
    
    @Override
    public int compareTo(Object o) {
        if( this.songay>((Khachhang)o).songay) {
            return -1;
        }
        else if( this.songay<((Khachhang)o).songay){
            return 1;
        }
        else return 0;
    }
    
    
    
}
