/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05006;

/**
 *
 * @author LGB
 */
public class Nhanvien implements Comparable {
    private String ms;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    private String mst;
    private String ngayki;
    public Nhanvien(String ms,String ten,String gioitinh,String ngaysinh,String diachi,String mst,String ngayki){
        
       StringBuilder x= new StringBuilder();
       for(int i=1;i<=5-ms.length();i++){
           x.append("0");
       }
       x.append(ms);
       this.ms=x.toString();
       
       this.ten=ten;
       this.gioitinh=gioitinh;
       this.ngaysinh=ngaysinh;
       this.diachi=diachi;
       this.mst=mst;
       this.ngayki=ngayki;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }
    
    @Override
    public String toString() {
        return ms + " " + ten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + mst + " " + ngayki;
    }

    @Override
    public int compareTo(Object o) {
        String x=((Nhanvien)o).getNgaysinh();
        String[] split1=x.split("/");
        StringBuilder z=new StringBuilder();
        for(int i=2;i>=0;i--){
           z.append(split1[i]);       
        }
        
        String y=this.ngaysinh;
        String[] split2=y.split("/");
        StringBuilder h=new StringBuilder();
        for(int i=2;i>=0;i--){
           h.append(split2[i]);       
        }
        String a=z.toString();
        String b=h.toString();
        
        return b.compareTo(a);
    }
    
}
