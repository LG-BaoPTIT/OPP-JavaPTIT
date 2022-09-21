/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05028;

/**
 *
 * @author LGB
 */
public class Congty implements Comparable {
    private String ms;
    private String ten;
    private int soluong;
    
    public Congty(String ms,String ten,int soluong){
        this.ms=ms;
        this.ten=ten;
        this.soluong=soluong;
    }

    public String getMs() {
        return ms;
    }

    public String getTen() {
        return ten;
    }

    public int getSoluong() {
        return soluong;
    }
    
    @Override
    public int compareTo(Object o) {
      int rs =((Congty)o).getSoluong()-this.soluong;
      if(rs==0){
          return this.ms.compareTo(((Congty)o).getMs());
      }
      else return rs;
    }

    @Override
    public String toString() {
        return  ms + " " + ten + " " + soluong ;
    }
    
}
