/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Asus ROG
 */
public class J05050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        ArrayList<Khachhang> list = new ArrayList();
        for(int i=1;i<=t;i++){
            String a = sc.nextLine();
            long b = Long.parseLong(sc.nextLine());
            long c = Long.parseLong(sc.nextLine());
            list.add(new Khachhang(String.valueOf(i),a,b,c));
        }
        Collections.sort(list);
        for(Khachhang i : list){
            System.out.println(i);
        }
    }
    
}
/*
3

KD

400

555

NN

58

400

CN

150

700
*/