/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07017;
import java.math.*;
/**
 *
 * @author LGB
 */
class Pair<T0, T1> {
    private int T0;
    private int T1;
    
    public Pair(int key, int value){
        this.T0 = key;
        this.T1 = value;      
    }
    private boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(){
        if(isPrimeNumber(T0) && isPrimeNumber(T1)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return T0 + " " + T1;
    }
    
}
