/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j08013;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Asus ROG
 */
public class J08013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n,k;
            n =sc.nextLong();
            k=sc.nextLong();
            long[] arr = new long[100005];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            System.out.println(solve(arr,k));
        }
    }
        
    
        public static long solve(long[] a, long k) {
            long count = 0;
            HashMap<Long, Long> hm = new HashMap<>();
            for(int i=0; i < a.length; i++) {
                if(!hm.containsKey(a[i])) hm.put(a[i], (long)1);
                else hm.put(a[i], hm.get(a[i]) + 1);
            }
            for (int i=0; i < a.length; i ++) {
                if(hm.get(k-a[i]) != null ) count += hm.get(k-a[i]);
                if(k-a[i] == a[i]) count--;
        }
        return count/2;
    }
    
}
/*
4

4 6

1 5 7 -1

5 6

1 5 7 -1 5

4 2

1 1 1 1

13 11

10 12 10 15 -1 7 6 5 4 2 1 1 1
*/

