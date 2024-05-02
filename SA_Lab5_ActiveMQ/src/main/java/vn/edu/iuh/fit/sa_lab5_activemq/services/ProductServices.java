package vn.edu.iuh.fit.sa_lab5_activemq.services;

import java.util.List;
import java.util.Optional;
import vn.edu.iuh.fit.sa_lab5_activemq.models.Product;

public interface ProductServices {
  public List<Product> getAll();
  public Optional<Product> getById(long id);

}
