/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03009;
import java.util.*;
import java.lang.*;
/**
 *
 * @author LGB
 */
public class J03009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] A=new String[100];
            String[] B=new String[100];
            
            tachtu(s1,A);
            tachtu(s2,B);
            List<String> list = Arrays.asList(B);
            List<String> book = new ArrayList<String>();
            for(int i=0;i< A.length;i++){                
                if(kt(A[i],list) && kt(A[i],book)){
                    book.add(A[i]);
                } 
            }
            Collections.sort(book);
            book.forEach(e -> System.out.print(e +" "));
            System.out.println();
        }
        
    }
    public static boolean kt(String A, List list_  ){                  
        if(list_.indexOf(A)>=0){
             return false;
        }      
        return true;
    }
    public static void tachtu(String s,String[] A){   
        StringTokenizer tk= new StringTokenizer(s);
        int g=0;       
        while(tk.hasMoreTokens()){
            String x=tk.nextToken();
            A[g]=x;          
            g++;
        }      
    }
    
}
