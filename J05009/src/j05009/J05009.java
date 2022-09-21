/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05009;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.next();
        List<Sinhvien> list =new ArrayList<Sinhvien>();
        double x=0;
        for(int i=1;i<=t;i++){
            String ten=sc.nextLine();
            String ns=sc.nextLine();
            String d1=sc.nextLine();
            String d2=sc.nextLine();
            String d3=sc.nextLine();         
            list.add(new Sinhvien(String.valueOf(i),ten,ns,Double.valueOf(d1),Double.valueOf(d2),Double.valueOf(d3)));
            
        }
        Collections.sort(list);
        double topmark=list.get(0).getTong();
        for(Sinhvien i:list){
            if(i.getTong()==topmark){
                System.out.println(i);
            }           
        }
        
    }   
}
