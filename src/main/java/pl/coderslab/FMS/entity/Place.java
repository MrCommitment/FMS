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
    private String loadingPlace;

    @NotEmpty
    private String unloadingPlace;

    @NotEmpty
    @Size(min = 1, max = 10)
    private String postCode;

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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    //toString


    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", loadingPlace='" + loadingPlace + '\'' +
                ", unloadingPlace='" + unloadingPlace + '\'' +
                ", postCode='" + postCode + '\'' +
                ", tourList=" + tourList +
                '}';
    }
}
