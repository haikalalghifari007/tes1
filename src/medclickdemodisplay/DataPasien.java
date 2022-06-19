/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medclickdemodisplay;

import java.time.LocalDate;
import javafx.scene.control.Button;

/**
 *
 * @author lphai
 */
public class DataPasien {
    private String Nama;
    private String NIK;
    private LocalDate Tanggal;
    private String Tempat;
    private String Pekerjaan;
    private String Alamat;
    private String NoHP;
    private String Kelamin;
    private Button rekammedis;
    private String Goldar;

    public DataPasien(String nama, String nIK, LocalDate tanggal, String tempat, String pekerjaan, String alamat, String noHP, String kelamin, String goldar) {
        this.Nama = nama;
        this.NIK = nIK;
        this.Tanggal = tanggal;
        this.Tempat = tempat;
        this.Pekerjaan = pekerjaan;
        this.Alamat = alamat;
        this.NoHP = noHP;
        this.Kelamin = kelamin;
        this.rekammedis = new Button("Lihat");
        this.Goldar = goldar;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIK() {
        return NIK;
    }

    public LocalDate getTanggal() {
        return Tanggal;
    }

    public String getTempat() {
        return Tempat;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public String getAlamat() {
        return Alamat;
    }
    
    public String getNoHP() {
        return NoHP;
    }
    
    public Button getRekammedis() {
        return rekammedis;
    }
    
    public String getGoldar() {
        return Goldar;
    }    

    public String getKelamin() {
        return Kelamin;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setTanggal(LocalDate Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setTempat(String Tempat) {
        this.Tempat = Tempat;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public void setKelamin(String Kelamin) {
        this.Kelamin = Kelamin;
    }

    public void setRekammedis(Button rekammedis) {
        this.rekammedis = rekammedis;
    }

    public void setGoldar(String Goldar) {
        this.Goldar = Goldar;
    }
    
    
    
}
