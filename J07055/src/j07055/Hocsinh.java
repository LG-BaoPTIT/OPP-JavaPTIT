/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07055;

import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class Hocsinh implements Comparable{
    private String ten;
    private double d1;
    private double d2;
    private double d3;
    private double tong;
    private String xeploai;
    private String ms;
    public double getTong() {
        return tong;
    }

    public Hocsinh(String ms,String ten, double d1, double d2, double d3) {
        StringBuilder b = new StringBuilder();
        b.append("SV");
        if(ms.length()==1){
            b.append("0");
            b.append(ms);
        }
        else {
            b.append(ms);
        }
        this.ms = b.toString();
        
            String a = ten.toLowerCase();
            StringTokenizer tk= new StringTokenizer(a);
            StringBuilder kq = new StringBuilder();
            while(tk.hasMoreTokens()){
                String x=tk.nextToken();
                kq.append(Character.toUpperCase(x.charAt(0)));
                for(int i=1;i<x.length();i++){
                    kq.append(x.charAt(i));
                }
                kq.append(" ");
            }
            
        this.ten = kq.toString().trim();
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1*25/100 + d2*35/100 + d3*40/100;
        if(this.tong>=8) this.xeploai ="GIOI";
        if(this.tong<8 && this.tong>=6.5) this.xeploai ="KHA";
        if(this.tong<6.5 && this.tong>=5) this.xeploai ="TRUNG BINH";
        if(this.tong<5) this.xeploai ="KEM";
    }

    @Override
    public String toString() {
        System.out.print(ms+" "+ ten +" ");
        System.out.printf("%.2f",this.tong);
        System.out.print(" "+ this.xeploai);
       
        return "";
    }

    @Override
    public int compareTo(Object o) {
        if(this.tong> ((Hocsinh)o).getTong()){
            return -1;
        }
        else {
            if(this.tong< ((Hocsinh)o).getTong()){
                return 1;
            }
            else return 0;
        }
    }
    
    
}
