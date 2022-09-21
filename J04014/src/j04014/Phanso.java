/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04014;

/**
 *
 * @author LGB
 */
public class Phanso {
    private long tu;
    private long mau;

    public long getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public Phanso add(Phanso B){
        Phanso C=new Phanso();
        C.tu=this.tu*B.mau+this.mau*B.tu;
        C.mau=this.mau*B.mau;
        return C;
    }
    public Phanso sqrt2(){
        Phanso C = new Phanso();
        C.tu=this.tu*this.tu;
        C.mau=this.mau*this.mau;
        return C;      
    }
    public Phanso nhan(Phanso B){
        Phanso C = new Phanso();
        C.tu=this.tu*B.tu;
        C.mau=this.mau*B.mau;
        return C;
    }
    public void rutgon(){
        long a=this.tu;
        long b=this.mau;
        long r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        this.tu=this.tu/b;
        this.mau=this.mau/b;
    }

    @Override
    public String toString() {
        return this.tu+"/"+this.mau;
    }
    
}
