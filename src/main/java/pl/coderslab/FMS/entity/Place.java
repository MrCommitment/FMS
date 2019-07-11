package pl.coderslab.FMS.entity;

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
    private String country1;

    @NotEmpty
    private String loadingPlace;

    @NotEmpty
    @Size(max = 20)
    private String country2;

    @NotEmpty
    private String unloadingPlace;

    @NotEmpty
    @Size(min = 1, max = 10)
    private String postCode1;

    @NotEmpty
    @Size(min = 1, max = 10)
    private String postCode2;

    //relacja Place-Tour

    @NotNull
    @ManyToMany
    private List<Tour> tourList =new ArrayList<>();

    public List<Tour> getTourList() {
        return tourList;
    }

    public void setTourList(List<Tour> tourList) {
        this.tourList = tourList;
    }

    //setter&getter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public String getUnloadingPlace() {
        return unloadingPlace;
    }

    public void setUnloadingPlace(String unloadingPlace) {
        this.unloadingPlace = unloadingPlace;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getPostCode1() {
        return postCode1;
    }

    public void setPostCode1(String postCode1) {
        this.postCode1 = postCode1;
    }

    public String getPostCode2() {
        return postCode2;
    }

    public void setPostCode2(String postCode2) {
        this.postCode2 = postCode2;
    }

    //toString


    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", country1='" + country1 + '\'' +
                ", loadingPlace='" + loadingPlace + '\'' +
                ", country2='" + country2 + '\'' +
                ", unloadingPlace='" + unloadingPlace + '\'' +
                ", postCode1='" + postCode1 + '\'' +
                ", postCode2='" + postCode2 + '\'' +
                ", tourList=" + tourList +
                '}';
    }
}
