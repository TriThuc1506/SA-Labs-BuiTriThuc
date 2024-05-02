package vn.edu.iuh.fit.sa_lab5_activemq.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_quantity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductQuantity {
  @Id
  @OneToOne
  @JoinColumn(name = "product_id")
  private Product product;
  private float quantity;

}
