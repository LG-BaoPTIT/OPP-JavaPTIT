/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05033;

/**
 *
 * @author LGB
 */
public class Time implements Comparable<Time>{
    private String thoigian;
    public Time(String s){
        this.thoigian=s;
    }
    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    @Override
    public int compareTo(Time o) {
        return this.thoigian.compareTo(o.getThoigian());
    }

    @Override
    public String toString() {
        return  this.thoigian ;
    }
    
}
