import java.math.BigInteger;
import java.util.*;

public class J03013 {
    static Scanner sc = new Scanner(System.in);

    static void Solve() {
        BigInteger a = new BigInteger(sc.next()), b = new BigInteger(sc.next());
        BigInteger res = a.subtract(b);
        res = res.abs();
        int leadZero = Math.max(a.toString().length(), b.toString().length()) - res.toString().length();
        for (int i = 0; i < leadZero; i++)
            System.out.printf("0");
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0)
            Solve();
    }
}