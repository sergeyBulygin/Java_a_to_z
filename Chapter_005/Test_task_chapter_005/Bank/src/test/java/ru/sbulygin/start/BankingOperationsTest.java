package ru.sbulygin.start;

import org.junit.Before;
import org.junit.Test;
import ru.sbulygin.errors.NullAccountException;
import ru.sbulygin.errors.NullUserException;
import ru.sbulygin.model.Account;
import ru.sbulygin.model.User;
import java.util.Iterator;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class BankingOperationsTest.
 *
 * @author ru.sbulygin.
 * @since 03.05.2017.
 * @version 1.0.
 */
public class BankingOperationsTest {

    /**
     * Test name field.
     */
    private final String testName = "name";

    /**
     * Test second name field.
     */
    private final String testNameTwo = "nameTwo";

    /**
     * Test passport field.
     */
    private final String testPassport = "12345";

    /**
     * Test second passport field.
     */
    private final String testPassportTwo = "111111";

    /**
     * Test value field.
     */
    private final double testValue = 99.9;

    /**
     * Test second value field.
     */
    private final double testValueTwo = 99.9;

    /**
     * Test requisites field.
     */
    private final String testRequisites = "1234567890";

    /**
     * Test second requisites field.
     */
    private final String testRequisitesTwo = "121212121";

    /**
     *  Test instance BankingOperations field.
     */
    private BankingOperations testBank;

    /**
     *  Test instance user field.
     */
    private User testUser;

    /**
     *  Test second instance user field.
     */
    private User testUserTwo;

    /**
     *  Test instance account field.
     */
    private  Account testAccount;

    /**
     *  Test second instance account field.
     */
    private  Account testAccountTwo;

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public void infoForTest() {
        testBank = new BankingOperations();
        testUser = new User(testName, testPassport);
        testUserTwo = new User(testNameTwo, testPassportTwo);
        testAccount = new Account(testValue, testRequisites);
        testAccountTwo = new Account(testValueTwo, testRequisitesTwo);
    }

    /**
     * Method for test addUser methods BankingOperations class.
     * @throws NullUserException Error if user has no.
     */
    @Test
    public void whenAddNewUserThenGetNewUser() throws NullUserException {
        testBank.addUser(testUser);
        assertThat(testBank.getBankMap().containsKey(testUser), is(true));
    }

    /**
     * Method for test deleteUser methods BankingOperations class.
     * @throws NullUserException Error if user has no.
     */
    @Test
    public void whenRemoveNewUserThenGetFalse() throws NullUserException {
        testBank.addUser(testUser);
        testBank.deleteUser(testUser);
        assertThat(testBank.getBankMap().containsKey(testUser), is(false));
    }

    /**
     * Method for test addAccountToUser methods BankingOperations class.
     * @throws NullUserException Error if user has no.
     * @throws NullAccountException Error if account has no.
     */
    @Test
    public void whenAddNewAccountForUserThanGetNewAccount() throws NullUserException, NullAccountException {
        boolean result = false;
        testBank.addUser(testUser);
        testBank.addAccountToUser(testUser, testAccount);
        List<Account> testListAccount = testBank.getUserAccounts(testUser);
        Iterator<Account> iterator = testListAccount.iterator();
            do {
                testListAccount.equals(iterator.next());
                result = true;
            } while (iterator.hasNext());
        assertThat(result, is(true));
    }

