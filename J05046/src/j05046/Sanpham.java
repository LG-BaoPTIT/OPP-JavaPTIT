/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05046;

/**
 *
 * @author LGB
 */
public class Sanpham implements Comparable{
    private String ten;
    private int sl;
    private long gia;
    private long ck;
    private long thanhtien;
    private String ms;

    public String getMs() {
        return ms;
    }
    
    public Sanpham(String ms, String ten, int sl, long gia) {
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
        if(sl > 10) this.ck = gia * sl * 5/100;
        if(sl <= 10 && sl >=8) this.ck = gia * sl * 2/100;
        if(sl < 8 && sl >=5) this.ck = gia * sl * 1/100;
        if(sl < 5) this.ck = 0;
        this.thanhtien =  gia * sl -this.ck;
        StringBuilder s = new StringBuilder();
        String[] str = ten.split(" ");
        s.append(String.valueOf(str[0].charAt(0)).toUpperCase());
        s.append(String.valueOf(str[1].charAt(0)).toUpperCase());
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else s.append(ms);
        this.ms=s.toString();
    }

    @Override
    public String toString() {
        return ms + " " +ten + " " + ck + " " + thanhtien ;
    }

    @Override
    public int compareTo(Object o) {
       if(this.ck > ((Sanpham)o).ck){
           return -1;
       }
       else {
            if(this.ck < ((Sanpham)o).ck){
                return 1;
            }
            else return 0;
       }
    }
    
}
