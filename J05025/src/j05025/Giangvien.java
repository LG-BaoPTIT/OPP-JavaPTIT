/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05025;

/**
 *
 * @author LGB
 */
public class Giangvien implements Comparable {
    private String ms;
    private String Hoten;
    private String ten;
    private String khoa;
    private String g;
    
    public Giangvien(String ms,String hoten,String khoa){
        StringBuilder a =new StringBuilder();
        a.append("GV");
        if(ms.length()==1){
            a.append("0");
            a.append(ms);
        }
        if(ms.length()==2){
            a.append(ms);
        }
        
        this.ms=a.toString();
        this.Hoten=hoten;
        String[] result = hoten.split(" ");
        this.ten=result[result.length-1];
        this.g=khoa;
        StringBuilder b= new StringBuilder();
        String[] c = khoa.split(" ");
        for(String i : c){
            b.append(String.valueOf(i.charAt(0)).toUpperCase());
        }
        this.khoa=b.toString();
        
    }

    public String getMs() {
        return ms;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getTen() {
        return ten;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getG() {
        return g;
    }

    
    @Override
    public String toString() {
        return  ms + " " + Hoten +" " + khoa ;
    }

    @Override
    public int compareTo(Object o) {
       return this.ten.compareTo(((Giangvien)o).getTen());
    }
    
      
}
