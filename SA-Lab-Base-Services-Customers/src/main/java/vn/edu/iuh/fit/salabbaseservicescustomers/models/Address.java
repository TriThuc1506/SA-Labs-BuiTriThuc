package vn.edu.iuh.fit.salabbaseservicescustomers.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "number")
  private String number;
  @Column(name = "street")
  private String street;
  @Column(name = "city")
  private String city;
  @Column(name = "country")
  private String country;

  public Address(String number, String street, String city, String country) {
    this.number = number;
    this.street = street;
    this.city = city;
    this.country = country;
  }


}
