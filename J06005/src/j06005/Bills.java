/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06005;

/**
 *
 * @author Asus ROG
 */
public class Bills {
    private String billCode;
    private String customerName;
    private String address;
    private String itemName;
    private String unitOfMeasure;
    private long purchasePrice;
    private long sellingPrice;;
    private int quanity;
    private long totalCost;

    public Bills(String number, String customerName, String address, String itemName, String unitOfMeasure, long purchasePrice, long sellingPrice, int quanity) {
        this.billCode = getBillCode(number);
        this.customerName = customerName;
        this.address = address;
        this.itemName = itemName;
        this.unitOfMeasure = unitOfMeasure;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.quanity = quanity;
        this.totalCost = sellingPrice * quanity;
    }
    public String getBillCode(String number){
        StringBuilder x =new StringBuilder();
        x.append("HD");
        if(number.length()==1){
            x.append("00");
            x.append(number);
        }
        else {
            if(number.length()==2){
                x.append("0");
                x.append(number);
            }
            else{
                x.append(number);
            }
        }
        return x.toString();
    }

    @Override
    public String toString() {
        return  billCode + " " + customerName + " " + address + " " + itemName + " " + unitOfMeasure + " " + purchasePrice + " " + sellingPrice + " " + quanity + " " + totalCost ;
    }
    
}
