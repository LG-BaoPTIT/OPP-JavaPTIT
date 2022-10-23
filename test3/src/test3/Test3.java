import java.io.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner (new File("DATA.in"));
        long ans = 0;
        while(in.hasNext()) {
            String s = in.next();
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                try {
                    ans += Long.parseLong(s);
                } catch (Exception ex) {
                
                }
            }
        }
        System.out.println(ans);
    }
}