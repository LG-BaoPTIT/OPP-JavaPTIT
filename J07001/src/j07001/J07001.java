/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07001;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author LGB
 */
public class J07001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here
            File file =new File("newfile.in");
            Scanner sc =new Scanner(file);
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ko thay file");
        }
    }
    
}
