package ru.job4j.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class NotifyAccount {

    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>(accounts);
        for (Account account : accounts) {
           // rsl.add(account);
            Collections.addAll(accounts);
        }
        return rsl;
    }
}
