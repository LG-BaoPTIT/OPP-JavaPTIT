import java.util.*;
import java.io.*;
        
public class Test4 {
    
    public static boolean check(int n) {
        if (n < 10) return false;
        int k = 10;
        while(n > 0) {
            if (n%10>k) return false;
            k = n% 10;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> v = (List<Integer>) in.readObject();
        int a[] = new int[100005];
        int b[] = new int[100005];
        for (int i : v) {
            if (check(i)) a[i]++;
        }
        
        in =new ObjectInputStream(new FileInputStream("DATA2.in"));
        v = (List<Integer>) in.readObject();
        for (int i : v) {
            if (check(i)) b[i]++;
        }
        for (int i=0; i<100000; i++) {
            if (a[i] > 0 || b[i] > 0) 
                System.out.println(i + " " + a[i] + " "+ b[i]);
        }
        in.close();
    }
}
