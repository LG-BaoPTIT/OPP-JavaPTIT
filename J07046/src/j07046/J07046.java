/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LGB
 */
public class J07046 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("KHACH.in");
        Scanner sc = new Scanner(file);
        String t = sc.nextLine();
        ArrayList<Khachhang> list = new ArrayList();
        for(int i=1 ; i<= Integer.valueOf(t); i++){
            String ten = sc.nextLine();
            String phong= sc.nextLine();           
            String ngayden= sc.nextLine();
            String ngaydi= sc.nextLine();
            list.add(new Khachhang(String.valueOf(i), ten, phong, ngayden, ngaydi));
        }
        Collections.sort(list);
        for( Khachhang i : list){
            System.out.println(i);
        }
    }
    
}
