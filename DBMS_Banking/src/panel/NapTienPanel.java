/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import connection.Connect;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author 84965
 */
public class NapTienPanel extends javax.swing.JPanel {

    Connect connection = new Connect();
    Connection conn = connection.getConnection();
    DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
    private BigDecimal soTien = new BigDecimal(0);

    public NapTienPanel() {
        initComponents();
        this.setPreferredSize(new Dimension(668, 445));
    }

    private double convertDecimalToDouble(BigDecimal money) {
        return Double.parseDouble(money.toString());
    }

    private void getDialogReview(String stk, String chuTK, String tien_truoc, String sotien, String tien_sau) {
        String[] options = {"Xác nhận"};
        String title = "Thông tin giao dịch";
        String content = "Số tài khoản:                " + stk + ""
                + "\nChủ tài khoản:             " + chuTK + ""
                + "\nSố tiền trước khi nạp:" + tien_truoc
                + "\nSố tiền đã nạp:           " + sotien
                + "\nSố tiền sau khi nạp:   " + tien_sau;
        int selection = JOptionPane.showOptionDialog(null, content, title,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
                options[0]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_STN = new javax.swing.JTextField();
        bt_NAP = new javax.swing.JButton();
        bt_HUY = new javax.swing.JButton();
        txt_CMND = new javax.swing.JTextField();
        txt_STK = new javax.swing.JTextField();
        txt_CTK = new javax.swing.JTextField();
        txt_STTTK = new javax.swing.JTextField();
        bt_TIM_CMND = new javax.swing.JButton();
        bt_TIM_STK = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setText("Chứng minh thư :");

        jLabel3.setText("Số Tài Khoản:");

        jLabel5.setText("Chủ Tài Khoản:");

        jLabel6.setText("Số Tiền Trong Tài Khoản: ");

        jLabel7.setText("Số Tiền Muốn Nạp:");

        txt_STN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_STNActionPerformed(evt);
            }
        });

        bt_NAP.setText("Nạp");
        bt_NAP.setEnabled(false);
        bt_NAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_NAPActionPerformed(evt);
            }
        });

        bt_HUY.setText("Hủy");
        bt_HUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_HUYActionPerformed(evt);
            }
        });

        txt_CTK.setEnabled(false);
        txt_CTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CTKActionPerformed(evt);
            }
        });

        txt_STTTK.setEnabled(false);

        bt_TIM_CMND.setText("Tìm");
        bt_TIM_CMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TIM_CMNDActionPerformed(evt);
            }
        });

        bt_TIM_STK.setText("Tìm");
        bt_TIM_STK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TIM_STKActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("đ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(33, 33, 33))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CTK, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_TIM_CMND))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_STN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_STK, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_TIM_STK))
                            .addComponent(txt_STTTK, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_NAP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(bt_HUY, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_TIM_CMND))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_STK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_TIM_STK)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_STTTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_STN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_NAP)
                    .addComponent(bt_HUY))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_TIM_STKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TIM_STKActionPerformed
        CallableStatement cs = null;
        ResultSet rs = null;
        if (!txt_STK.getText().equals("")) {
            try {
                String stk = txt_STK.getText();
                cs = conn.prepareCall("{call TIM_TK_STK(?)}");
                cs.setString(1, stk);
                rs = cs.executeQuery();
                if (rs.first()) {
                    txt_CMND.setText(rs.getString("KH_CMND"));
                    txt_CTK.setText(rs.getString("KH_HOTEN"));
                    txt_STTTK.setText(decimalFormat.format(rs.getBigDecimal("TK_SODU")) + " đ");
                    soTien = rs.getBigDecimal("TK_SODU");
                    txt_CMND.setEnabled(false);
                    txt_STK.setEnabled(false);
                    bt_NAP.setEnabled(true);
                    bt_HUY.setEnabled(true);
                    setStatus(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Số tài khoản không đúng");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Số tài khoản không đúng");
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
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tài khoản");
        }
    }//GEN-LAST:event_bt_TIM_STKActionPerformed

    private void setStatus(boolean status) {
        txt_CMND.setEnabled(status);
        txt_STK.setEnabled(status);
        bt_TIM_CMND.setEnabled(status);
        bt_TIM_STK.setEnabled(status);
        bt_NAP.setEnabled(!status);
    }
    private void bt_TIM_CMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TIM_CMNDActionPerformed
        CallableStatement cs = null;
        ResultSet rs = null;
        if (!txt_CMND.getText().equals("")) {
            try {
                String cmnd = txt_CMND.getText();
                cs = conn.prepareCall("{call TIM_TK_CMND(?)}");
                cs.setString(1, cmnd);
                rs = cs.executeQuery();
                int count = 0;
                rs.last();
                count = rs.getRow();
                if (count > 1) {
                    rs.first();
                    String[] arr = new String[count];
                    int i = 0;
                    arr[i] = rs.getString("TK_STK");
                    while (rs.next()) {
                        i++;
                        arr[i] = rs.getString("TK_STK");
                    }
                    getSTKDialog(arr);
                } else {
                    if (rs.first()) {
                        txt_STK.setText(rs.getString("TK_STK"));
                        txt_CTK.setText(rs.getString("KH_HOTEN"));
                        txt_STTTK.setText(decimalFormat.format(rs.getBigDecimal("TK_SODU")) + " đ");
                        soTien = rs.getBigDecimal("TK_SODU");
                        setStatus(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Số chứng minh không đúng");
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Số chứng minh không đúng");
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
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số chưng minh thư");
        }
    }//GEN-LAST:event_bt_TIM_CMNDActionPerformed

    private void txt_CTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CTKActionPerformed

    }//GEN-LAST:event_txt_CTKActionPerformed

    private void bt_HUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HUYActionPerformed
        resetFields();
    }//GEN-LAST:event_bt_HUYActionPerformed

    private void bt_NAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_NAPActionPerformed
        CallableStatement cs = null;
        try {
            BigDecimal TIEN_NHAP = new BigDecimal(txt_STN.getText());
            if (convertDecimalToDouble(TIEN_NHAP) >= 10000) {
                try {
                    String STK = txt_STK.getText();
                    cs = conn.prepareCall("{call NAP_TIEN(?,?)}");
                    cs.setString(1, STK);
                    cs.setBigDecimal(2, TIEN_NHAP);
                    if (cs.executeUpdate() > 0) {
                        String tien_truoc = txt_STTTK.getText();
                        String chuTK = txt_CTK.getText();
                        String sotien = decimalFormat.format(TIEN_NHAP) + " đ";
                        String tien_sau = decimalFormat.format(new BigDecimal((convertDecimalToDouble(soTien)) + convertDecimalToDouble(TIEN_NHAP))) + " đ";
                        bt_NAP.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "Nạp tiền thành công");
                        resetFields();
                        getDialogReview(STK, chuTK, tien_truoc, sotien, tien_sau);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Số tiền nhập vào phải là số");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
                } finally {
                    //giải phóng tài nguyên khi không sử dụng nữa
                    if (cs != null) {
                        try {
                            cs.close();
                        } catch (SQLException sqlEx) {
                        } //đoạn mã xử lý ng/lệ
                        cs = null;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Số tiền nạp vào phải lớn hơn 10.000 VNĐ");
            }
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Số tiền nhập vào không hợp lệ");
        }

    }//GEN-LAST:event_bt_NAPActionPerformed

    private void txt_STNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_STNActionPerformed

    }//GEN-LAST:event_txt_STNActionPerformed

    private void getSTKDialog(String stk_list[]) {
        final JComboBox<String> combo = new JComboBox<>(stk_list);
        String[] options = {"Xác nhận", "Trở về"};

        String title = "Chọn tài khoản";
        int selection = JOptionPane.showOptionDialog(null, combo, title,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
                options[0]);

        if (selection >= 0) {
            if (options[selection].equals("Xác nhận")) {
                String stk = combo.getSelectedItem().toString();
                if (stk != null) {
                    CallableStatement cs = null;
                    ResultSet rs = null;
                    try {
                        cs = conn.prepareCall("{call TIM_TK_STK(?)}");
                        cs.setString(1, stk);
                        rs = cs.executeQuery();
                        while (rs.next()) {
                            txt_STK.setText(stk);
                            txt_CTK.setText(rs.getString("KH_HOTEN"));
                            txt_STTTK.setText(decimalFormat.format(rs.getBigDecimal("TK_SODU")) + " đ");
                            soTien = rs.getBigDecimal("TK_SODU");
                            setStatus(false);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Số tài khoản không đúng");
                    }

                }
            }
        }
    }

    private void resetFields() {
        txt_CMND.setText("");
        txt_CMND.setEnabled(true);
        txt_STK.setText("");
        txt_STK.setEnabled(true);
        txt_CTK.setText("");
        txt_STN.setText("");
        txt_STTTK.setText("");
        bt_TIM_CMND.setEnabled(true);
        bt_TIM_STK.setEnabled(true);
        bt_NAP.setEnabled(false);
        bt_HUY.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_HUY;
    private javax.swing.JButton bt_NAP;
    private javax.swing.JButton bt_TIM_CMND;
    private javax.swing.JButton bt_TIM_STK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CMND;
    private javax.swing.JTextField txt_CTK;
    private javax.swing.JTextField txt_STK;
    private javax.swing.JTextField txt_STN;
    private javax.swing.JTextField txt_STTTK;
    // End of variables declaration//GEN-END:variables

}
