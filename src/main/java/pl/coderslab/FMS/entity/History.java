package pl.coderslab.FMS.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String truck;

    @NotEmpty
    private String tour;

    @NotEmpty
    private String loadName;

    @NotEmpty
    private LocalDateTime loadingTime;

    @NotEmpty
    private LocalDateTime unloadingTime;



    //setter&getter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String getLoadName() {
        return loadName;
    }

    public void setLoadName(String loadName) {
        this.loadName = loadName;
    }

    public LocalDateTime getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(LocalDateTime loadingTime) {
        this.loadingTime = loadingTime;
    }

    public LocalDateTime getUnloadingTime() {
        return unloadingTime;
    }

    public void setUnloadingTime(LocalDateTime unloadingTime) {
        this.unloadingTime = unloadingTime;
    }

    //toString

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", truck='" + truck + '\'' +
                ", tour='" + tour + '\'' +
                ", loadName='" + loadName + '\'' +
                ", loadingTime=" + loadingTime +
                ", unloadingTime=" + unloadingTime +
                '}';
    }
}
