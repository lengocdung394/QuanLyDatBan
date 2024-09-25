package org.login.quanlydatban.entity;

import javax.persistence.*;

@Entity
@Table
public class MonAn {
    @Id
    private String maMonAn;

    @Column(nullable = false)
    private String tenMonAn;

    @Column(nullable = false)
    private double donGia;

    @Column(nullable = false)
    private String donViTinh;

    private String hinhAnh;

    @OneToOne(fetch = FetchType.LAZY)
    private LoaiMonAn loaiMonAn;

    public MonAn(){}

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LoaiMonAn getLoaiMonAn() {
        return loaiMonAn;
    }

    public void setLoaiMonAn(LoaiMonAn loaiMonAn) {
        this.loaiMonAn = loaiMonAn;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "maMonAn='" + maMonAn + '\'' +
                ", tenMonAn='" + tenMonAn + '\'' +
                ", donGia=" + donGia +
                ", donViTinh='" + donViTinh + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", loaiMonAn=" + loaiMonAn +
                '}';
    }
}
