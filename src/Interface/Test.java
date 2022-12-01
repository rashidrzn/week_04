package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(33000);
        BankAccount b2=new BankAccount(52000);
        BankAccount b3=new BankAccount(46000);
        BankAccount b4=new BankAccount(58000);
        BankAccount b5=new BankAccount(33000);
        BankAccount b6=new BankAccount(10000);

        List<BankAccount> new1= new ArrayList<BankAccount>();
        new1.add(b1);
        new1.add(b2);
        new1.add(b3);
        new1.add(b4);
        new1.add(b5);
        new1.add(b6);
        Collections.sort(new1);  //


        for (BankAccount b:new1) {
            System.out.println(" "+b.getBalance());
        }


      //  System.out.println( b1.compareTo(b2));;
    }
}
