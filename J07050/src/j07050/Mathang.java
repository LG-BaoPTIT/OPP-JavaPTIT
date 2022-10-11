/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07050;

/**
 *
 * @author LGB
 */
public class Mathang implements Comparable {
    private String ms;
    private String ten;
    private String nhom;
    private double giamua;
    private double giaban;
    private double lai;

    public double getLai() {
        return lai;
    }

    public Mathang(String ms, String ten, String nhom, double giamua, double giaban) {
        StringBuilder s= new StringBuilder();
        s.append("MH");
        if(ms.length()==1){
            s.append("0");
            s.append(ms);
        }
        else {
            s.append("ms");
        }
        this.ms = s.toString();
        this.ten = ten;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
        this.lai = giaban - giamua;
    }

    @Override
    public int compareTo(Object o) {
        if(this.lai > ((Mathang)o).getLai()){
            return -1;
        }
        else {
            if(this.lai < ((Mathang)o).getLai()){
                return 1;
            }
            else return 0;
        }
    }

    @Override
    public String toString() {
        System.out.print(ms + " " + ten + " " + nhom +" ");
        System.out.printf("%.2f", lai);
        return "";
    }
    
    
    
}
