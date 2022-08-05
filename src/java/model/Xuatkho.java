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
public class Xuatkho {
    private Integer maXK;
    private Integer soluongtonkho;
    private Integer soluongxuat;
    private Double giatien;
    
    public Xuatkho(Integer maXK, Integer soluongxuat, Integer soluongtonkho, Double giatien){
        this.maXK = maXK;
        this.soluongxuat = soluongxuat;
        this.soluongtonkho = soluongtonkho;
        this.giatien = giatien;
    }
    public Integer getMaXK(){
        return maXK;
    }
    public void setMaXK(Integer maSP){
        this.maXK = maXK;
    }
    
    public Integer getSoLuongXuat(){
        return soluongxuat;
    }
    public void setSoLuongXuat(Integer soluongxuat){
        this.soluongxuat = soluongxuat;
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
