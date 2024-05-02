package vn.edu.iuh.fit.salabbaseservicescustomers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}