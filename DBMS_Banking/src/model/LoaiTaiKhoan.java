/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 84965
 */
public class LoaiTaiKhoan {
    private int LTK_ID;
    private String LTK_Ten;

    public LoaiTaiKhoan() {
    }
    
    public LoaiTaiKhoan(int LTK_ID, String LTK_Ten) {
        this.LTK_ID = LTK_ID;
        this.LTK_Ten = LTK_Ten;
    }

    public int getLTK_ID() {
        return LTK_ID;
    }

    public void setLTK_ID(int LTK_ID) {
        this.LTK_ID = LTK_ID;
    }

    public String getLTK_Ten() {
        return LTK_Ten;
    }

    public void setLTK_Ten(String LTK_Ten) {
        this.LTK_Ten = LTK_Ten;
    }
    
    
    
    
}
