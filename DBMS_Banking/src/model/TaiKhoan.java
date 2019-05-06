/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author 84965
 */
public class TaiKhoan {

    private int TK_ID;
    private String TK_STK;
    private String TK_PIN;
    private BigDecimal TK_Sodu;
    private int KH_CIF;
    private int LTK_ID;
    private int CN_ID;

    public TaiKhoan() {
    }

    public TaiKhoan(int TK_ID, String TK_STK, String TK_PIN, BigDecimal TK_Sodu, int KH_CIF, int LTK_ID, int CN_ID) {
        this.TK_ID = TK_ID;
        this.TK_STK = TK_STK;
        this.TK_PIN = TK_PIN;
        this.TK_Sodu = TK_Sodu;
        this.KH_CIF = KH_CIF;
        this.LTK_ID = LTK_ID;
        this.CN_ID = CN_ID;
    }

    public int getTK_ID() {
        return TK_ID;
    }

    public void setTK_ID(int TK_ID) {
        this.TK_ID = TK_ID;
    }

    public String getTK_STK() {
        return TK_STK;
    }

    public void setTK_STK(String TK_STK) {
        this.TK_STK = TK_STK;
    }

    public String getTK_PIN() {
        return TK_PIN;
    }

    public void setTK_PIN(String TK_PIN) {
        this.TK_PIN = TK_PIN;
    }

    public BigDecimal getTK_Sodu() {
        return TK_Sodu;
    }

    public void setTK_Sodu(BigDecimal TK_Sodu) {
        this.TK_Sodu = TK_Sodu;
    }

    public int getKH_CIF() {
        return KH_CIF;
    }

    public void setKH_CIF(int KH_CIF) {
        this.KH_CIF = KH_CIF;
    }

    public int getLTK_ID() {
        return LTK_ID;
    }

    public void setLTK_ID(int LTK_ID) {
        this.LTK_ID = LTK_ID;
    }

    public int getCN_ID() {
        return CN_ID;
    }

    public void setCN_ID(int CN_ID) {
        this.CN_ID = CN_ID;
    }
    
    

    

}
