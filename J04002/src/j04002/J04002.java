/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04002;

import java.util.*;

/**
 *
 * @author LGB
 */
public class J04002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        Rectange A=new Rectange();
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        String x3=sc.next();
        if(x1<=0 || x2<=0){
            System.out.print("INVALID");
        }
        else{
            A.setWidth(x1);
            A.setHeight(x2);
            A.setColor(x3);
            System.out.printf("%.0f",A.findPerimeter());
            System.out.print(" ");
            System.out.printf("%.0f",A.findArea());
            System.out.print(" ");
            System.out.println(A.getColor());
        }
       
       
    }
    
    
    public static class Rectange {
        private double width;
        private double height;
        private String color;
        private void Rectange(){
            this.width=1;
            this.height=1;
        }
        public void Rectange(double width,double height,String color ){
            this.width=width;
            this.height=height;
            this.color=color;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            StringBuilder x=new StringBuilder();
           x.append(Character.toUpperCase(color.charAt(0)));
            for(int i=1;i<color.length();i++){            
                    x.append(Character.toLowerCase(color.charAt(i)));             
            }
            this.color = x.toString();
        }
        public double findArea(){
            return (this.height*this.width);
        }
        public double findPerimeter(){
            return (this.height+this.width)*2;
        }
    }
}
