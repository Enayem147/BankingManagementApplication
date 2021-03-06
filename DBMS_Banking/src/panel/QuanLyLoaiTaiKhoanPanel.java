/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import connection.Connect;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.LoaiTaiKhoan;
import model.TaiKhoan;

/**
 *
 * @author 84965
 */
public class QuanLyLoaiTaiKhoanPanel extends javax.swing.JPanel {

    Connect connect = new Connect();
    Connection conn = connect.getConnection();

    /**
     * Creates new form QuanLyLoaiTaiKhoan
     */
    public QuanLyLoaiTaiKhoanPanel() {
        initComponents();
        this.setPreferredSize(new Dimension(668, 445));
        loadTable();
    }

    private ArrayList<LoaiTaiKhoan> getListTK() {
        ArrayList<LoaiTaiKhoan> list = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall("{call DS_LOAI_TK()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("LTK_ID");
                String ten = rs.getString("LTK_TEN");
                list.add(new LoaiTaiKhoan(id, ten));
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
        return list;
    }

    private void loadTable() {
        String[] titles = {"Mã loại tài khoản", "Tên loại tài khoản"};
        DefaultTableModel model = new DefaultTableModel(titles, 0);
        ArrayList<LoaiTaiKhoan> list = getListTK();
        for (int i = 0; i < list.size(); i++) {
            Vector row = new Vector();
            row.add(list.get(i).getLTK_ID());
            row.add(list.get(i).getLTK_Ten());
            model.addRow(row);
        }
        tbLoaiTaiKhoan.setDefaultEditor(Object.class, null);
        tbLoaiTaiKhoan.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoaiTaiKhoan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Danh sách tài khoản");

        setBackground(new java.awt.Color(242, 242, 242));

        tbLoaiTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbLoaiTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbLoaiTaiKhoanMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbLoaiTaiKhoan);

        jLabel1.setText("Mã loại :");

        txtMaLoai.setEnabled(false);

        txtTenLoai.setEnabled(false);

        jLabel2.setText("Tên loại : ");

        btnThem.setText("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(51, 23));
        btnThem.setMinimumSize(new java.awt.Dimension(51, 23));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setEnabled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenLoai))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnSua)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetField(boolean status) {
        txtMaLoai.setText("");
        txtTenLoai.setText("");
        txtTenLoai.setEnabled(status);
    }

    private boolean checkExist(String tenLoaiTK) {
        boolean validate = true;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        try {
            pStmt = conn.prepareStatement("SELECT KT_LTK(?) AS EXIST");
            pStmt.setString(1, tenLoaiTK);
            rs = pStmt.executeQuery();
            if (rs.first()) {
                if (rs.getInt("EXIST") == 0) {
                    validate = false;
                }
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
        return validate;
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (btnThem.getText().equals("Thêm")) {
            resetField(true);
            btnSua.setText("Sửa");
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
            btnThem.setText("Lưu");
        } else {
            // thêm vào csdl  
            String ten = txtTenLoai.getText();
            if (ten.equals("")) {
                JOptionPane.showMessageDialog(null, "Dữ liệu nhập vào không được rỗng");
            } else {
                if (checkExist(ten)) {
                    CallableStatement cs = null;
                    try {
                        cs = conn.prepareCall("{call THEM_LOAI_TK(?)}");
                        cs.setString(1, ten);
                        if (cs.executeUpdate() > 0) {
                            JOptionPane.showMessageDialog(null, "Thêm loại tài khoản thành công");
                            resetField(false);
                            btnThem.setText("Thêm");
                            btnSua.setEnabled(false);
                            loadTable();
                        } else {
                            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra , vui lòng kiểm tra lại dữ liệu nhập");
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Có lỗi xảy ra , vui lòng kiểm tra lại dữ liệu nhập");
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
                    JOptionPane.showMessageDialog(null, "Tên loại tài khoản này đã tồn tại");
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (btnSua.getText().equals("Sửa")) {
            txtTenLoai.setEnabled(true);
            btnThem.setText("Thêm");
            btnThem.setEnabled(false);
            btnXoa.setEnabled(false);
            btnSua.setText("Lưu");
        } else {
            // Sửa thông tin loại tài khoản
            int id = Integer.parseInt(txtMaLoai.getText());
            String ten = txtTenLoai.getText();
            if (ten.equals("")) {
                JOptionPane.showMessageDialog(null, "Dữ liệu nhập vào không được rỗng");
            } else {
                CallableStatement cs = null;
                try {
                    cs = conn.prepareCall("{call SUA_LOAI_TK(?,?)}");
                    cs.setInt(1, id);
                    cs.setString(2, ten);
                    if (cs.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Sửa loại tài khoản khoản thành công");
                        resetField(false);
                        btnSua.setText("Sửa");
                        btnThem.setEnabled(true);
                        btnXoa.setEnabled(true);
                        loadTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Có lỗi xảy ra , vui lòng kiểm tra lại dữ liệu nhập");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra , vui lòng kiểm tra lại dữ liệu nhập");
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
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        resetField(false);
        btnThem.setText("Thêm");
        btnSua.setText("Sửa");
        btnXoa.setEnabled(false);
        btnThem.setEnabled(true);
        btnSua.setEnabled(false);

    }//GEN-LAST:event_btnHuyActionPerformed

    private void tbLoaiTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiTaiKhoanMousePressed
        // TODO add your handling code here:
        int row = tbLoaiTaiKhoan.getSelectedRow();
        txtMaLoai.setText(tbLoaiTaiKhoan.getValueAt(row, 0).toString());
        txtTenLoai.setText(tbLoaiTaiKhoan.getValueAt(row, 1).toString());
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
    }//GEN-LAST:event_tbLoaiTaiKhoanMousePressed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String[] options = {"Xác nhận", "Hủy"};
        String title = "Xác nhận xóa";
        String content = "Bạn chắc chắn muốn xóa loại tài khoản \"" + txtTenLoai.getText() + "\" ?";
        int selection = JOptionPane.showOptionDialog(null, content, title,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
                options[1]);
        if (selection >= 0) {
            if (options[selection].equals("Xác nhận")) {
                int id = Integer.parseInt(txtMaLoai.getText());
                CallableStatement cs = null;
                try {
                    cs = conn.prepareCall("{call XOA_LOAI_TK(?)}");
                    cs.setInt(1, id);
                    if (cs.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                        resetField(false);
                        btnThem.setEnabled(true);
                        btnXoa.setEnabled(false);
                        btnSua.setEnabled(false);
                        loadTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Có lỗi xảy ra , vui lòng kiểm tra lại dữ liệu nhập");
                    }
                } catch (SQLIntegrityConstraintViolationException ex) {
                    JOptionPane.showMessageDialog(null, "Tồn tại tài khoản thuộc loại tài khoản này , không thể xóa");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra , vui lòng kiểm tra lại dữ liệu nhập");
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
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLoaiTaiKhoan;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
