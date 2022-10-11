/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07045;

/**
 *
 * @author LGB
 */
public class LoaiPhong implements Comparable {
        private String ms;
        private String lp;
        private int dg;
        private double ppv;

        public String getLp() {
            return lp;
        }
        
        
        public LoaiPhong(String str){
            String s[] = str.split(" ");
            this.ms = s[0];
            this.lp = s[1];
            this.dg = Integer.valueOf(s[2]);
            this.ppv = Double.valueOf(s[3]);
        }

    @Override
    public int compareTo(Object o) {
        return this.lp.compareTo(((LoaiPhong)o).getLp());
    }

    @Override
    public String toString() {
        return  ms + " " + lp + " " + dg + " " + ppv ;
    }
    
}
