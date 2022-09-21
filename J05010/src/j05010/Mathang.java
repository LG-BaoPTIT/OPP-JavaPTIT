/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05010;

/**
 *
 * @author LGB
 */
public class Mathang implements Comparable {
    private String ms;
    private String ten;
    private String loai;
    private double giamua;
    private double giaban;
    private double lai;

    public double getLai() {
        return lai;
    }
    
    public Mathang(String ms,String ten,String loai,double giamua,double giaban){
        this.ms=ms;
        this.ten=ten;
        this.loai=loai;
        this.giamua=giamua;
        this.giaban=giaban;
        this.lai=giaban-giamua;
    }
    @Override
    public int compareTo(Object o) {
        double x=((Mathang)o).getLai();
        return (int)(x-this.lai);
    }

    @Override
    public String toString() {
        System.out.print(ms + " " + ten + " " + loai + " ");
        System.out.printf("%.2f",lai);
        return "";
    }
    
}
