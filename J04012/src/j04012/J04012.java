/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04012;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Nhanvien A = new Nhanvien();
        String s=sc.nextLine();
        long x=sc.nextLong();
        int y=sc.nextInt();
        sc.nextLine();
        String ss=sc.nextLine();
        
        A.setTen(s); 
        A.setLcb(x);
        A.setSnc(y);     
        A.setCvu(ss);
        A.setLuongthang();
        A.setThuong();
        A.setPhucap();
        
        System.out.println(A.toString());
    }
    public static class Nhanvien{
        private String mnv="NV01";
        private String ten;
        private long lcb;
        private int snc;
        private String cvu;
        private long luongthang;
        private long tienthuong;
        private long phucap;

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public long getLcb() {
            return lcb;
        }

        public void setLcb(long lcb) {
            this.lcb = lcb;
        }

        public int getSnc() {
            return snc;
        }

        public void setSnc(int snc) {
            this.snc = snc;
        }

        public String getCvu() {
            return cvu;
        }

        public void setCvu(String cvu) {
            this.cvu = cvu;
        }
        public void setLuongthang(){
            this.luongthang=this.snc*this.lcb;
        }
        public void setThuong(){
            if(this.snc>=25) this.tienthuong=(long)(this.luongthang*0.2);
            if(this.snc>=22 && this.snc<25) this.tienthuong=(long)(this.luongthang*0.1);
        }
        public void setPhucap(){
            if(this.cvu.equals("GD")) this.phucap=250000;
            if(this.cvu.equals("PGD")) this.phucap=200000;
            if(this.cvu.equals("TP")) this.phucap=180000;
            if(this.cvu.equals("NV")) this.phucap=150000;    
        }

        @Override
        public String toString() {
            return mnv +" "+ten+" "+luongthang+" "+tienthuong+" "+phucap+ " "+ (luongthang+tienthuong+phucap) ;
        }
        
    }
    
}
