/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chiatamgiac;
import java.io.*;
import java.util.*;
/**
 *
 * @author LGB
 */
public class CHIATAMGIAC {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a==0 && b==0){
            System.out.println("VSN");
        }
        if(a==0 && b!=0){
            System.out.println("VN");
        }
        if(a!=0){
            float d =(float)-b/a;
            System.out.printf("%.2f",d);
        }
    }
}
