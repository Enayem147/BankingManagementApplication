package model;

import java.util.Date;

public class KhachHang {

    private int KH_CIF;
    private String KH_HOTEN;
    private String KH_CMND;
    private String KH_NGAYSINH;
    private String KH_DIACHI;

    public KhachHang(int KH_CIF, String KH_HOTEN, String KH_CMND, String KH_NGAYSINH, String KH_DIACHI) {
        this.KH_CIF = KH_CIF;
        this.KH_HOTEN = KH_HOTEN;
        this.KH_CMND = KH_CMND;
        this.KH_NGAYSINH = KH_NGAYSINH;
        this.KH_DIACHI = KH_DIACHI;
    }

    public KhachHang() {
    }

    public int getKH_CIF() {
        return KH_CIF;
    }

    public void setKH_CIF(int KH_CIF) {
        this.KH_CIF = KH_CIF;
    }

    public String getKH_HOTEN() {
        return KH_HOTEN;
    }

    public void setKH_HOTEN(String KH_HOTEN) {
        this.KH_HOTEN = KH_HOTEN;
    }

    public String getKH_CMND() {
        return KH_CMND;
    }

    public void setKH_CMND(String KH_CMND) {
        this.KH_CMND = KH_CMND;
    }

    public String getKH_NGAYSINH() {
        return KH_NGAYSINH;
    }

    public void setKH_NGAYSINH(String KH_NGAYSINH) {
        this.KH_NGAYSINH = KH_NGAYSINH;
    }

    public String getKH_DIACHI() {
        return KH_DIACHI;
    }

    public void setKH_DIACHI(String KH_DIACHI) {
        this.KH_DIACHI = KH_DIACHI;
    }

}
