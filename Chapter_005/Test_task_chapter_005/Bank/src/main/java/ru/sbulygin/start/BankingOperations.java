package ru.sbulygin.start;

import ru.sbulygin.errors.NullAccountException;
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

    /**
     * Collection stores data about users and accounts.
     */
    private Map<User, List<Account>> bankMap = new HashMap<>();

    /**
     * Getter bankMap.
     * @return Information about the user.
     */
    public Map<User, List<Account>> getBankMap() {
        return this.bankMap;
    }

    /**
     * Method add new user.
     * @param user new user.
     * @throws NullUserException Error if user has no.
     */
    public void addUser(User user) throws NullUserException {

        if (user == null) {
            throw new NullUserException("User is not created.");
        }
        this.bankMap.put(user, new ArrayList<Account>());
    }

    /**
     * Method remove user.
     * @param user The user to delete.
     * @throws NullUserException Error if user has no.
     */
    public void deleteUser(User user) throws NullUserException {
        if (this.bankMap.containsKey(user)) {
            this.bankMap.remove(user);
        } else {
            throw new NullUserException("User is not found.");
        }
    }

    /**
     * Method adds an account for the user.
     * @param user user.
     * @param account new account.
     * @throws NullUserException Error if user has no.
     * @throws NullAccountException Error if account has no.
     */
    public void addAccountToUser(User user, Account account) throws NullUserException, NullAccountException {
        if (!(account == null)) {
            if (this.bankMap.containsKey(user)) {
                this.bankMap.get(user).add(account);
            } else {
                 throw new NullUserException("User is not found.");
            }
        } else {
            throw new NullAccountException("The account cannot be zero.");
        }
    }

    /**
     * Method remove an account for the user.
     * @param user user.
     * @param account account.
     * @throws NullUserException Error if user has no.
     */
    public void deleteAccountFromUser(User user, Account account) throws NullUserException {
        if (this.bankMap.containsKey(user)) {
            this.bankMap.get(user).remove(account);
        } else {
            throw new NullUserException("User is not found.");
        }
    }

    /**
     * Method returns the list of user accounts.
     * @param user user.
     * @return list of user accounts.
     * @throws NullUserException Error if user has no.
     */
    public List<Account> getUserAccounts(User user) throws NullUserException {
        List<Account> accountListUser;
        if (this.bankMap.containsKey(user)) {
            accountListUser = this.bankMap.get(user);
        } else {
            throw new NullUserException("User is not found.");
        }
        return accountListUser;
    }

    /**
     * The method checks the possibility of transferring money from one account to another.
     * Between accounts of the user, and different users.
     * @param srcUser the sender.
     * @param srcAccount the expense of the sender.
     * @param dstUser the recipient.
     * @param dstAccount the beneficiary's account.
     * @param amount the amount of the transfer.
     * @return Boolean value translation capabilities.
     * @throws NullUserException Error if user has no.
     * @throws NullAccountException Error if account has no.
     */
    public boolean transferMoney(User srcUser,
                                  Account srcAccount,
                                  User dstUser,
                                  Account dstAccount, double amount) throws NullUserException, NullAccountException {
        boolean allowedToTransfer = false;
        if (this.bankMap.containsKey(srcUser) && this.bankMap.containsKey(dstUser)) {
            if (this.bankMap.get(srcUser).contains(srcAccount) && this.bankMap.get(dstUser).contains(dstAccount)) {
                if (srcAccount.getValue() - amount >= 0) {
                    allowedToTransfer = true;
                    srcAccount.setValue(srcAccount.getValue() - amount);
                    dstAccount.setValue(dstAccount.getValue() + amount);
                }
            } else {
                throw new NullAccountException("The account of the sender or the recipient is not found");
            }
        } else {
            throw new NullUserException("The translation is not possible! One of the users is not found.");
        }
        return allowedToTransfer;
    }

}
