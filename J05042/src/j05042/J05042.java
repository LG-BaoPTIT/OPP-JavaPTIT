/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05042;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> list = new ArrayList();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            Long b = Long.parseLong(arr[1]);
            list.add(new Sinhvien(ten,a,b));
        }
        Collections.sort(list);
        for( Sinhvien i : list){
            System.out.println(i);
        }
    }
    
}
