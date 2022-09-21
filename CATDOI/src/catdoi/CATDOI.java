
package catdoi;
import java.util.Scanner;
/**
 *
 * @author LGB
 */
public class CATDOI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){        
            String s = sc.next();
            
            catdoi(s);
            System.out.println();
            t--;
        }
    }
    public static void catdoi(String s){
        char[] b = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char kytu = s.charAt(i);
            if( kytu != '0' && kytu != '1' && kytu != '8' &&kytu != '9'){
                System.out.print("INVALID");
               return;
            }
            if(kytu == '0') b[i]='0';
            if(kytu == '1') b[i]='1';
            if(kytu == '8') b[i]='0';
            if(kytu == '9') b[i]='0';
            
        }
        String str = String.valueOf(b);
        Long x= Long.valueOf(str);
        if(x==0){
            System.out.print("INVALID");
        }
        else {
            System.out.print(x);
        }
        
        
    }
    
}
