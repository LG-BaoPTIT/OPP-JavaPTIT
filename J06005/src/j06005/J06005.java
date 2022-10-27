/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j06005;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus ROG
 */
public class J06005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customers> customerList = new ArrayList();
        ArrayList<Items>  itemList = new ArrayList();
        ArrayList<Bills> billList = new ArrayList();
        for(int i=1;i<=n;i++){
            customerList.add(new Customers(String.valueOf(i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            itemList.add(new Items(String.valueOf(i), sc.nextLine(), sc.nextLine(), Long.valueOf(sc.nextLine()), Long.valueOf(sc.nextLine())));
        }
        n = Integer.parseInt(sc.nextLine());
        
        for(int o =1;o<=n;o++){
            String code1 = sc.next();
            String code2 = sc.next();
            int quanity = Integer.parseInt(sc.next());
            
            
            String customerName="";
            String address="";
            String itemName="";
            String unitOfMeasure="";
            long purchasePrice=0;
            long sellingPrice=0;
            
            
            for(Customers i : customerList){
                if(i.getCustomerCode().equals(code1)){
                    customerName = i.getCustomerName();
                    address = i.getAddress();
                    break;
                }
            }
            for(Items i : itemList){
                if(i.getItemCode().equals(code2)){
                    itemName = i.getItemName();
                    unitOfMeasure = i.getUnitOfMeasure();
                    purchasePrice = i.getPurchasePrice();
                    sellingPrice = i.getSellingPrice();
                    break;
                }
            }
            billList.add(new Bills(String.valueOf(o), customerName, address, itemName,unitOfMeasure,purchasePrice,sellingPrice, quanity));
        }
        for(Bills q : billList){
            System.out.println(q);
        }
    }
    
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/