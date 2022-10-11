/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05028;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author LGB
 */
public class J05028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("DN.in");
        Scanner sc =new Scanner(file);
        int t= Integer.parseInt(sc.nextLine());
       
        ArrayList<Congty> list = new ArrayList();
        while(t-->0){
            String ms=sc.nextLine();
            String ten=sc.nextLine();
            String soluong=sc.nextLine();
            list.add(new Congty(ms,ten,Integer.valueOf(soluong)));
        }
        Collections.sort(list);
        for(Congty i : list){             
                System.out.println(i);             
            }
        
    }
    
}
