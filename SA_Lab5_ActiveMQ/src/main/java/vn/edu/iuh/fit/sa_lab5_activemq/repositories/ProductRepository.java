package vn.edu.iuh.fit.sa_lab5_activemq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.sa_lab5_activemq.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}