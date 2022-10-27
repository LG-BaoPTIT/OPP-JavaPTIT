/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j08012;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Asus ROG
 */
public class J08012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> setA = new TreeSet();
        for(int i=0;i<n-1;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            setA.add(x);
            setA.add(y);
        }
        if(setA.size()==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}