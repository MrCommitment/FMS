package pl.coderslab.FMS.model.dto;

import javax.validation.constraints.NotEmpty;

public class LoadInfoDTO {

    //loading
    private String loadingCountry;
    private String loadingCity;
    private String loadingPostCode;

    //unloading
    private String unloadingCountry;
    private String unloadingCity;
    private String unloadingPostCode;

    //load
    private double weight;
    private String goods;
    private String transitTime;

    //truck
    private String truckNr;
    private String driverDetails;
    private String trailer;

    public LoadInfoDTO() {
    }

    public String getLoadingCountry() {
        return loadingCountry;
    }

    public void setLoadingCountry(String loadingCountry) {
        this.loadingCountry = loadingCountry;
    }

    public String getLoadingCity() {
        return loadingCity;
    }

    public void setLoadingCity(String loadingCity) {
        this.loadingCity = loadingCity;
    }

    public String getLoadingPostCode() {
        return loadingPostCode;
    }

    public void setLoadingPostCode(String loadingPostCode) {
        this.loadingPostCode = loadingPostCode;
    }

    public String getUnloadingCountry() {
        return unloadingCountry;
    }

    public void setUnloadingCountry(String unloadingCountry) {
        this.unloadingCountry = unloadingCountry;
    }

    public String getUnloadingCity() {
        return unloadingCity;
    }

    public void setUnloadingCity(String unloadingCity) {
        this.unloadingCity = unloadingCity;
    }

    public String getUnloadingPostCode() {
        return unloadingPostCode;
    }

    public void setUnloadingPostCode(String unloadingPostCode) {
        this.unloadingPostCode = unloadingPostCode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }

    public String getTruckNr() {
        return truckNr;
    }

    public void setTruckNr(String truckNr) {
        this.truckNr = truckNr;
    }

    public String getDriverDetails() {
        return driverDetails;
    }

    public void setDriverDetails(String driverDetails) {
        this.driverDetails = driverDetails;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
