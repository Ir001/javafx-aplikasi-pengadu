/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author RPL
 */
public class aduan {
    public String nis;
    public String jenis;
    public String aduan;
    public void setNis(String nis) {
        this.nis = nis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setAduan(String aduan) {
        this.aduan = aduan;
    }

    public String getNis() {
        return nis;
    }

    public String getJenis() {
        return jenis;
    }

    public String getAduan() {
        return aduan;
    }
    public aduan(String nis, String jenis, String aduan){
        this.nis = nis;
        this.jenis = jenis;
        this.aduan = aduan;
    }
}
