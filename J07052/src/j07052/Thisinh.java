/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07052;

import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class Thisinh implements Comparable{
    private String ms;
    private String ten;
    private double d1;
    private double d2;
    private double d3;
    private double ut;
    private double tongdiem;
    private String kq;
    public String getMs() {
        return ms;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }
    
    public Thisinh(String ms, String ten, double d1, double d2, double d3) {
        this.ms = ms;       
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        
        StringBuilder s = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(ten.toLowerCase());
        while(tk.hasMoreTokens()){
            String x = tk.nextToken();
            s.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1;i<x.length();i++){
                s.append(x.charAt(i));
            }
            s.append(" ");
        }
        this.ten = s.toString().trim();
        
        String y = ms.substring(0, 3);
        if(y.equals("KV1")) this.ut = 0.5;
        if(y.equals("KV2")) this.ut = 1.0;
        if(y.equals("KV3")) this.ut = 2.5;
        
        this.tongdiem = d1*2+d2+d3+this.ut;
        
    }

    @Override
    public int compareTo(Object o) {
        if(this.tongdiem > ((Thisinh)o).tongdiem){
            return -1;
        }
        else {
            if(this.tongdiem < ((Thisinh)o).tongdiem){
                return 1;
            }
            else return ((Thisinh)o).ms.compareTo(this.ms);
        }
    }

    @Override
    public String toString() {
        System.out.print(ms + " " + ten + " ");
        if(this.ut - (int)this.ut==0){
            System.out.print((int)this.ut);
        }
        else System.out.printf("%.1f",this.ut);
        System.out.print(" ");
        if(this.tongdiem - (int)this.tongdiem==0){
            System.out.print((int)this.tongdiem);
        }
        else System.out.printf("%.1f",this.tongdiem);
        
        System.out.print(" "+kq);
        return "";
    }
    
    
}
