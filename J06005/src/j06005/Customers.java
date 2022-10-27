/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06005;

/**
 *
 * @author Asus ROG
 */
public class Customers {
    private String customerCode;
    private String customerName;
    private String gender;
    private String dateOfBirth;
    private String Address;

    public String getCustomerCode() {
        return customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }
    
    
    public Customers(String number, String customerName, String gender, String dateOfBirth, String Address) {
        this.customerCode = getCustomerCode(number);
        this.customerName = customerName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.Address = Address;
    }
    public String getCustomerCode(String number){
        StringBuilder x =new StringBuilder();
        x.append("KH");
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
