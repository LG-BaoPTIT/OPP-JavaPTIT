/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05043;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        ArrayList<Nhanvien> list = new ArrayList();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            String cv = sc.nextLine();
            long lcb = Long.parseLong(sc.nextLine());
            int sn = Integer.parseInt(sc.nextLine());
            
            list.add(new Nhanvien(String.valueOf(i),ten,cv,lcb,sn));
        }
        Collections.sort(list);
        for(Nhanvien i : list){           
            System.out.println(i);
        }
    }
    
}
