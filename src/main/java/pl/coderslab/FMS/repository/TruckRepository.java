package pl.coderslab.FMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.FMS.model.Truck;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {

}
