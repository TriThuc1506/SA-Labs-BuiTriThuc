package vn.edu.iuh.fit.sa_lab5_activemq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.sa_lab5_activemq.models.Product;
import vn.edu.iuh.fit.sa_lab5_activemq.models.ProductQuantity;

public interface ProductQuantityRepository extends JpaRepository<ProductQuantity, Product> {

}