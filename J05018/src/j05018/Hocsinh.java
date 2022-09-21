/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05018;

/**
 *
 * @author LGB
 */
public class Hocsinh implements Comparable {
    private String ten;
    private double d1;
    private double d2;
    private double d3;
    private double d4;
    private double d5;
    private double d6;
    private double d7;
    private double d8;
    private double d9;
    private double d10;
    private double tb;
    private String hocluc;
    private String ms;
    public Hocsinh(String ms,String ten,double d1,double d2,double d3,double d4,double d5,double d6,double d7,double d8,double d9,double d10){
        this.ten=ten;
        
        StringBuilder r=new StringBuilder();
        r.append("HS");
        if(ms.length()==1){
            r.append("0");
            r.append(ms);
        }
        if(ms.length()==2){          
            r.append(ms);
        }
        this.ms=r.toString();
        double h=(d1*2+d2*2+d3+d4+d5+d6+d7+d8+d9+d10)/12;
        //this.tb= (double)(Math.round(h * 100) / 100);
        this.tb=h;
        if(this.tb>=9) this.hocluc="XUAT SAC";
        if(this.tb>=8&&this.tb<9) this.hocluc="GIOI";
        if(this.tb>=7&&this.tb<8) this.hocluc="KHA";
        if(this.tb>=5&&this.tb<7) this.hocluc="TB";
        if(this.tb<5) this.hocluc="YEU";
        
    }
    @Override
    public int compareTo(Object o) {
        double x=((Hocsinh)o).tb;
      return String.valueOf(x).compareTo(String.valueOf(this.tb));
    }
    @Override
    public String toString() {
        System.out.print(ms +" "+ten+" ");
        System.out.printf("%.1f",tb );
        System.out.print(" "+ hocluc);
        return "";
    }
    
    
    
}
