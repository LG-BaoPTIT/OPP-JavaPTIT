/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06003;

/**
 *
 * @author LGB
 */
public class Students implements Comparable{
    private String ms;
    private String ten;
    private String sdt;
    private int nhom;
    private String nhiemvu;

    public String getMs() {
        return ms;
    }
    
    public void setNhiemvu(String nhiemvu) {
        this.nhiemvu = nhiemvu;
    }
    
    public int getNhom() {
        return nhom;
    }
    
    public Students(String ms, String ten, String sdt, String nhom) {
        this.ms = ms;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = Integer.valueOf(nhom);
    }

    @Override
    public String toString() {
        return ms + " " + ten + " " + sdt + " " + nhom + " " + nhiemvu;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.ms.compareTo(((Students)o).getMs());
    }
    
}
