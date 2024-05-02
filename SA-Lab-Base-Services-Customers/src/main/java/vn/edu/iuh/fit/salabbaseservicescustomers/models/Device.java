package vn.edu.iuh.fit.salabbaseservicescustomers.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "device")
public class Device {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "device_name")
  private String name;
  @Column(name = "device_description")
  private String description;
  @Column(name = "device_model")
  private String model;
  @Column(name = "device_brand")
  private String brand;
  @Column(name = "date_started_use")
  private Date dateStartedUse;

  public Device(String name, String description, String model, String brand, Date dateStartedUse) {
    this.name = name;
    this.description = description;
    this.model = model;
    this.brand = brand;
    this.dateStartedUse = dateStartedUse;
  }


}
