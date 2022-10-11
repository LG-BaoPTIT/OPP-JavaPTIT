/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test11;

/**
 *
 * @author LGB
 */
public class Team {
    private String mst;
    private String tenteam;
    private String truong;

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getTenteam() {
        return tenteam;
    }

    public void setTenteam(String tenteam) {
        this.tenteam = tenteam;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public Team(String mst, String tenteam, String truong) {
        StringBuilder s= new StringBuilder();
        s.append("Team");
        if(mst.length()==1){
            s.append("0");
            s.append(mst);
        }
        else {
            s.append(mst);
        }
        
        this.mst = s.toString();
        this.mst = mst;
        this.tenteam = tenteam;
        this.truong = truong;
    }
    
}
