/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j08020;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Asus ROG
 */
public class J08020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t =Integer.parseInt(sc.nextLine());
            
            while(t-->0){
                String s =sc.nextLine();
                Stack<Character> st = new Stack();
                for(int i =0;i<s.length();i++){
                    if(s.charAt(i)=='(' ||s.charAt(i)=='[' ||s.charAt(i)=='{' ){
                        st.add(s.charAt(i));
                    }
                    else{
                        if(!st.empty()){
                            if (s.charAt(i) == ']' && st.peek() == '[') st.pop();
                            else if (s.charAt(i) == ')' && st.peek() == '(') st.pop();
                            else if (s.charAt(i) == '}' && st.peek() == '{') st.pop();    
                        

                        }
                    }
                }
                if(st.empty()){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
    }
    
}

//[()]{}{[()()]()}
//
//[(])