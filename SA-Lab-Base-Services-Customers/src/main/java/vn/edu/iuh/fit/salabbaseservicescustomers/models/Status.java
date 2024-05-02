package vn.edu.iuh.fit.salabbaseservicescustomers.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.salabbaseservicescustomers.enums.DeliveryStatus;

@Entity
@Table(name = "delivery_status")
@Getter@Setter@NoArgsConstructor
public class Status {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "status")
  private DeliveryStatus status;
  @Column(name = "time")
  private LocalDateTime time;

  public Status(DeliveryStatus status, LocalDateTime time) {
    this.status = status;
    this.time = time;
  }



}
