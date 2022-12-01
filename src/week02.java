import java.sql.Array;
import java.util.Random;

public class week02 {




    public static void main(String[] args) {
        boolean[] daysIn = new boolean[365];
        int numOfPeople= 0;
        Random random = new Random();

        while (true){
            numOfPeople++;
            int birthday = random.nextInt(364);
            if (daysIn[birthday]==true){
                break;
            }else {
                daysIn[birthday] =true;
            }

        }
        System.out.println("no of people : "+numOfPeople );
//        System.out.println(Arrays.toString(daysIn));
    }
}