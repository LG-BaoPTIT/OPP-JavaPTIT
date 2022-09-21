/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04014;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J04014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Phanso A=new Phanso();
            Phanso B=new Phanso();
            Phanso C=new Phanso();
            Phanso D=new Phanso();
            
            A.setTu(sc.nextInt());
            A.setMau(sc.nextInt());
            B.setTu(sc.nextInt());
            B.setMau(sc.nextInt());
            
            C=A.add(B).sqrt2();
            C.rutgon();
            D=A.nhan(B).nhan(C);
            D.rutgon();
            
            System.out.print(C.toString()+" ");
            System.out.println(D.toString());
        }
    }
    
}
