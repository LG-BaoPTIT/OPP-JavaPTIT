/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05032;

/**
 *
 * @author LGB
 */
public class Nguoi implements Comparable{
    private String ten;
    private String ns;
    private  String ts;
    private String nams;
    
    public Nguoi(String ten, String ns,String ts,String nams){
        this.ten=ten;
        this.ns=ns;
        this.ts=ts;
        this.nams=nams;       
    }

    public String getTen() {
        return ten;
    }

    public String getNs() {
        return ns;
    }

    public String getTs() {
        return ts;
    }

    public String getNams() {
        return nams;
    }

    @Override
    public String toString() {
        return  ten ;
    }

    @Override
    public int compareTo(Object o) {
       StringBuilder x=new StringBuilder();
       StringBuilder y=new StringBuilder();
       x.append(this.nams);
        x.append(this.ts);
        x.append(this.ns);
       y.append(((Nguoi)o).getNams());
       y.append(((Nguoi)o).getTs());
       y.append(((Nguoi)o).getNs());
       return y.toString().compareTo(x.toString());
    }
    
}
