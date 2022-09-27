/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05046;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05046 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Sanpham> list = new ArrayList();
        while(t-->0){
            int ms=1;
            String ten = sc.nextLine();
            String sl = sc.nextLine();
            String gia =  sc.nextLine();
            StringBuilder s = new StringBuilder();
            String[] str = ten.split(" ");
            s.append(String.valueOf(str[0].charAt(0)).toUpperCase());
            s.append(String.valueOf(str[1].charAt(0)).toUpperCase());
            String a= s.toString();
            for(Sanpham i : list){
                String b = i.getMs().substring(0, 2);
                if(b.equals(a)){
                    ms++;
                }
            }

            list.add(new Sanpham(String.valueOf(ms), ten, Integer.valueOf(sl), Long.valueOf(gia)));
        }
        Collections.sort(list);
        for(Sanpham y : list){
            System.out.println(y);
        }
    }
    
}
