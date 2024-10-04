package org.login.quanlydatban.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.login.quanlydatban.entity.TaiKhoan;
import org.login.quanlydatban.hibernate.HibernateUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class DangNhapController implements Initializable {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    public void dangNhap(){
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        TaiKhoan taiKhoan = session.get(TaiKhoan.class, username.getText());
        if(taiKhoan != null){
            if(taiKhoan.getPassword().equals(password.getText())){
                System.out.println("dang nhap thanh cong");
                System.out.println(taiKhoan);
            }
            else
                System.out.println("sai mat khau");
        }
        else System.out.println("ko ton tai");

        session.getTransaction().commit();
        session.close();
    }

    @FXML
    public void thoat(){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
