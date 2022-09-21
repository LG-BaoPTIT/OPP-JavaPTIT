/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04013;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Thisinh A =new Thisinh();
        String s=sc.nextLine();
        String ss=sc.nextLine();
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        A.setMs(s);
        A.setTen(ss);
        A.setToan(a);
        A.setLy(b);
        A.setHoa(c);
        A.xetduyet();
        System.out.print(A.getMs()+" "+A.getTen()+" ");
        if((int)A.getDiemcong()-A.getDiemcong()==0)System.out.print((int)A.getDiemcong()+" ");
        else System.out.print(A.getDiemcong()+" ");
        if((int)A.getTong()-A.getTong()==0)System.out.print((int)A.getTong()+" ");
        else System.out.print(A.getTong()+" ");
        
        System.out.print(A.getKetqua());
        
    }
    public static class Thisinh{
        private String ms;
        private String ten;
        private double toan;
        private double ly;
        private double hoa;
        private double diemcong;
        private double tong;
        private String ketqua;

        public double getDiemcong() {
            return diemcong;
        }

        public double getTong() {
            return tong;
        }

        public String getKetqua() {
            return ketqua;
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

        public double getToan() {
            return toan;
        }

        public void setToan(double toan) {
            this.toan = toan;
        }

        public double getLy() {
            return ly;
        }

        public void setLy(double ly) {
            this.ly = ly;
        }

        public double getHoa() {
            return hoa;
        }

        public void setHoa(double hoa) {
            this.hoa = hoa;
        }
        
        public void xetduyet(){
            if(this.ms.charAt(2)=='1') this.diemcong=0.5;
            if(this.ms.charAt(2)=='2') this.diemcong=1;
            if(this.ms.charAt(2)=='3') this.diemcong=2.5;
            this.tong=this.toan*2+this.hoa+this.ly;
            if(this.diemcong+this.tong>=24) this.ketqua="TRUNG TUYEN";
            else this.ketqua="TRUOT";
        }
        
    }
}
