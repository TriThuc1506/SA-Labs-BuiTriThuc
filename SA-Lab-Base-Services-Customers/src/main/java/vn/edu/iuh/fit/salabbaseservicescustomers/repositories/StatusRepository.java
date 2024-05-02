package vn.edu.iuh.fit.salabbaseservicescustomers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}