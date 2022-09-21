/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05018;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        ArrayList<Hocsinh> list = new ArrayList();
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            
            String d=sc.nextLine();
            String[] diem =d.split("  ");
           String a=d.substring(d.length()-3, d.length());
            
          list.add(new Hocsinh(String.valueOf(i),ten,Double.valueOf(diem[0]),Double.valueOf(diem[1]),Double.valueOf(diem[2]),Double.valueOf(diem[3]),Double.valueOf(diem[4]),Double.valueOf(diem[5]),Double.valueOf(diem[6]),Double.valueOf(diem[7]),Double.valueOf(diem[8]),Double.valueOf(a)));           
        }
        Collections.sort(list);
        for(Hocsinh i : list){
            System.out.println(i);
        }
    }
    
}
