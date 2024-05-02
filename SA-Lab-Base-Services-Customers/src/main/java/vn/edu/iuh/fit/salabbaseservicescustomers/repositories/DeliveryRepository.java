package vn.edu.iuh.fit.salabbaseservicescustomers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

}