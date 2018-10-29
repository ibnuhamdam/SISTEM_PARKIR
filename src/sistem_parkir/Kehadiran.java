/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_parkir;

import java.util.Date;

/**
 *
 * @author Ibnuhamdam
 */
public class Kehadiran {
    private Date kedatangan;
    private int durasi;

    public Kehadiran(Date kedatangan, int durasi) {
        this.kedatangan = kedatangan;
        this.durasi = durasi;
    }

    /**
     * @return the kedatangan
     */
    public Date getKedatangan() {
        return kedatangan;
    }

    /**
     * @param kedatangan the kedatangan to set
     */
    public void setKedatangan(Date kedatangan) {
        this.kedatangan = kedatangan;
    }

    /**
     * @return the durasi
     */
    public int getDurasi() {
        return durasi;
    }

    /**
     * @param durasi the durasi to set
     */
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
}
