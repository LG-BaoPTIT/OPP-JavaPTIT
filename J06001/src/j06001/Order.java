/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06001;

/**
 *
 * @author LGB
 */
public class Order implements Comparable{
    private String code;
    private String name;
    private long discount;
    private long totalCost;

    public long getTotalCost() {
        return totalCost;
    }
    
    public Order(String billCode,int oderNumber, String name, long unitPrice, long quanity) {
        this.code = String.format("%s-%03d", billCode, oderNumber);
        this.name = name;
        this.discount = getDiscount(unitPrice, quanity);
        this.totalCost = getTotalCost(unitPrice , quanity);
    }
    public long getDiscount(long unitPrice , long quanity){
        long cost = unitPrice * quanity;
        if(quanity >= 150 ) return cost * 50 / 100;
        if(quanity >= 100) return cost * 30 / 100;
        if(quanity >= 50) return cost * 15 / 100;
        return 0;
    }
    public long getTotalCost(long unitPrice , long quanity){
        return unitPrice * quanity - this.discount;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + discount + " " + totalCost ;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return -(int)(this.totalCost-((Order)o).totalCost);
    }
    
}
