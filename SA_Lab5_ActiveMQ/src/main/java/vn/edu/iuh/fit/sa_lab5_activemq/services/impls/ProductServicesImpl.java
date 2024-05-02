package vn.edu.iuh.fit.sa_lab5_activemq.services.impls;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.sa_lab5_activemq.models.Product;
import vn.edu.iuh.fit.sa_lab5_activemq.repositories.ProductRepository;
import vn.edu.iuh.fit.sa_lab5_activemq.services.ProductServices;

@Service
public class ProductServicesImpl implements ProductServices {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public List<Product> getAll() {
    return productRepository.findAll();
  }

  @Override
  public Optional<Product> getById(long id) {
    return productRepository.findById(id);
  }
}
