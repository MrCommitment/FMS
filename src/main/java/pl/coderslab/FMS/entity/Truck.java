package pl.coderslab.FMS.entity;


import pl.coderslab.FMS.entity.Load;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "truck")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //nie moge tego zmienic

    @NotEmpty
    private String truckNr;

    @NotEmpty
    private String driverDetails;

    @NotEmpty
    private String trailer;


    //realcja Tour-Load

    @NotNull
    @OneToMany(mappedBy = "truck", cascade = CascadeType.REMOVE)
    private List<Load> loads;

    public List<Load> getLoads() {
        return loads;
    }

    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }

    //setter&getter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    //toString

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", truckNr='" + truckNr + '\'' +
                ", driverDetails='" + driverDetails + '\'' +
                ", trailer='" + trailer + '\'' +
                ", loads=" + loads +
                '}';
    }
}
