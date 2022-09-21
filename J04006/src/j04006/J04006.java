/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04006;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Sinhvien A =new Sinhvien();
        A.setTen(sc.nextLine());
        A.setLop(sc.nextLine());
        A.setNs(sc.nextLine());
        A.setDiem(sc.nextDouble());
        System.out.print("B20DCCN001 ");
        System.out.print(A.getTen()+" ");
        System.out.print(A.getLop()+" ");
        System.out.print(A.getNs()+" ");
        System.out.printf("%.2f",A.getDiem());
    }
    public static class Sinhvien{
        private String ten;
        private String lop;
        private String ns;
        private double diem;

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public String getNs() {
            return ns;
        }

        public void setNs(String ns) {
            String[] splits=ns.split("/");
            StringBuilder x= new StringBuilder();
            if(splits[0].length()<2){
                x.append('0');
                x.append(splits[0]);
                x.append('/');
            }
            else{
                x.append(splits[0]);
                x.append('/');
            }
            if(splits[1].length()<2){
                x.append('0');
                x.append(splits[1]);
                x.append('/');
            }
            else{
                x.append(splits[1]);
                x.append('/');
            }
            x.append(splits[2]);
            
            this.ns = x.toString();
        }

        public double getDiem() {
            return diem;
        }

        public void setDiem(double diem) {
            this.diem = diem;
        }
        
    }
}
