package vn.edu.iuh.fit.salabbaseservicescustomers.services.CustomerServices.Account;

import java.util.Optional;
import vn.edu.iuh.fit.salabbaseservicescustomers.models.Account;

public interface AccountServices {
    public boolean checkLogin(String username, String password);
    public Optional<Account> create(String userName, String password);
    public Optional<Account> changePassword (String oldPass, String newPass);



}
