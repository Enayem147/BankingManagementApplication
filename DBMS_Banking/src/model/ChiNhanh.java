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
public class ChiNhanh {
    private int CN_ID;
    private String CN_TEN;

    public ChiNhanh() {
    }

    public ChiNhanh(int CN_ID, String CN_TEN) {
        this.CN_ID = CN_ID;
        this.CN_TEN = CN_TEN;
    }

    public int getCN_ID() {
        return CN_ID;
    }

    public void setCN_ID(int CN_ID) {
        this.CN_ID = CN_ID;
    }

    public String getCN_TEN() {
        return CN_TEN;
    }

    public void setCN_TEN(String CN_TEN) {
        this.CN_TEN = CN_TEN;
    }
    
    
}
