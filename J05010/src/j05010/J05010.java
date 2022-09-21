/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05010;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList<Mathang> list =new ArrayList();
        for(int i=1;i<=t;i++){
             
             String ten=sc.nextLine();
             String loai=sc.nextLine();
             String giamua=sc.nextLine();
             String giaban=sc.nextLine();
             list.add(new Mathang(String.valueOf(i),ten,loai,Double.valueOf(giamua),Double.valueOf(giaban)));
        }
        Collections.sort(list);
        for(Mathang i :list){
            System.out.println(i);
        }
    }
    
}
