/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05043;

/**
 *
 * @author LGB
 */
public class Nhanvien implements Comparable {
    private String ms;
    private String ten;
    private String cvu;
    private Long lcb;
    private int ngaycong;
    private long phucap;
    private long luongchinh;
    private int tamung;
    private long thunhap;
    public String getCvu() {
        return cvu;
    }

    public long getThunhap() {
        return thunhap;
    }

    public String getMs() {
        return ms;
    }
    
    public Nhanvien(String ms, String ten, String cvu, Long lcb, int ngaycong) {
        
        StringBuilder s = new StringBuilder();
        s.append("NV");
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else s.append(ms);
        
        this.ms = s.toString();
        this.ten = ten;
        this.cvu = cvu;
        this.lcb = lcb;
        this.ngaycong = ngaycong;
        
        
        switch (this.cvu){
            case "GD" :
                this.phucap=500;
                break;
            case "PGD" :
                this.phucap=400;
                break;
            case "TP" :
                this.phucap=300;
                break;
            case "KT" :
                this.phucap=250;
                break;
            default:
                this.phucap=100;
        }
        
        this.luongchinh = this.lcb * this.ngaycong;
        Long a = (Long)(2*(this.phucap + this.luongchinh)/3);
        if( a< 25000){
            this.tamung = (int)((Math.round(a/1000.0))*1000);
        }
        else this.tamung = 25000;
        this.thunhap = this.luongchinh + this.phucap;
    }

    @Override
    public String toString() {
        return ms + " " + ten + " " + phucap + " " + luongchinh + " " + tamung + " " +(luongchinh + phucap - tamung);
    }

    @Override
    public int compareTo(Object o) {
       if(this.thunhap < ((Nhanvien)o).getThunhap()) return 1;
       else{
           if(this.thunhap > ((Nhanvien)o).getThunhap()) return -1;
           else {
               return this.ms.compareTo(((Nhanvien)o).getMs());
           }
       }
    }
    
    
}
