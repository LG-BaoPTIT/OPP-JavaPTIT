/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test9;

/**
 *
 * @author LGB
 */
public class Detai {
    private String gv;
    private String tendetai;
    private String madetai;
    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public String getTendetai() {
        return tendetai;
    }

    public void setTendetai(String tendetai) {
        this.tendetai = tendetai;
    }

    public String getMadetai() {
        return madetai;
    }

    public void setMadetai(String madetai) {
        this.madetai = madetai;
    }

    public Detai(String gv, String tendetai, String madetai) {
        this.gv = gv;
        this.tendetai = tendetai;
        StringBuilder s = new StringBuilder();
        if(madetai.length()==1){
            s.append("DT00");
            s.append(madetai);
        }
        if(madetai.length()==2){
            s.append("DT02");
            s.append(madetai);
        }
        if(madetai.length()==3){
            s.append("DT");
            s.append(madetai);
        }
        
        this.madetai = s.toString();
    }
    
    
    
}
