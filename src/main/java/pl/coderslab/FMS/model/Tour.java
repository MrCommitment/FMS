package pl.coderslab.FMS.model;

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
    private double distance;


    // relacja Tour-Place
    @ManyToOne
    private Place loadingPlace;

    @ManyToOne
    private Place unloadingPlace;

    //relcja Tour-Load
    @OneToMany( cascade = CascadeType.REMOVE)
    private List<Load> loads;

    @Enumerated(EnumType.STRING)
    private TourStatus tourStatus;


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

    public Place getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(Place loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public Place getUnloadingPlace() {
        return unloadingPlace;
    }

    public void setUnloadingPlace(Place unloadingPlace) {
        this.unloadingPlace = unloadingPlace;
    }

    public List<Load> getLoads() {
        return loads;
    }

    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }

    public TourStatus getTourStatus() {
        return tourStatus;
    }

    public void setTourStatus(TourStatus tourStatus) {
        this.tourStatus = tourStatus;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", distance=" + distance +
                ", loadingPlace=" + loadingPlace +
                ", unloadingPlace=" + unloadingPlace +
                ", loads=" + loads +
                ", tourStatus=" + tourStatus +
                '}';
    }
}
