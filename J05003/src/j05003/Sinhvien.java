/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.*;
import java.util.StringTokenizer;
/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable {
    private String ten;
    private String mslop;
    private String ngaysinh;
    private double gpa;
    private String ms;
    
    public Sinhvien(String stt,String ten,String mslop,String ns,double gpa)   {
        
        this.mslop=mslop;
        //this.ngaysinh=new SimpleDateFormat("dd/mm/yy").parse(ngaysinh).toString();
        this.gpa=gpa;
        StringBuilder s= new StringBuilder();
        s.append("B20DCCN");
        if(stt.length()==1){
            s.append("00");
            s.append(stt);
        }
        if(stt.length()==2){
            s.append("0");
            s.append(stt);
        }
        if(stt.length()==3){
            
            s.append(stt);
        }
        this.ms=s.toString();
        String[] splits=ns.split("/");
            StringBuilder x= new StringBuilder();
            if(splits[0].length()<2){
                x.append('0');
                x.append(splits[0]);
                x.append('/');
            }
            else{
                x.append(splits[0]);
                x.append('/');
            }
            if(splits[1].length()<2){
                x.append('0');
                x.append(splits[1]);
                x.append('/');
            }
            else{
                x.append(splits[1]);
                x.append('/');
            }
            x.append(splits[2]);
            
            this.ngaysinh = x.toString();
            StringTokenizer tk =new StringTokenizer(ten.toLowerCase());
            StringBuilder kq =new StringBuilder();
            while(tk.hasMoreTokens()){
                String g=tk.nextToken();
                kq.append(Character.toUpperCase(g.charAt(0)));
                for(int i=1;i<g.length();i++){
                    kq.append(g.charAt(i));
                }
                kq.append(" ");
                
            }
            this.ten=kq.toString().trim();
    }

    public double getGpa() {
        return gpa;
    }
    
    @Override
    public String toString() {
        System.out.print(ms+ " " +ten+" "+ mslop+" "+ngaysinh+" ");
        System.out.printf("%.2f",gpa);
        return "";
    }
   

    @Override
    public int compareTo(Object o) {
        String h =String.valueOf(((Sinhvien)o).getGpa());
        
        return h.compareTo(String.valueOf(this.gpa));
    
    }
    
}
