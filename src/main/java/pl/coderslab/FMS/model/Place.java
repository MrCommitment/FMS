package pl.coderslab.FMS.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Size(max = 20)
    private String country;

    @Enumerated(EnumType.STRING)
    private PlaceType placeType;

    @NotEmpty
    private String city;

    @NotEmpty
    @Size(min = 1, max = 10)
    private String postCode;

    //relacja Place-Tour

    @OneToMany(mappedBy = "loadingPlace")
    private List<Tour> loadingTours =new ArrayList<>();


    @OneToMany(mappedBy = "unloadingPlace")
    private List<Tour> unloadingTours =new ArrayList<>();



    //setter&getter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PlaceType getPlaceType() {
        return placeType;
    }

    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public List<Tour> getLoadingTours() {
        return loadingTours;
    }

    public void setLoadingTours(List<Tour> loadingTours) {
        this.loadingTours = loadingTours;
    }

    public List<Tour> getUnloadingTours() {
        return unloadingTours;
    }

    public void setUnloadingTours(List<Tour> unloadingTours) {
        this.unloadingTours = unloadingTours;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", placeType=" + placeType +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", loadingTours=" + loadingTours +
                ", unloadingTours=" + unloadingTours +
                '}';
    }
}
