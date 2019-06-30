package pl.coderslab.FMS.entity;

import pl.coderslab.FMS.entity.Load;
import pl.coderslab.FMS.entity.Place;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="tour")
public class Tour {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min = 1, max = 10)
    private double distance;


    // realacja Tour-Place

    @NotNull
    @ManyToMany(mappedBy = "tourList")
    private List<Place> loadingPlace= new ArrayList<>();



    //realcja Tour-Load


    @NotNull
    @OneToMany(mappedBy = "tour", cascade = CascadeType.REMOVE)
    private List<Load> loads;


    //setter&getter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<Place> getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(List<Place> loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public List<Load> getLoads() {
        return loads;
    }

    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }

    //toString


    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", distance=" + distance +
                ", loadingPlace=" + loadingPlace +
                ", loads=" + loads +
                '}';
    }
}
