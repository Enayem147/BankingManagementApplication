/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author 84965
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class Connect {
    
    private Connection conn = null;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dbms_banking?useUnicode=true&characterEncoding=UTF-8"+ "&user=root");
           // JOptionPane.showMessageDialog(null, "Ket noi thanh cong");
            return conn;
        } catch (Exception ex) { //xử lý ngoại lệ nếu có
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Ket noi khong thanh cong");
            return null;
        }
    }
}
