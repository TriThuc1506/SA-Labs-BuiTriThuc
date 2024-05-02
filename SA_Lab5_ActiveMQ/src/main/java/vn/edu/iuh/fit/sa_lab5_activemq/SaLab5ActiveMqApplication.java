package vn.edu.iuh.fit.sa_lab5_activemq;

import java.util.Random;
import net.datafaker.Faker;
import net.datafaker.providers.base.Commerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.sa_lab5_activemq.models.Product;
import vn.edu.iuh.fit.sa_lab5_activemq.models.ProductQuantity;
import vn.edu.iuh.fit.sa_lab5_activemq.repositories.ProductQuantityRepository;
import vn.edu.iuh.fit.sa_lab5_activemq.repositories.ProductRepository;

@SpringBootApplication
public class SaLab5ActiveMqApplication {

  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private ProductQuantityRepository productQuantityRepository;

  public static void main(String[] args) {
    SpringApplication.run(SaLab5ActiveMqApplication.class, args);
  }

//  @Bean
  CommandLineRunner init() {
    return (String[] args) -> {
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
        Commerce data = new Faker().commerce();
        Product product = new Product(data.productName(), Double.parseDouble(data.price()),
            data.material());
        ProductQuantity productQuantity = new ProductQuantity(product, random.nextFloat() * 10000);
        product.setProductQuantity(productQuantity);
        productRepository.save(product);
        productQuantityRepository.save(productQuantity);
      }
    };
  }

}
