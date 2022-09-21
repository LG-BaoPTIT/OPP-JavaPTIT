/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package songuyento;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author LGB
 */
public class SONGUYENTO {

  public static void main (String[] args) throws java.lang.Exception {
     Scanner sc = new Scanner(System.in);
     int t= sc.nextInt();
    while(t>0){
        int N = sc.nextInt();;
        if(isPrimeNumber(N)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        t--;
    }
  }
  
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
