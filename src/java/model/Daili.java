/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Daili {
    private String thanhpho;
    private String quan;
    private String phuong;
    private String diachi;
    
    public Daili(String thanhpho, String quan, String phuong, String diachi) {
        this.thanhpho = thanhpho;
        this.quan = quan;
        this.phuong = phuong;
        this.diachi = diachi;
    }

    

    public String getThanhPho() {
        return thanhpho;
    }

    public void setThanhPho(String thanhpho) {
        this.thanhpho = thanhpho;
    }
    
    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }
    
    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }
    
    public String getDiachi() {
        return diachi;
    }

    public void setDiaChi(String diachi) {
        this.diachi = diachi;
    }

    
}
