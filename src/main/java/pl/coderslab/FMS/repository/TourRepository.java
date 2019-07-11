package pl.coderslab.FMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.FMS.model.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
}
