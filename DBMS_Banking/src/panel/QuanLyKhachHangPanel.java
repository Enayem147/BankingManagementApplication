package panel;

/**
 *
 * @author 84965
 */
import model.KhachHang;
import connection.Connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class QuanLyKhachHangPanel extends javax.swing.JPanel {

    Connect connection = new Connect();
    Connection conn = connection.getConnection();
    private Object getquanlyList;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public QuanLyKhachHangPanel() {
        initComponents();
        showQuanLy();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txt_MKH = new javax.swing.JTextField();
        txt_HT = new javax.swing.JTextField();
        txt_CMND = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_QLKH = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        txt_NS = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_DC = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel5.setBackground(new java.awt.Color(0, 102, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_MKH.setEnabled(false);

        txt_HT.setEnabled(false);

        txt_CMND.setEnabled(false);

        jTable_QLKH.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_QLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_QLKHMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_QLKH);

        jLabel3.setText("Mã khách hàng (CIF) :");

        jLabel2.setText("Số chứng minh thư : ");

        jLabel8.setText("Địa chỉ:");

        btnThem.setText("Thêm");
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

        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        txt_NS.setDateFormatString("dd/MM/yyyy");
        txt_NS.setEnabled(false);

        txt_DC.setColumns(20);
        txt_DC.setRows(5);
        txt_DC.setEnabled(false);
        jScrollPane2.setViewportView(txt_DC);

        jLabel6.setText("Họ và tên:");

        jLabel9.setText("Ngày sinh:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_CMND)
                                    .addComponent(txt_HT)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addComponent(txt_MKH))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32)
                                .addComponent(txt_NS, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_MKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9))
                    .addComponent(txt_NS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_HT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_CMND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnThem)
                                    .addComponent(btnSua)
                                    .addComponent(btnXoa)
                                    .addComponent(btnHuy)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
//-----------------------------------------------------------------------------------------------

    public ArrayList<KhachHang> getquanlyList() {
        ArrayList<KhachHang> quanlyList = new ArrayList<KhachHang>();
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = conn.prepareCall("{call DS_KH()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("KH_CIF");
                String hoten = rs.getString("KH_HOTEN");
                String cmnd = rs.getString("KH_CMND");
                String ngaysinh = rs.getString("KH_NGAYSINH");
                String diachi = rs.getString("KH_DIACHI");
                quanlyList.add(new KhachHang(id, hoten, cmnd, ngaysinh, diachi));
            }
        } catch (Exception ex) {
            Logger.getAnonymousLogger(QuanLyKhachHangPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quanlyList;
    }

    public void showQuanLy() {
        ArrayList<KhachHang> list = getquanlyList();
        String[] titles = {"Mã Khách Hàng", "Họ & Tên", "Chứng Minh Thư", "Ngày Sinh", "Địa Chỉ"};
        DefaultTableModel model = new DefaultTableModel(titles, 0);
        for (int i = 0; i < list.size(); i++) {
            Vector vector = new Vector();
            vector.add(list.get(i).getKH_CIF());
            vector.add(list.get(i).getKH_HOTEN());
            vector.add(list.get(i).getKH_CMND());
            vector.add(list.get(i).getKH_NGAYSINH());
            vector.add(list.get(i).getKH_DIACHI());
            model.addRow(vector);
        }
        jTable_QLKH.setDefaultEditor(Object.class, null);
        jTable_QLKH.setModel(model);
    }
    //-----------------------------------------------------------------------------------------------------------------

    public void excuteSQLQuery(String query, String nut) {
        Statement st;
        try {
            st = conn.createStatement();
            if ((st.executeUpdate(query)) == 1) {
//                DefaultTableModel model = (DefaultTableModel) jTable_QLKH.getModel();
//                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, nut + " thành công");
                showQuanLy();
            } else {
                JOptionPane.showMessageDialog(null, nut + " thất bại");
            }
        } catch (SQLIntegrityConstraintViolationException ex) {
            if (nut.equals("Xóa")) {
                JOptionPane.showMessageDialog(this, "Khách hàng này hiện vẫn còn tài khoản đã đăng ký ");
            } else {
                JOptionPane.showMessageDialog(this, "Số chứng minh thư đã đăng ký");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra");
        }

    }
//--------------------------------------------------------------------------

    private void jTable_QLKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_QLKHMousePressed
        // TODO add your handling code here:
        int i = jTable_QLKH.getSelectedRow();
        TableModel model = jTable_QLKH.getModel();
        txt_MKH.setText(model.getValueAt(i, 0).toString());
        txt_HT.setText(model.getValueAt(i, 1).toString());
        txt_CMND.setText(model.getValueAt(i, 2).toString());
        Date date = null;
        try {
            date = sdf.parse(model.getValueAt(i, 3).toString());
            txt_NS.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyKhachHangPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_DC.setText(model.getValueAt(i, 4).toString());
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
    }//GEN-LAST:event_jTable_QLKHMousePressed

    private boolean checkCMND(String cmnd) {
        double cmt = 0;
        try {
            cmt = Double.parseDouble(cmnd);
        } catch (NumberFormatException e) {
            return false;
        }
        if (cmnd.length() != 9) {
            return false;
        }
        return true;
    }

    private boolean checkBirthDay() {
        boolean val = true;
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Date date = null;
        Date today = new Date();
        date = txt_NS.getDate();
        c1.setTime(today);
        c2.setTime(date);
        int toYear = c1.get(Calendar.YEAR);
        int inputYear = c2.get(Calendar.YEAR);
        if ((toYear - inputYear) < 16) {
            val = false;
        }
        return val;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (btnThem.getText().equals("Thêm")) {
            txt_MKH.setText("");
            txt_CMND.setText("");
            txt_HT.setText("");
            txt_DC.setText("");
            txt_NS.setDate(null);
            btnThem.setText("Lưu");
            txt_CMND.setEnabled(true);
            txt_HT.setEnabled(true);
            txt_DC.setEnabled(true);
            txt_NS.setEnabled(true);
            btnSua.setText("Sửa");
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
        } else {
            String cmnd = txt_CMND.getText().trim();
            String hoten = txt_HT.getText().trim();
            String diachi = txt_DC.getText().trim();
            String ngaysinh = "";
            Date date = null;
            date = txt_NS.getDate();
            if (date == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày");
            } else if (!checkCMND(cmnd)) {
                JOptionPane.showMessageDialog(this, "Chứng minh nhân dân không hợp lệ");
            } else if (!checkBirthDay()) {
                JOptionPane.showMessageDialog(this, "Chọn ngày không hợp lệ");
            } else {
                ngaysinh = sdf.format(txt_NS.getDate());
                if (cmnd.equals("") || hoten.equals("") || diachi.equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
                } else {
                    String query = "call them_tt_t ('" + hoten + "','" + cmnd + "','" + ngaysinh + "','" + diachi + "')";
                    excuteSQLQuery(query, "Thêm");
                    btnThem.setText("Thêm");
                    resetField();
                }
            }

        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void resetField() {
        txt_MKH.setText("");
        txt_CMND.setText("");
        txt_HT.setText("");
        txt_DC.setText("");
        txt_NS.setDate(null);
        btnThem.setText("Thêm");
        btnSua.setText("Sửa");
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        txt_CMND.setEnabled(false);
        txt_HT.setEnabled(false);
        txt_DC.setEnabled(false);
        txt_NS.setEnabled(false);
        txt_NS.setEnabled(false);
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (btnSua.getText().equals("Sửa")) {
            txt_CMND.setEnabled(true);
            txt_HT.setEnabled(true);
            txt_NS.setEnabled(true);
            txt_DC.setEnabled(true);
            btnSua.setText("Lưu");
            btnThem.setText("Thêm");
            btnXoa.setEnabled(false);
        } else {
            if (checkBirthDay()) {
                btnSua.setText("Sửa");
                String query = "call update_tt_t (" + txt_MKH.getText() + ",'" + txt_HT.getText() + "','" + txt_CMND.getText() + "','" + sdf.format(txt_NS.getDate()) + "','" + txt_DC.getText() + "')";
                excuteSQLQuery(query, "Cập nhật");
                resetField();
            }else{
                JOptionPane.showMessageDialog(this, "Ngày chọn không hợp lệ");
            }

        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String[] options = {"Xác nhận", "Hủy"};
        String title = "Xác nhận xóa !";
        String content = "Bạn chắc chắn muốn xóa khách hàng này không ?  ";
        int selection = JOptionPane.showOptionDialog(null, content, title,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
                options[1]);
        if (selection >= 0) {
            if (options[selection].equals("Xác nhận")) {
                String query = "call xoa_tt (" + txt_MKH.getText() + ")";
                excuteSQLQuery(query, "Xóa");
                resetField();
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        resetField();
    }//GEN-LAST:event_btnHuyActionPerformed
//------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_QLKH;
    private javax.swing.JTextField txt_CMND;
    private javax.swing.JTextArea txt_DC;
    private javax.swing.JTextField txt_HT;
    private javax.swing.JTextField txt_MKH;
    private com.toedter.calendar.JDateChooser txt_NS;
    // End of variables declaration//GEN-END:variables
}
