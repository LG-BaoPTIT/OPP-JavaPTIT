/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07054;

import java.util.StringTokenizer;

/**
 *
 * @author LGB
 */
public class Sinhvien implements Comparable{
    private String ms;
    private String ten;
    private double tb;
    private int xh;

    public void setXh(int xh) {
        this.xh = xh;
    }
    
    public double getTb() {
        return tb;
    }

    public int getXh() {
        return xh;
    }
    

    public Sinhvien(String ten,String ms, double a, double b, double c) {
        StringBuilder s = new StringBuilder();
        s.append("SV");
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else{
            s.append(ms);
        }
        this.ms = s.toString();
        
        StringTokenizer tk = new StringTokenizer(ten);
        StringBuilder x = new StringBuilder();
        while(tk.hasMoreTokens()){
            String token = tk.nextToken().toLowerCase();
            x.append(String.valueOf(token.charAt(0)).toUpperCase());
            for(int i=1;i<token.length();i++){
                x.append(String.valueOf(token.charAt(i)));
            }
            x.append(" ");
        }
        this.ten = x.toString().trim();
        
        this.tb = (a*3 + b*3 + c*2)/8;
    }

    @Override
    public String toString() {
       System.out.print(ms + " " + ten +" ");
       System.out.printf("%.2f", tb);
       System.out.print(" "+xh);
       return "";
    }

    @Override
    public int compareTo(Object o) {
        if(this.tb > ((Sinhvien)o).getTb()){
            return -1;
        }
        else{
            if(this.tb < ((Sinhvien)o).getTb()){
                return 1;            
            }
            else return 0;
        }
    }
    
    
    
}
