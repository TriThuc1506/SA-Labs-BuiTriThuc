package vn.edu.iuh.fit.salabbaseservicescustomers.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum DeliveryStatus {
  SEND(0),
  PENDING(1),
  DELIVERED(2),
  PROCESSING(3),
  CANCELLED(4);

  private final int value;
  private DeliveryStatus(int value) {
    this.value = value;
  }
}
