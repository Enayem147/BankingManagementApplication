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
public class QuanTri {
    private String QT_ID;
    private String QT_MK;

    public QuanTri() {
    }

    
    public QuanTri(String QT_ID, String QT_MK) {
        this.QT_ID = QT_ID;
        this.QT_MK = QT_MK;
    }

    public String getQT_ID() {
        return QT_ID;
    }

    public void setQT_ID(String QT_ID) {
        this.QT_ID = QT_ID;
    }

    public String getQT_MK() {
        return QT_MK;
    }

    public void setQT_MK(String QT_MK) {
        this.QT_MK = QT_MK;
    }
    
    
}
