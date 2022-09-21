/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05006;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<Nhanvien> list = new ArrayList();
        for(int i=1;i<=t;i++){
             String ten=sc.nextLine();
             String gioitinh=sc.nextLine();
             String ngaysinh=sc.nextLine();
             String diachi=sc.nextLine();
             String mst=sc.nextLine();
             String ngayki=sc.nextLine();
             list.add(new Nhanvien(String.valueOf(i),ten,gioitinh,ngaysinh,diachi,mst,ngayki));
        }
        Collections.sort(list);
        for(Nhanvien i : list){
            System.out.println(i);
        }
    }
    
}
