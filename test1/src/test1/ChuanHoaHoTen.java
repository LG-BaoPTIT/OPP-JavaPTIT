/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.StringTokenizer;
public class ChuanHoaHoTen {
    private String ten;
    private String gioitinh;
    private String namsinh;

    public ChuanHoaHoTen(String s) {
        String[] str = s.split("|");
        
        String a = str[0].toLowerCase();
        StringTokenizer tk= new StringTokenizer(a);
        StringBuilder kq = new StringBuilder();
        while(tk.hasMoreTokens()){
            String x=tk.nextToken();
            kq.append(Character.toUpperCase(x.charAt(0)));
           for(int i=1;i<x.length();i++){
                    kq.append(x.charAt(i));
           }
                kq.append(" ");
        }
        
        this.ten = kq.toString().trim();;
        if(str[1].equals("true")){
            this.gioitinh = "Mr";
        }
        else {
            this.gioitinh = "Miss";
        }
        
        this.namsinh = str[2];
    }

    @Override
    public String toString() {
        return gioitinh+ " " + ten  + " " + namsinh;
    }
    
    
}
