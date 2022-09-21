/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04015;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Giaovien A =new Giaovien();
        
        A.setMs(sc.nextLine());
        A.setTen(sc.nextLine());
        A.setLcb(sc.nextLong());
        System.out.print(A.getMs()+" ");
        System.out.print(A.getTen()+" ");
        System.out.print(A.getHsl()+" ");
        System.out.print(A.getPhucap()+" ");
        System.out.print(A.getLcb()*A.getHsl()+A.getPhucap()+" ");
    }
    public static class Giaovien{
        private String ms;
        private String ten;
        private long lcb;
        private String chucvu;
        private int hsl;
        private long phucap;

        public int getHsl() {
            StringBuilder hs=new StringBuilder();
            hs.append(ms.charAt(2));
            hs.append(ms.charAt(3));
            hsl=Integer.valueOf(hs.toString());
            return hsl;
        }

        public long getPhucap() {
            StringBuilder hs=new StringBuilder();
            hs.append(ms.charAt(0));
            hs.append(ms.charAt(1));
            String x=hs.toString();
            if(x.equals("HT")) phucap =2000000;
            if(x.equals("HP")) phucap =900000;
            if(x.equals("GV")) phucap =500000;
            return phucap;
        }
        
        public String getMs() {
            return ms;
        }

        public void setMs(String ms) {
            this.ms = ms;
        }

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

    }
}
