/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuvidientic;
import java.util.Scanner;
/**
 *
 * @author LGB
 */
public class tinhtong {

    /**
     * @param args the command line arguments
     */
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
            System.out.printf("%.2f",-b/a);
        }
    }
}
