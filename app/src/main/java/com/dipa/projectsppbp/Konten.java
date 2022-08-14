package com.dipa.projectsppbp;

public class Konten {

    private int gambar;
    private String judul;
    private String penulis;
    private String tanggal;

    public Konten(int gambar, String judul, String penulis, String tanggal) {
        this.gambar = gambar;
        this.judul = judul;
        this.penulis = penulis;
        this.tanggal = tanggal;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
