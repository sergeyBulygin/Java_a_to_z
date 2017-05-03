package ru.sbulygin.start;

import ru.sbulygin.errors.NullUserException;
import ru.sbulygin.model.Account;
import ru.sbulygin.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class BankingOperations.
 *
 * @author ru.sbulygin.
 * @since 28.04.2017.
 * @version 1.0.
 */
public class BankingOperations {

    private List<Account> userListAccount = new ArrayList<>();

    private Map<User, List<Account>> bankMap = new HashMap<>();

    public Map<User, List<Account>> getBankMap() {
        return this.bankMap;
    }

    public void addUser(User user) throws NullUserException {

        if (user == null) {
            throw new NullUserException("User is not created.");
        }
        this.bankMap.put(user, userListAccount);
    }

    public void deleteUser(User user) throws NullUserException {
        if (this.bankMap.containsKey(user)) {
            this.bankMap.remove(user);
        } else {
            throw new NullUserException("User is not found.");
        }
    }

    public void addAccountToUser(User user, Account account) {



    }

    public void deleteAccountFromUser(User user, Account account) {

    }

    public List<Account> getUserAccounts (User user) {

    }

    public boolean transferMoney (User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {

    }


}
