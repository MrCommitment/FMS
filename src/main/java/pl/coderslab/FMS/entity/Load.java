package pl.coderslab.FMS.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "loads")
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 30)
    private double weight;

    @NotEmpty
    @Size(min = 1, max = 30)
    private String goods;

    @NotEmpty
    private String transitTime;



    // relacja Load-Customer

    @NotNull
    @ManyToOne
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    // relacja Load-Truck

    @NotNull
    @ManyToOne
    private Truck truck;

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }


    //relacja Load-Tour

    @NotNull
    @ManyToOne
    private Tour tour;

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    // konstruktor bezwarunkowy

    public Load() {
    }


    //setter&getter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // toString

    @Override
    public String toString() {
        return "Load{" +
                "id=" + id +
                ", weight=" + weight +
                ", goods='" + goods + '\'' +
                ", transitTime='" + transitTime + '\'' +
                ", customer=" + customer +
                ", truck=" + truck +
                ", tour=" + tour +
                '}';
    }
}
