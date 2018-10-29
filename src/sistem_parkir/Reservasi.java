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
public class Reservasi {
    private int reservasiID;
    private String reservasiType;
    private int customerID;
    private int spotID;
    private int garageID;
    private boolean statusReservasi;

    public Reservasi(int reservasiID, String reservasiType, int customerID, int spotID, int garageID, boolean statusReservasi) {
        this.reservasiID = reservasiID;
        this.reservasiType = reservasiType;
        this.customerID = customerID;
        this.spotID = spotID;
        this.garageID = garageID;
        this.statusReservasi = statusReservasi;
    }

    /**
     * @return the reservasiID
     */
    public int getReservasiID() {
        return reservasiID;
    }

    /**
     * @param reservasiID the reservasiID to set
     */
    public void setReservasiID(int reservasiID) {
        this.reservasiID = reservasiID;
    }

    /**
     * @return the reservasiType
     */
    public String getReservasiType() {
        return reservasiType;
    }

    /**
     * @param reservasiType the reservasiType to set
     */
    public void setReservasiType(String reservasiType) {
        this.reservasiType = reservasiType;
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the spotID
     */
    public int getSpotID() {
        return spotID;
    }

    /**
     * @param spotID the spotID to set
     */
    public void setSpotID(int spotID) {
        this.spotID = spotID;
    }

    /**
     * @return the garageID
     */
    public int getGarageID() {
        return garageID;
    }

    /**
     * @param garageID the garageID to set
     */
    public void setGarageID(int garageID) {
        this.garageID = garageID;
    }

    /**
     * @return the statusReservasi
     */
    public boolean isStatusReservasi() {
        return statusReservasi;
    }

    /**
     * @param statusReservasi the statusReservasi to set
     */
    public void setStatusReservasi(boolean statusReservasi) {
        this.statusReservasi = statusReservasi;
    }
       
}
