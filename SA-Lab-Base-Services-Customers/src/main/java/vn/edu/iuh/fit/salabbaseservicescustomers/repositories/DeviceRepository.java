package vn.edu.iuh.fit.salabbaseservicescustomers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}