package vn.edu.iuh.fit.salabbaseservicescustomers.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "delivery")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long trackingNumber;
  @OneToMany
  @Column(name = "device")
  private List<Device> devices;
  @OneToOne
  private Address address;
  @OneToOne
  private Customer customer;
  @OneToMany
  @Column(name = "status")
  private List<Status> status;

  public Delivery(Address address, Customer customer, List<Status> status) {
    this.address = address;
    this.customer = customer;
    this.status = status;
  }


}
