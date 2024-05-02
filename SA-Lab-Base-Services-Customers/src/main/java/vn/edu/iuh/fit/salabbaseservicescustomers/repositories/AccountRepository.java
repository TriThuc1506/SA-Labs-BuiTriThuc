package vn.edu.iuh.fit.salabbaseservicescustomers.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

  @Query("select a from Account a where a.username = ?1")
  Optional<Account> findByUsername(String username);
}