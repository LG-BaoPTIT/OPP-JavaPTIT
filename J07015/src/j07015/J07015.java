/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07015;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.*;
/**
 *
 * @author LGB
 */
public class J07015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("SONGUYEN.in"));
        int[] arr = new int[10001];
        sangnt(arr);
        int[] a =new int[100000];
        for(int i=0;i<100000;i++){
            a[in.readInt()]++;
        }
        for(int i=2;i<100000;i++){
            if(arr[i]==1 && a[i]>0){
                System.out.printf(i +" "+a[i]);
            }
        }
        
              
    }
    public static void sangnt(int[] arr){
        arr[0]=0;
        arr[1]=0;
        
        for(int i=2;i<=10000;i++){
            arr[i]=1;
        }
        
        for(int i=2;i<=Math.sqrt(10000);i++){
            if(arr[i]==1){
                for(int j =2 * i;j<=10000;j+=i){
                    arr[j]=0;
                }
            }
        }
        
    }
}
