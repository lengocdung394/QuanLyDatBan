package org.login.quanlydatban.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class LichDat {
    @Id
    private String maLichDat;

    @Column(nullable = false)
    private LocalDate thoiGianDat;

    @ManyToOne
    @JoinColumn(name = "maKhachHang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private NhanVien nhanVien;

    @Column(nullable = false)
    private int soLuongNguoi = 5;

    @OneToOne
    private Ban ban;

    @OneToOne
    private HoaDon hoaDon;
}
