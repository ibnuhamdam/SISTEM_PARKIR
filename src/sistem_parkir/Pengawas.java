/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_parkir;

/**
 *
 * @author Ibnuhamdam
 */
public class Pengawas {
    private String reservasi;
    private String registrasi;
    private String kepemilikan;

    public Pengawas(String reservasi, String registrasi, String kepemilikan) {
        this.reservasi = reservasi;
        this.registrasi = registrasi;
        this.kepemilikan = kepemilikan;
    }

    /**
     * @return the reservasi
     */
    public String getReservasi() {
        return reservasi;
    }

    /**
     * @param reservasi the reservasi to set
     */
    public void setReservasi(String reservasi) {
        this.reservasi = reservasi;
    }

    /**
     * @return the registrasi
     */
    public String getRegistrasi() {
        return registrasi;
    }

    /**
     * @param registrasi the registrasi to set
     */
    public void setRegistrasi(String registrasi) {
        this.registrasi = registrasi;
    }

    /**
     * @return the kepemilikan
     */
    public String getKepemilikan() {
        return kepemilikan;
    }

    /**
     * @param kepemilikan the kepemilikan to set
     */
    public void setKepemilikan(String kepemilikan) {
        this.kepemilikan = kepemilikan;
    }
    
}
