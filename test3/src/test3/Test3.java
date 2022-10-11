/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author LGB
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MATRIX.in");
        Scanner sc = new Scanner(file);
        String t=sc.nextLine();
        int x=Integer.parseInt(t);
        while(x-->0){
            String tmp = sc.nextLine();
            StringTokenizer tk = new StringTokenizer(tmp);
            int n=Integer.parseInt(tk.nextToken());
            int m=Integer.parseInt(tk.nextToken());
            int l=Integer.parseInt(tk.nextToken());
            int[][] a = new int[105][105];
            tmp=sc.nextLine();
            StringTokenizer tk2 = new StringTokenizer(tmp);
            
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                          a[i][j]=Integer.parseInt(tk2.nextToken());
                }                
            }
            
            ArrayList<Integer> arr = new ArrayList();
            for(int i=1;i<=n;i++){
                arr.add(a[i][l]);
            }
            Collections.sort(arr);
            for(int i=1;i<=n;i++){
                a[i][l]=arr.get(i-1);
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                         System.out.print(a[i][j]+" ");
                }          
                System.out.println("");
            }
        }
    }
    
}
