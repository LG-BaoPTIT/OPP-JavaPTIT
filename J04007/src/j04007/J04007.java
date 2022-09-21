/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04007;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Nhanvien A=new Nhanvien();
        A.setTen(sc.nextLine());
        A.setGioitinh(sc.nextLine());
        A.setNgaysinh(sc.nextLine());
        A.setDiachi(sc.nextLine());
        A.setMst(sc.nextLine());
        A.setNgayki(sc.nextLine());
        System.out.print(A.getMs()+" ");
        System.out.print(A.getTen()+" ");
        System.out.print(A.getGioitinh()+" ");
        System.out.print(A.getNgaysinh()+" ");
        System.out.print(A.getDiachi()+" ");
        System.out.print(A.getMst()+" ");
        System.out.print(A.getNgayki());
          
    }
    
    public static class Nhanvien{
        private String ms="00001";
        private String ten;
        private String gioitinh;
        private String ngaysinh;
        private String diachi;
        private String mst;
        private String ngayki;

        public String getMs() {
            return ms;
        }
        
        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getGioitinh() {
            return gioitinh;
        }

        public void setGioitinh(String gioitinh) {
            this.gioitinh = gioitinh;
        }

        public String getNgaysinh() {
            return ngaysinh;
        }

        public void setNgaysinh(String ngaysinh) {
            this.ngaysinh = ngaysinh;
        }

        public String getDiachi() {
            return diachi;
        }

        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }

        public String getMst() {
            return mst;
        }

        public void setMst(String mst) {
            this.mst = mst;
        }

        public String getNgayki() {
            return ngayki;
        }

        public void setNgayki(String ngayki) {
            this.ngayki = ngayki;
        }
        
    }
}
