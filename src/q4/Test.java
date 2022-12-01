package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

    BankAccount b1 = new BankAccount("john", 25000);
    BankAccount b2 = new BankAccount("Mikel", 20000);
    BankAccount b3 = new BankAccount("Abi", 22000);

    List<BankAccount> list1 = new ArrayList<>();
    list1.add(b1);
    list1.add(b2);
    list1.add(b3);

    // the BANK ACCOUNT  class do not implementing the comparable interface. so there is no compareto method ,
    // we can't derectly use collection.sort

    Comparator<BankAccount> comp = new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            if (o1.getBalance() > o2.getBalance()) {
                return 1;
            } else if (o1.getBalance() < o2.getBalance()) {
                return -1;
            } else return 0;
        }

    };

        Collections.sort(list1,comp);

        for (BankAccount r: list1){
            System.out.println(r);
        }
}

}
