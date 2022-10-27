/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06005;

/**
 *
 * @author Asus ROG
 */
public class Items {
    private String itemCode;
    private String itemName;
    private String unitOfMeasure;
    private long purchasePrice;
    private long sellingPrice;

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public long getSellingPrice() {
        return sellingPrice;
    }
    
    
    public Items(String itemCode, String itemName, String unitOfMeasure, long purchasePrice, long sellingPrice) {
        this.itemCode = getItemCode(itemCode);
        this.itemName = itemName;
        this.unitOfMeasure = unitOfMeasure;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }
    
    public String getItemCode(String number){
        StringBuilder x =new StringBuilder();
        x.append("MH");
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
}
