package vn.edu.iuh.fit.sa_lab5_activemq.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "prod_name")
  private String name;
  @Column(name = "price")
  private double price;
  @Column(name = "description", length = 1000)
  private String description;
  @OneToOne
  private ProductQuantity productQuantity;

  public Product(String name, double price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
  }


}
