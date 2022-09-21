/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04005;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        Thisinh A =new Thisinh();
        String S1=sc.nextLine();
        
        String S2=sc.nextLine();
        float x=sc.nextFloat();
        float y=sc.nextFloat(); 
        float z=sc.nextFloat();
        A.setTen(S1);       
        A.setNgaysinh(S2);    
        A.setD1(x);
        A.setD2(y);
        A.setD3(z);
        System.out.print(A.getTen() +" ");
        System.out.print(A.getNgaysinh() +" ");
        System.out.printf("%.1f",A.Tongdiem());
    }
    
    public static class Thisinh{
        private String ten;
        private String ngaysinh;
        private float d1;
        private float d2;
        private float d3;

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getNgaysinh() {
            return ngaysinh;
        }

        public void setNgaysinh(String ngaysinh) {
            this.ngaysinh = ngaysinh;
        }

        public float getD1() {
            return d1;
        }

        public void setD1(float d1) {
            this.d1 = d1;
        }

        public float getD2() {
            return d2;
        }

        public void setD2(float d2) {
            this.d2 = d2;
        }

        public float getD3() {
            return d3;
        }

        public void setD3(float d3) {
            this.d3 = d3;
        }
        public float Tongdiem(){
            return (this.d1 + this.d2 + this.d3);
        }
    }
}
