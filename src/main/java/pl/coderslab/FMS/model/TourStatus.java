package pl.coderslab.FMS.model;

public enum TourStatus {
    UNLOADED("UNLOADED"), IN_TRANSIT("IN_TRANSIT"), LOADED("LOADED"), TO_UNLOAD("TO_UNLOAD");

    private final String status;

    TourStatus(String status) {
        this.status=status;
    }
}
