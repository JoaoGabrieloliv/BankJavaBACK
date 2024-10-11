import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber) {
        accounts.put(accountNumber, new Account(accountNumber));
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

}
