/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import connection.Connect;
import frame.MainFrame;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 84965
 */
public class LapTaiKhoanMoiPanel extends javax.swing.JPanel {

    Connect connect = new Connect();
    Connection conn = connect.getConnection();

    /**
     * Creates new form QuanLyTaiKhoanPanel
     */
    public LapTaiKhoanMoiPanel() {
        initComponents();
        this.setPreferredSize(new Dimension(668, 445));
        loadComboBoxChiNhanh();
        loadComboBoxLoaiTK();
    }

    public void loadComboBoxChiNhanh() {
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall("{call LOAD_CHI_NHANH()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                cbChiNhanh.addItem(rs.getString("CN_TEN"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LapTaiKhoanMoiPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//giải phóng tài nguyên khi không sử dụng nữa
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                } //đoạn mã xử lý ng/lệ
                rs = null;
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException sqlEx) {
                } //đoạn mã xử lý ng/lệ
                cs = null;
            }

        }

    }

    public void loadComboBoxLoaiTK() {

        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall("{call LOAD_LOAI_TK()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                cbLoaiThe.addItem(rs.getString("LTK_TEN"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LapTaiKhoanMoiPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//giải phóng tài nguyên khi không sử dụng nữa
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                } //đoạn mã xử lý ng/lệ
                rs = null;
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException sqlEx) {
                } //đoạn mã xử lý ng/lệ
                cs = null;
            }

        }
    }

    public int getMaChiNhanh(String tenChiNhanh) {
        int maChiNhanh = 0;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        try {
            pStmt = conn.prepareStatement("SELECT LAY_MA_CN(?) AS CN_MA");
            pStmt.setString(1, tenChiNhanh);
            rs = pStmt.executeQuery();
            if (rs.first()) {
                maChiNhanh = rs.getInt("CN_MA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
        } finally {
            if (pStmt != null) {
                try {
                    pStmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.toString());
                }
                pStmt = null;
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }
        }
        return maChiNhanh;
    }

    public int getMaLoaiThe(String tenLoaiTK) {
        int maLoaiThe = 0;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        try {
            pStmt = conn.prepareStatement("SELECT LAY_MA_LTK(?) AS LTK_MA");
            pStmt.setString(1, tenLoaiTK);
            rs = pStmt.executeQuery();
            if (rs.first()) {
                maLoaiThe = rs.getInt("LTK_MA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
        } finally {
            if (pStmt != null) {
                try {
                    pStmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.toString());
                }
                pStmt = null;
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }
        }
        return maLoaiThe;
    }

    public Long max(long a, long b) {
        return (a > b) ? a : b;
    }

    public int countAccount(int cif) {
        int count = 0;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        try {
            pStmt = conn.prepareStatement("SELECT SO_LUONG_TK(?) AS COUNT");
            pStmt.setInt(1, cif);
            rs = pStmt.executeQuery();
            if (rs.first()) {
                count = rs.getInt("COUNT");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
        } finally {
            if (pStmt != null) {
                try {
                    pStmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.toString());
                }
                pStmt = null;
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }
        }
        return count;
    }

    public String convertNumber(int count) {
        String accNum = "";
        if (count < 10) {
            accNum = "0" + count;
        } else {
            accNum = count + "";
        }
        return accNum;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnMoTaiKhoan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbChiNhanh = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbLoaiThe = new javax.swing.JComboBox();
        txtTenKH = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCIF = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));

        btnMoTaiKhoan.setText("Mở tài khoản");
        btnMoTaiKhoan.setAutoscrolls(true);
        btnMoTaiKhoan.setEnabled(false);
        btnMoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoTaiKhoanActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên khách hàng : ");

        jLabel2.setText("Số chứng minh thư : ");

        jLabel3.setText("Chi nhánh :");

        jLabel4.setText("Loại thẻ : ");

        cbLoaiThe.setToolTipText("");

        txtTenKH.setToolTipText("");

        jLabel5.setText("Mã khách hàng :");
        jLabel5.setToolTipText("");

        btnTimKiem.setText("Tìm");
        btnTimKiem.setAutoscrolls(true);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbChiNhanh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbLoaiThe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnMoTaiKhoan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHuy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCIF))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbLoaiThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoTaiKhoan)
                    .addComponent(btnHuy))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoTaiKhoanActionPerformed
        // TODO add your handling code here:
        int cif = Integer.parseInt(txtCIF.getText());
        String pin = "" + ((int) (Math.random() * 900000) + 100000);
        String accNum = convertNumber(countAccount(cif) + 1);
        double sodu = 100000;
        int loaiTaiKhoan = getMaLoaiThe(cbLoaiThe.getSelectedItem().toString());
        int chiNhanh = getMaChiNhanh(cbChiNhanh.getSelectedItem().toString());
        String soTaiKhoan = convertNumber(chiNhanh) + cif + accNum;

        // insert vào csdl
        CallableStatement cs = null;
        try {
            cs = conn.prepareCall("{call LAP_TAI_KHOAN(?,?,?,?,?,?)}");
            cs.setString(1, soTaiKhoan);
            cs.setString(2, pin);
            cs.setDouble(3, sodu);
            cs.setInt(4, cif);
            cs.setInt(5, loaiTaiKhoan);
            cs.setInt(6, chiNhanh);
            if (cs.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Mở tài khoản thành công");
                resetFields();
            } else {
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
        } finally {
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.toString());
                }
                cs = null;
            }
        }
    }//GEN-LAST:event_btnMoTaiKhoanActionPerformed

    private void resetFields() {
        txtCIF.setText("");
        txtCMND.setText("");
        txtTenKH.setText("");
        txtCMND.setEnabled(true);
        btnMoTaiKhoan.setEnabled(false);
        btnTimKiem.setEnabled(true);
    }
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        resetFields();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        CallableStatement cs = null;
        ResultSet rs = null;
        String cmnd = txtCMND.getText();
        if (!cmnd.equals("")) {
            try {
                // TODO add your handling code here:
                cs = conn.prepareCall("{call TIM_KH_CMND(?)}");
                cs.setString(1, cmnd);
                rs = cs.executeQuery();
                if (rs.first()) {
                    txtCMND.setEnabled(false);
                    txtCIF.setText(Integer.toString(rs.getInt("KH_CIF")));
                    txtTenKH.setText(rs.getString("KH_HOTEN"));
                    txtCMND.setEnabled(false);
                    btnMoTaiKhoan.setEnabled(true);
                    btnTimKiem.setEnabled(false);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Chứng minh thư không đúng");
            } finally {
                if (cs != null) {
                    try {
                        cs.close();
                    } catch (SQLException sqlEx) {
                        System.out.println(sqlEx.toString());
                    }
                    cs = null;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập chứng minh thư");
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnMoTaiKhoan;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbChiNhanh;
    private javax.swing.JComboBox cbLoaiThe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtCIF;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JLabel txtTenKH;
    // End of variables declaration//GEN-END:variables
}
