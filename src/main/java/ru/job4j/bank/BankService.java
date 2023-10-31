package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void deleteUser(String passport) {
          User user = findByPassport(passport);
          users.remove(user);
        }



    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            return;
        }
        List<Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
        users.put(user, accounts);
    }

    public User findByPassport(String passport) {
        for (User client : users.keySet()) {
            if(client.getPassport().equals(passport)) {
                return client;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
      User user = findByPassport(passport);
       if(user != null) {
           for (Account account : users.get(user)) {
               if(account.getRequisite().equals(requisite)) {
                   return account;
               }
           }
       }
       return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcUser = findByRequisite(srcPassport, srcRequisite);
        Account destUser = findByRequisite(destPassport, destRequisite);
        if(srcUser != null && destUser != null && srcUser.getBalance() >= amount) {
            srcUser.setBalance(srcUser.getBalance() - amount);
            destUser.setBalance(destUser.getBalance() + amount);
            return true;
        }
        return false;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
