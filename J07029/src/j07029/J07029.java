import java.util.*;
import java.io.*;

public class J07029 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        int f[] = new int[1000000];
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for (int i = 2; i < 1000; i++)
            if (f[i] == 1)
                for (int j = i * i; j < 1000000; j += i)
                    f[j] = 0;
        List<Integer> l = (ArrayList<Integer>) in.readObject();
        int[] a = new int[1000001];
        for (Integer tmp : l)
            a[tmp] += f[tmp];
        int count = 0;
        for (int i = 1000000; i >= 2; i--) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
                count++;
                if (count == 10)
                    break;
            }
        }
        in.close();
    }
}