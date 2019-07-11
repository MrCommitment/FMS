package pl.coderslab.FMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.FMS.entity.Contacts;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long>{

    List<Contacts> findByCompanyName(String companyName);

    List<Contacts> findByEmail(String email);

}
