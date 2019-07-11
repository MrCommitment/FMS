package pl.coderslab.FMS.model;

public enum PlaceType {

    LOADING("LOADING"), UNLOADING("UNLOADING");

    private final String placeType;

    PlaceType(String placeType) {
        this.placeType=placeType;
    }
}
