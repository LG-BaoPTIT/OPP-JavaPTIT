/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05036;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05036 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mathang> list = new ArrayList();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=t; i++){
            
            String ten = sc.nextLine();
            String dvt = sc.nextLine();
            String gianhap = sc.nextLine();
            String soluong = sc.nextLine();
            list.add(new Mathang(String.valueOf(i),ten, dvt, Double.valueOf(gianhap), Double.valueOf(soluong)));
        }
        Collections.sort(list);
        for(Mathang i : list){
            System.out.println(i);
        }
    }
    
}
