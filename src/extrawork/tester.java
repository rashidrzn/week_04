package extrawork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tester {
    public static void main(String[] args) {
        ArrayList<Laptop> lapArray = new ArrayList<>();
        lapArray.add(new Laptop("dell",8,12000));
        lapArray.add(new Laptop("asus",16,14000));
        lapArray.add(new Laptop("apple",4,11000));

        Collections.sort(lapArray);

        for (Laptop p : lapArray)
        {
            System.out.println(p);
        }
    }
}
