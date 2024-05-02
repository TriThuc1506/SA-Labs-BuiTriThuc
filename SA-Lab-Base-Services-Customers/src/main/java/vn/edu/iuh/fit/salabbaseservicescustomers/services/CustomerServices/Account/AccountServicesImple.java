package vn.edu.iuh.fit.salabbaseservicescustomers.services.CustomerServices.Account;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Account;
import vn.edu.iuh.fit.salabbaseservicescustomers.repositories.AccountRepository;

@Service
public class AccountServicesImple implements AccountServices {

  @Autowired
  private AccountRepository accountRepository;

  @Override
  public boolean checkLogin(String username, String password) {
    return false;
  }

  @Override
  public Optional<Account> create(String userName, String password) {
    if (userName.trim().isEmpty()) {
      return Optional.empty();
    }
    if (password.trim().isEmpty()) {
      return Optional.empty();
    }
    Account account = accountRepository.findByUsername(userName).orElse(null);
    if (account != null) {
      return Optional.empty();
    } else {
      account = new Account(userName, password);
      accountRepository.save(account);
      return Optional.of(account);
    }


  }

  @Override
  public Optional<Account> changePassword(String oldPass, String newPass) {
    return null;
  }


}
