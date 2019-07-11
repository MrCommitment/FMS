package pl.coderslab.FMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.FMS.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
}
