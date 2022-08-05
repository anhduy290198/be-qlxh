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
public class Sanpham {
    private Integer maSP;
    private String tenSP;
    private Integer soluongtonkho;
    private Double giatien;
    
    
    public Sanpham(Integer maSP, String tenSP, Integer soluongtonkho, Double giatien){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soluongtonkho = soluongtonkho;
        this.giatien = giatien;
    }
    public Integer getMaSP(){
        return maSP;
    }
    public void setMaSP(Integer maSP){
        this.maSP = maSP;
    }
    
    public String getTenSP(){
        return tenSP;
    }
    public void setTenSP(String tenSP){
        this.tenSP = tenSP;
    }
    
    public Integer getSoLuongTonKho(){
        return soluongtonkho;
    }
    public void setSoLuongTonKho(Integer soluongtonkho){
        this.soluongtonkho = soluongtonkho;
    }
    
    public Double getGiaTien(){
        return giatien;
    }
    public void setGiaTien(Double giatien){
        this.giatien = giatien;
    }
}