    /**
     * Method for test deleteAccountFromUser methods BankingOperations class.
     * @throws NullUserException Error if user has no.
     * @throws NullAccountException Error if account has no.
     */
    @Test
    public void whenRemoveAccountForUserThatGetSizeOne() throws NullUserException, NullAccountException {
        testBank.addUser(testUser);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUser, testAccountTwo);
        testBank.deleteAccountFromUser(testUser, testAccount);
        List<Account> testListAccount = testBank.getUserAccounts(testUser);
        assertThat(testListAccount.size(), is(1));
    }

    /**
     * Method for test transferMoney methods BankingOperations class.
     * @throws NullAccountException Error if account has no.
     * @throws NullUserException Error if user has no.
     */
    @Test
    public void whenValidTransferThatResultTrue() throws NullAccountException, NullUserException {
        testBank.addUser(testUser);
        testBank.addUser(testUserTwo);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUserTwo, testAccountTwo);
        boolean result = testBank.transferMoney(testUser, testAccount, testUserTwo, testAccountTwo, testValue);
        assertThat(result, is(true));
    }

    /**
     * Method for test transferMoney methods BankingOperations class.
     * @throws NullAccountException Error if account has no.
     * @throws NullUserException Error if user has no.
     */
    @Test
    public void whenValidTransferBetweenAccountsOneUserThatResultTrue() throws NullAccountException, NullUserException {
        testBank.addUser(testUser);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUser, testAccountTwo);
        boolean result = testBank.transferMoney(testUser, testAccount, testUser, testAccountTwo, testValue);
        assertThat(result, is(true));
    }

    /**
     * Method for test transferMoney methods BankingOperations class.
     * @throws NullAccountException Error if account has no.
     * @throws NullUserException Error if user has no.
     */
    @Test
    public void whenNotValidTransferThatResultFalse() throws NullAccountException, NullUserException {
        testBank.addUser(testUser);
        testBank.addUser(testUserTwo);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUserTwo, testAccountTwo);
        boolean result = testBank.transferMoney(testUser, testAccount, testUserTwo,
                                                testAccountTwo, testValue * 2);
        assertThat(result, is(false));
    }

    /**
     * Method for test transferMoney methods BankingOperations class.
     * @throws NullAccountException Error if account has no.
     * @throws NullUserException Error if user has no.
     */
    @Test
    public void whenNotValidTransferBetweenAccountsOneUserThatResultFalse() throws NullAccountException,
                                                                                  NullUserException {
        testBank.addUser(testUser);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUser, testAccountTwo);
        boolean result = testBank.transferMoney(testUser, testAccount, testUser,
                                                testAccountTwo, testValue * 2);
        assertThat(result, is(false));
    }

    /**
     * Test NullUserException by add, user null.
     * @throws NullUserException Error if user has no.
     */
    @Test(expected = NullUserException.class)
    public void whenAddNullUserThenNullUserException() throws NullUserException {
        User user = null;
        testBank.addUser(user);
    }

    /**
     * Test NullUserException by delete, user null.
     * @throws NullUserException Error if user has no.
     */
    @Test(expected = NullUserException.class)
    public void whenDeleteNotFindUserThenGetNullUserException() throws NullUserException {
        User user = null;
        testBank.deleteUser(user);
    }

    /**
     * Test NullUserException by add account, user null.
     * @throws NullUserException Error if user has no.
     * @throws NullAccountException Error if account has no.
     */
    @Test(expected = NullUserException.class)
    public void whenAddAccountNotUserThenGetNullUserException() throws NullUserException, NullAccountException {
        testBank.addAccountToUser(testUser, testAccount);
    }

    /**
     * Test NullAccountException by add account null.
     * @throws NullUserException Error if user has no.
     * @throws NullAccountException Error if account has no.
     */
    @Test(expected = NullAccountException.class)
    public void whenAddAccountNullUserThenGeNullAccountException() throws NullUserException, NullAccountException {
        testBank.addUser(testUser);
        Account account = null;
        testBank.addAccountToUser(testUser, account);
    }

    /**
     * Method NullUserException by transfer money.
     * @throws NullAccountException Error if account has no.
     * @throws NullUserException Error if user has no.
     */
    @Test(expected = NullUserException.class)
    public void whenFailTransferThatNullUserException() throws NullAccountException, NullUserException {
        User user = null;
        testBank.addUser(testUser);
        testBank.addUser(user);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUserTwo, testAccountTwo);
        testBank.transferMoney(testUser, testAccount, user, testAccountTwo, testValue);
    }

    /**
     * Method NullAccountException by transfer money.
     * @throws NullAccountException Error if account has no.
     * @throws NullUserException Error if user has no.
     */
    @Test(expected = NullAccountException.class)
    public void whenFailTransferThatNullAccountException() throws NullAccountException, NullUserException {
        Account account = null;
        testBank.addUser(testUser);
        testBank.addUser(testUserTwo);
        testBank.addAccountToUser(testUser, testAccount);
        testBank.addAccountToUser(testUserTwo, account);
        testBank.transferMoney(testUser, testAccount, testUserTwo, account, testValue);
    }


}
