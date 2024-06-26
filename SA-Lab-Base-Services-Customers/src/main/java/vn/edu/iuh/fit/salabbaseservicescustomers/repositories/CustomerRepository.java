package vn.edu.iuh.fit.salabbaseservicescustomers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}