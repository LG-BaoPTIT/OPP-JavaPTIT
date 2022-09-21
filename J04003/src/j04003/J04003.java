/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04003;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Phanso B=new Phanso();
        Phanso A =new Phanso();
        Phanso C =new Phanso();
        long a=sc.nextLong();
        long b=sc.nextLong();
        A.setTu(a);
        A.setMau(b);
        a=sc.nextLong();
        b=sc.nextLong();
        B.setTu(a);
        B.setMau(b);
        C=A.Tong(B);
        C.Rutgon();
    }
    
    public static class Phanso {
        public long tu;
        public long mau;

        public void setTu(long tu) {
            this.tu = tu;
        }

        public void setMau(long mau) {
            this.mau = mau;
        }
        public Phanso Tong(Phanso B){
            Phanso C=new Phanso();
            C.tu=this.tu * B.mau + B.tu*this.mau;
            C.mau=this.mau * B.mau;  
            return C;
        }
        public void Rutgon(){
            long a=this.tu;
            long b=this.mau;
            long r = a % b;
            while (r != 0) {
                a = b;
                b = r;
                r = a % b;
            }
            long A=this.tu/b;
            long B=this.mau/b;
            System.out.print(A+ "/" +B);
        }
    }
}
