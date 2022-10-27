/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j06001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J06001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String,ArrayList<String>> list = new HashMap(); 
        while(t-->0){
            String code =sc.nextLine();
            String name = sc.nextLine();
            String price1 = sc.nextLine();
            String price2 = sc.nextLine();
            list.put(code, new ArrayList<String>());
            list.get(code).add(name);
            list.get(code).add(price1);
            list.get(code).add(price2);
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Order> bill =new ArrayList();
        for(int i=0;i<n;i++){
            String billCode = sc.next();
            long quanity = Long.parseLong(sc.next());
            String name = list.get(billCode.substring(0,2)).get(0);
            //long unitPrice = Long.valueOf(list.get(billCode.substring(0,2)).get(Integer.valueOf(billCode.charAt(2))));
            long unitPrice = Long.valueOf(list.get(billCode.substring(0, 2)).get(billCode.charAt(2) - '0'));
            bill.add(new Order(billCode,i+1, name, unitPrice, quanity));
        }
        Collections.sort(bill);
        for(Order o : bill){
            System.out.println(o);
        }
                
    }
    
}
