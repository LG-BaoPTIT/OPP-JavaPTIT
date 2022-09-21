/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05028;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<Congty> list = new ArrayList();
        while(t-->0){
            String ms=sc.nextLine();
            String ten=sc.nextLine();
            String soluong=sc.nextLine();
            list.add(new Congty(ms,ten,Integer.valueOf(soluong)));
        }
        Collections.sort(list);
        int x=sc.nextInt();
        while(x-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(Congty i : list){
                if(i.getSoluong()<=b && i.getSoluong()>=a){
                    System.out.println(i);
                }
                
            }
        }
        
    }
    
}
