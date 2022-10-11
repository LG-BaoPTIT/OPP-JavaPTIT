/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07071;

/**
 *
 * @author LGB
 */
public class Persons implements Comparable{
    private String hten;
    private String viettat;
    private String ho;
    private String ten;
    
    public String getTen() {
        return ten;
    }

    public String getViettat() {
        return viettat;
    }

    public String getHten() {
        return hten;
    }

    public String getHo() {
        return ho;
    }
    
    public Persons(String ten) {
        this.hten = ten;
        String[] str = ten.split(" ");
        this.ho=str[0];
        this.ten=str[str.length-1];
        StringBuilder x= new StringBuilder();
        for(String i : str){
           x.append(i.charAt(0));
        }
        this.viettat=x.toString();
    }

    @Override
    public int compareTo(Object o) {
       int x = ((Persons)o).getTen().compareTo(this.ten);
       if(x==0){
           return -((Persons)o).getHo().compareTo(this.ho);
       }
       else{
           return -x;
       }
    }

    @Override
    public String toString() {
        return  hten ;
    }
    
}
